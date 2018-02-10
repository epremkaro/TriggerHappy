package challenges.feb2018.cut_a_strip;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  private static int[][] original;

  static int cutAStrip(int[][] A, int k) {
    // Complete this function
    println("Start MODE 1:");
    original = deepCopy(A);
    if (isNoMinus(A)) {
      return getSum(A, new int[] { 0, 0 }, A.length, A[0].length);
    }
    
    findMinSubMatrix(A, k);

    int max = findMaxSubMatrix(A, k, false);
    println("Start MODE 2:");
    int max2 = findMaxSubMatrix(original, k, true);
    
    printMatrix(A);
    findMinSubMatrix(A, k);
    println("replaced min:");
    printMatrix(A);
    int max3 = findMaxSubMatrix(A, k, false);
    println("MAX1 = " +  max);
    println("MAX2 = " +  max2);
    println("MAX3 = " +  max3);
    

    return Math.max(max, Math.max(max2, max3));
  }

  public static int[][] deepCopy(int[][] original) {
    if (original == null) {
        return null;
    }

    final int[][] result = new int[original.length][];
    for (int i = 0; i < original.length; i++) {
        result[i] = Arrays.copyOf(original[i], original[i].length);
        // For Java versions prior to Java 6 use the next:
        // System.arraycopy(original[i], 0, result[i], 0, original[i].length);
    }
    return result;
}

  public static int findMaxSubMatrix(int[][] a, int k, boolean isMinNeedToFind) {
    int cols = a[0].length;
    int rows = a.length;
    int[] slider;
    int maxSum = Integer.MIN_VALUE;
    int n1 = 0, m1 = 0;
    int n2 = 0, m2 = 0;

    for (int leftCol = 0; leftCol < cols; leftCol++) {
      int[] tmp = new int[rows];

      for (int rightCol = leftCol; rightCol < cols; rightCol++) {

        for (int i = 0; i < rows; i++) {
          tmp[i] += a[i][rightCol];
        }
        slider = kadaneMax(tmp);
        if (slider[0] > maxSum) {
          maxSum = slider[0];
          m1 = leftCol;
          n1 = slider[1];
          m2 = rightCol;
          n2 = slider[2];
        }
      }
    }
    if (isMinNeedToFind) {
      println("MaxSum2: " + maxSum + ", range: [" + n1 + ", " + m1 + "][" + n2 + ", " + m2 + "]");
//      println("Maximal matrix from mode 2: ");
      
//      printMatrix(a);
    }
    else
      println("MaxSum1: " + maxSum + ", range: [" + n1 + ", " + m1 + "][" + n2 + ", " + m2 + "]");
      
    
    if (isMinNeedToFind) {
      //create new matrix and find min within then subtract it from maxSum
//      int 
      
      int[][] newM = new int[n2-n1 + 1][m2-m1+1];
      
      for (int i = 0; i <= n2-n1; i++) {
        for (int j = 0; j <= m2-m1; j++) {
          newM[i][j] = a[n1 + i][m1 + j];
        }
      }
      println("New matrix created from the max sub array, accordingly to the mode @ 2:");
      printMatrix(newM);
      int mm = findMinSubMatrix(newM, k);
      
      if (mm > 0 && (newM.length < a.length || newM[0].length < a[0].length))
        mm = 0;
      
      return maxSum - mm;
      
    }

    return maxSum;
  }
  

  public static int findMinSubMatrix(int[][] a, int max) {
    int cols = a[0].length;
    int rows = a.length;
    int[] slider;
    int minSum = Integer.MAX_VALUE;
    int n1 = 0, m1 = 0;
    int n2 = 0, m2 = 0;
    int res = 0;

    for (int leftCol = 0; leftCol < cols; leftCol++) {
      int[] tmp = new int[rows];

      for (int rightCol = leftCol; rightCol < cols; rightCol++) {

        for (int i = 0; i < rows; i++) {
          tmp[i] += a[i][rightCol];
        }
        slider = kadaneMin(tmp);
        if (slider[0] < minSum) {
          minSum = slider[0];
          m1 = leftCol;
          n1 = slider[1];
          m2 = rightCol;
          n2 = slider[2];
        }
      }
    }
    println("MinSum1: " + minSum + ", range: [" + n1 + ", " + m1 + "][" + n2 + ", " + m2 + "]");
    int deltaSum = 0;
    int start = (n1 == n2) ? m1 : n1;
    int end = (n1 == n2) ? m2 : n2;
    boolean isOverload = false;
    if (Math.abs(n1 - n2) >= max || Math.abs(m1 - m2) >= max) {
      isOverload = true;
      while(end - start >= max){
        //if row
        if (n1 == n2) {
          if (a[n1][start] >= a[n1][end]) {
            deltaSum += a[n1][start];
            start++;
          }else {
            deltaSum += a[n1][end];
            end--;
          }
        }else {
          if (a[start][m1] >= a[end][m1]) {
            deltaSum += a[start][m1];
            start++;
          }else {
            deltaSum += a[end][m1];
            end--;
          }
        }
      }
      print("deltaSum = " + deltaSum);
    }

    println("Original matrix from mode 2 before replace of min values:");
    printMatrix(a);
    for (int i = start; i <= end; i++) {
      if (n1 == n2) {
        res += a[n1][i];
        a[n1][i] = 0;
      } else {
        res += a[i][m1];
        a[i][m1] = 0;
      }
    }
    println("Matrix from mode 2 after replace of min:");
    printMatrix(a);
    /*
    if (isOverload) {
      print("MinSum2 = " + (minSum));
      if (n1 == n2) {
        print(">coord [" + n1 + ", " + start + "][" + n2 + ", " + end + "]");
        for (int i = start; i <= end; i++) {
              a[n1][i] = 0;
        }
      }else {
        print(">coord [" + start + ", " + m1 + "][" + end + ", " + m2 + "]");
        for (int i = start; i <= end; i++) {
              a[i][m1] = 0;
        }
      }
    }else {
      for (int i = start; i <= end; i++) {
        if (n1 == n2) {
            a[n1][i] = 0;
        }else {
            a[i][m1] = 0;
        }
      }
    }*/
    println("===================");
    println("res = " + res);
    println("===================");
    

    return res;
  }

  public static int[] kadaneMax(int[] a) {
    int[] result = new int[] { Integer.MIN_VALUE, 0, -1 };
    int curSum = 0;
    int localStart = 0;

    for (int i = 0; i < a.length; i++) {
      curSum += a[i];
      if (curSum < 0) {
        curSum = 0;
        localStart = i + 1;
      } else if (curSum > result[0]) {
        result[0] = curSum;
        result[1] = localStart;
        result[2] = i;
      }
    }

    // all numbers in a are negative
    if (result[2] == -1) {
      result[0] = 0;
      for (int i = 0; i < a.length; i++) {
        if (a[i] > result[0]) {
          result[0] = a[i];
          result[1] = i;
          result[2] = i;
        }
      }
    }

    return result;
  }

  public static int[] kadaneMin(int[] a) {
    int[] result = new int[] { Integer.MAX_VALUE, 0, -1 };
    int curSum = 0;
    int localStart = 0;

    for (int i = 0; i < a.length; i++) {
      curSum += a[i];
      if (curSum > 0) {
        curSum = 0;
        localStart = i + 1;
      } else if (curSum < result[0]) {

        result[0] = curSum;
        result[1] = localStart;
        result[2] = i;
      }
    }

    // all numbers in a are positive
    if (result[2] == -1) {
      result[0] = Integer.MAX_VALUE;
      for (int i = 0; i < a.length; i++) {
        if (a[i] < result[0]) {
          result[0] = a[i];
          result[1] = i;
          result[2] = i;
        }
      }
    }

    return result;
  }

  private static int getSum(int[][] a, int[] is, int n, int m) {
    int sum = 0;
    int min = Integer.MAX_VALUE;
    for (int i = is[0]; i < n; i++) {
      for (int j = is[1]; j < m; j++) {
        min = Math.min(min, a[i][j]);
        sum += a[i][j];
      }
    }
    return sum - min;
  }

  private static boolean isNoMinus(int[][] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        if (a[i][j] < 0)
          return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int k = in.nextInt();
    int[][] A = new int[n][m];
    for (int A_i = 0; A_i < n; A_i++) {
      for (int A_j = 0; A_j < m; A_j++) {
        A[A_i][A_j] = in.nextInt();
      }
    }
    int result = cutAStrip(A, k);
    System.out.println(result);
    in.close();
  }
  
  private static void printMatrix(int[][] a) {
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        print(a[i][j] + "\t");
      }
      println("");
    }
  }

  static void println(String msg) {
    if (true)
      System.out.println(msg);
  }
  
  static void print(String msg) {
    if (true)
      System.out.print(msg);
  }
}
