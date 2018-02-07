package challenges.feb2018.give_check;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void test1() {
    Solution.print("test case 1: ");
    char[][] board = new char[][] {
      {'#','#','#','#','#','#','#','#'},
      {'#','k','#','P','#','R','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','K','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    int expected = 4;
    Solution.print("test case 1: actual = " + actual);
    assertEquals(expected, actual);
  }
  
  
  @Test
  void test2() {
    Solution.print("test case 2: ");
    char[][] board = new char[][] {
      {'#','#','#','#','#','#','#','#'},
      {'#','k','#','P','b','R','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','K','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    int expected = 1;
    Solution.print("test case 2: actual = " + actual);
    assertEquals(expected, actual);
  }
  
  @Test
  void test3() {
    Solution.print("test case 3: ");
    char[][] board = new char[][] {
      {'#','#','#','#','Q','#','b','#'},
      {'q','#','#','P','#','#','P','K'},
      {'#','#','b','#','#','#','#','#'},
      {'#','k','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    int expected = 0;
    Solution.print("test case 3: actual = " + actual);
    assertEquals(expected, actual);
  }
  
  @Test
  void test4() {
    Solution.print("test case 4: ");
    char[][] board = new char[][] {
      {'#','#','#','#','#','#','B','#'},
      {'#','K','#','P','q','P','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','k','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    int expected = 4;
    Solution.print("test case 4: actual = " + actual);
    assertEquals(expected, actual);
  }
  
  @Test
  void test5() {
    Solution.print("test case 5: ");
    char[][] board = new char[][] {
      {'b','#','#','#','#','#','#','#'},
      {'P','#','#','#','#','#','#','P'},
      {'#','#','#','#','#','#','#','#'},
      {'#','P','#','#','#','#','#','#'},
      {'K','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','k'},
    };
    int actual = Solution.waysToGiveACheck(board);
    int expected = 2;
    Solution.print("test case 5: actual = " + actual);
    assertEquals(expected, actual);
  }
  

}
