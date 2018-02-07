package challenges.feb2018.give_check;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

  private static char[][] b;
  private static int[] king;
  private static int[] pawnInit;

  static boolean isRightPawn(int row, int col) {
    int[][] ddd = new int[][] { { -1, 0 } };
    for (int[] d : ddd) {
      if (isOnBoard(row + d[0], col + d[1])) {
        if (b[row + d[0]][col + d[1]] != '#') {
          return false;
        }
      }
    }
    print("true >> ");
    
    return isPossibleMove(row, col);
  }

  private static boolean isOnBoard(int i, int j) {
    if (i < 0 || i > 7 || j < 0 || j > 7) {
      return false;
    }
    return true;
  }

  private static boolean isKing(int i, int j) {
    if (isOnBoard(i, j) && b[i][j] == 'k') {
      if (king == null) { 
        king = new int[] {i, j};
      }
      return true;
    }

    return false;
  }

  static boolean isQueen(int row, int col) {
    int[][] ddd = new int[][] { { 0, -1 }, { 1, -1 }, {1, 0}, {1, 1}, {0, 1}};
    for (int[] d : ddd) {
      int i = row + d[0], j = col + d[1];
      while (isOnBoard(i, j)) {
        if (b[i][j] == '#') {
          i += d[0];
          j += d[1];
          continue;
        }
        if (isKing(i, j)) {
          return true;
        }else {
          break;
        }
      }
    }
    return false;
  }

  static boolean isRook(int row, int col) {
    int[][] ddd = new int[][] { { 0, -1 }, { 1, 0 }, { 0, 1 } };
    for (int[] d : ddd) {
      int i = row + d[0], j = col + d[1];
      while (isOnBoard(i, j)) {
        if (b[i][j] == '#') {
          i += d[0];
          j += d[1];
          continue;
        }
        if (isKing(i, j)) {
          return true;
        }else {
          break;
        }
      }
    }
    return false;
  }

  static boolean isBishop(int row, int col) {
    int[][] ddd = new int[][] { { 1, -1 }, { 1, 1 } };
    for (int[] d : ddd) {
      int i = row + d[0], j = col + d[1];
      while (isOnBoard(i, j)) {
        if (b[i][j] == '#') {
          i += d[0];
          j += d[1];
          continue;
        }
        if (isKing(i, j)) {
          return true;
        }else {
          break;
        }
      }
    }
    return false;
  }

  static boolean isKnight(int row, int col) {
    int[][] ddd = new int[][] { { 1, -2 }, { 2, -1 }, { 2, 1 }, { 1, 2 } };
    for (int[] d : ddd) {
      if (isKing(row + d[0], col + d[1])) {
        return true;
      }
    }
    return false;
  }
  
  private static int[] findKing(char king) {
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        if (b[i][j] == king) {
          return new int[] {i, j};
        }
      }
    }
    
    return null;
  }
  
  private static int getKingCheckCount() {
    int checkSum = 0;
    if (king == null)
      king = findKing('k');
    // if on the same row on the left side
    if (king[0] == pawnInit[0] && king[1] < pawnInit[1]) {
      for (int i = pawnInit[1] + 1; i < 8; i++) {
        char cellRank = b[1][i];
        if (cellRank == 'Q' || cellRank == 'R') {
          boolean isCleanBetween = true;
          for (int j = king[1] + 1; j < i; j++) {
            if (b[1][j] != '#') {
              isCleanBetween = false;
              break;
            }
          }
          if (isCleanBetween) {
            checkSum++;
          }
        }
      }
    }
    //if on the same row on the right side
    else if (king[0] == pawnInit[0] && king[1] > pawnInit[1]) {
      for (int i = pawnInit[1] - 1; i >= 0; i--) {
        char cellRank = b[1][i];
        if (cellRank == 'Q' || cellRank == 'R') {
          boolean isCleanBetween = true;
          for (int j = king[1] - 1; j > i; j--) {
            if (b[1][j] != '#') {
              isCleanBetween = false;
              break;
            }
          }
          if (isCleanBetween) {
            checkSum++;
          }
        }
      }
    }
    /*
    //if on the bottom on the same column
    else if (king[0] > pawnInit[0] && king[1] == pawnInit[1]) {
      for (int i = pawnInit[0] + 1; i < 8; i++) {
        char cellRank = b[i][pawnInit[1]];
        if (cellRank == '#')
          continue;
        if (cellRank == 'k') {
          checkSum++;
        }
      }
    }
    */
    //if on the left bottom diagonal
    else if (king[0] > pawnInit[0] && king[1] < pawnInit[1]) {
      if (isOnBoard(0, pawnInit[1] + 1) && (b[0][pawnInit[1] + 1] == 'Q' || b[0][pawnInit[1] + 1] == 'B')) {
        int i = pawnInit[0], j = pawnInit[1];
        while (isOnBoard(i, j)) {
          if (b[i][j] != '#') {
            if (b[i][j] == 'k') {
              checkSum++;
            }
            break;
          }
          i++;
          j--;
        }
      }
    }
    //if on the right bottom diagonal
    else if (king[0] > pawnInit[0] && king[1] > pawnInit[1]) {
      if (isOnBoard(0, pawnInit[1] - 1) && (b[0][pawnInit[1] - 1] == 'Q' || b[0][pawnInit[1] - 1] == 'B')) {
        int i = pawnInit[0], j = pawnInit[1];
        while (isOnBoard(i, j)) {
          if (b[i][j] != '#') {
            if (b[i][j] == 'k') {
              checkSum++;
            }
            break;
          }
          i++;
          j++;
        }
      }
    }
    //if on the left top diagonal
    else if (king[0] == 0 && king[1] == pawnInit[1] - 1) {
      int i = pawnInit[0], j = pawnInit[1];
      while (isOnBoard(i, j)) {
        if (b[i][j] != '#') {
          if (b[i][j] == 'Q' || b[i][j] == 'B') {
            checkSum++;
          }
          break;
        }
        i++;
        j++;
      }
    }
    //if on the right top diagonal
    else if (king[0] == 0 && king[1] == pawnInit[1] + 1) {
      int i = pawnInit[0], j = pawnInit[1];
      while (isOnBoard(i, j)) {
        if (b[i][j] != '#') {
          if (b[i][j] == 'Q' || b[i][j] == 'B') {
            checkSum++;
          }
          break;
        }
        i++;
        j--;
      }
    }
    
    
    return checkSum;
  }
  
  
  static boolean isPossibleMove(int row, int col) {
    int checkSum = 0;
    int[] whiteKing = findKing('K');
    print("white king [" + whiteKing[0] + "][" + whiteKing[1] + "]");
    print("pawn [" + row + "][" + col + "]");
    // if on the same row on the left side
    if (whiteKing[0] == row && whiteKing[1] < col) {
      print("1");
      for (int i = whiteKing[1] + 1; i < 8; i++) {
        char cellRank = b[1][i];
        if (i == col)
          continue;
        
        if (cellRank == 'q' || cellRank == 'r') {
          boolean isCleanBetween = true;
          for (int j = whiteKing[1] + 1; j < i; j++) {
            if (j != col && b[1][j] != '#') {
              isCleanBetween = false;
              break;
            }
          }
          if (isCleanBetween) {
            checkSum++;
          }
        }else if (cellRank != '#') {
          break;
        }
      }
    }
    //if on the same row on the right side
    else if (whiteKing[0] == row && whiteKing[1] > col) {
      print("2");
      for (int i = whiteKing[1] - 1; i >= 0; i--) {
        char cellRank = b[1][i];
        if (i == col)
          continue;
        
        if (cellRank == 'q' || cellRank == 'r') {
          boolean isCleanBetween = true;
          for (int j = whiteKing[1] - 1; j > i; j--) {
            if (j != col && b[1][j] != '#') {
              isCleanBetween = false;
              break;
            }
          }
          if (isCleanBetween) {
            checkSum++;
          }
        }else if (cellRank != '#') {
          break;
        }
      }
    }
    //if on the left bottom diagonal
    else if (whiteKing[0] > row && whiteKing[1] < col) {
      print("3");
      if (isOnBoard(0, col + 1) && (b[0][col + 1] == 'q' || b[0][col + 1] == 'b')) {
        int i = row + 1, j = col - 1;
        while (isOnBoard(i, j)) {
          if (b[i][j] != '#') {
            if (b[i][j] == 'K') {
              checkSum++;
            }
            break;
          }
          i++;
          j--;
        }
      }
    }
    //if on the right bottom diagonal
    else if (whiteKing[0] > row && whiteKing[1] > col) {
      print("4");
      if (isOnBoard(0, col - 1) && (b[0][col - 1] == 'q' || b[0][col - 1] == 'b')) {
        int i = row + 1, j = col + 1;
        while (isOnBoard(i, j)) {
          if (b[i][j] != '#') {
            if (b[i][j] == 'K') {
              checkSum++;
            }
            break;
          }
          i++;
          j++;
        }
      }
    }
    //if on the left top diagonal
    else if (whiteKing[0] == 0 && whiteKing[1] == col - 1) {
      print("5");
      int i = row + 1, j = col + 1;
      while (isOnBoard(i, j)) {
        if (b[i][j] != '#') {
          if (b[i][j] == 'q' || b[i][j] == 'b') {
            checkSum++;
          }
          break;
        }
        i++;
        j++;
      }
    }
    //if on the right top diagonal
    else if (whiteKing[0] == 0 && whiteKing[1] == col + 1) {
      print("6");
      int i = row + 1, j = col - 1;
      while (isOnBoard(i, j)) {
        if (b[i][j] != '#') {
          if (b[i][j] == 'q' || b[i][j] == 'b') {
            checkSum++;
          }
          break;
        }
        i++;
        j--;
      }
    }
    
    
    if (checkSum > 0) {
      print(">>>> pawn["+row+"]["+col+"] is not right pawn");
      return false;
    }else {
      print(">>>> pawn["+row+"]["+col+"] is right pawn");
    }
    
    return true;
  }


 

  static int waysToGiveACheck(char[][] board) {
    int res = 0;
    king = null;
    b = board;
    int row = 1;
    for (int col = 0; col < 8; col++) {
      if (board[row][col] == 'P' && isRightPawn(row, col)) {
        b[1][col] = '#';
        b[0][col] = '$';
        
        if (isQueen(0, col))
          res++;

        if (isRook(0, col))
          res++;

        if (isBishop(0, col))
          res++;

        if (isKnight(0, col))
          res++;

        
        pawnInit = new int[] {1, col};
        int vskrytyCheck = getKingCheckCount();
        
        if (vskrytyCheck > 0)
          res = 4;
//        res += vskrytyCheck * 4;
        break;
      }
    }
    
    
    return res;
  }

  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();
    for (int a0 = 0; a0 < t; a0++) {
      char[][] board = new char[8][8];
      for (int board_i = 0; board_i < 8; board_i++) {
        String line = in.next();
        for (int board_j = 0; board_j < 8; board_j++) {
          board[board_i][board_j] = line.charAt(board_j);
        }
      }
      int result = waysToGiveACheck(board);
      System.out.println(result);
    }
    in.close();
  }
  
  
  static void print(String msg) {
    if (true)
      System.out.println(msg);
  }
}
