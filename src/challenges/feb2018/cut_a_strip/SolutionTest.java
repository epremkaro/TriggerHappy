package challenges.feb2018.cut_a_strip;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void test1() {
    Solution.println("test case 1: ");
    int[][] A = {
        {1, 2},
        {3, 4},
        {5, 6}
    };
    long actual = Solution.cutAStrip(A, 1);
    long expected = 20;
    Solution.println("test case 1: actual = " + actual);
    assertEquals(expected, actual);
  }
  
  @Test
  void test2() {
    Solution.println("test case 11: ");
    int[][] A = {
        {1, -3, 4, -5},
        {2, 1, -7, -2}
    };
    long actual = Solution.cutAStrip(A, 2);
    long expected = 5;
    Solution.println("test case 11: actual = " + actual);
    assertEquals(expected, actual);
  }
  @Test
  void test3() {
    Solution.println("test case 111: ");
    int[][] A = {
        {-10, 1, 1, 1},
        {-10, 1, -1, 1},
        {-10, 1, 1, 1}
    };
    long actual = Solution.cutAStrip(A, 3);
    long expected = 8;
    Solution.println("test case 111: actual = " + actual);
    assertEquals(expected, actual);
  }
  @Test
  void test4() {
    Solution.println("test case 4: ");
    int[][] A = {
        {-1000, 1, 10, 1, -100},
        {-1000, 1, 10, 1, 100},
        {-1000, 1, -5, 1, -100},
        {-1000, 1, 10, 1, 100},
        {-1000, 1, 10, 1, -100}
    };
    
    Solution.findMaxSubMatrix(A, 3, false);
    long actual = Solution.cutAStrip(A, 3);
//    int actual = 0;
    int expected = 225;
    Solution.println("test case 4: actual = " + actual);
    assertEquals(expected, actual);
  }
  @Test
  void test5() {
    Solution.println("test case 5: ");
    int[][] A = {
        {-1, 10, 1, 100},
        {-1, -5, -1, -100},
        {-1, 10, 1, 100}
    };
    
    Solution.findMaxSubMatrix(A, 3, false);
    long actual = Solution.cutAStrip(A, 4);
//    int actual = 0;
    int expected = 222;
    Solution.println("test case 5: actual = " + actual);
    assertEquals(expected, actual);
  }
  
  @Test
  void test6() {
    Solution.println("test case 6: ");
    int[][] A = {
        {-1, 100,     100, 100},
        {-1, -500,    100, -100},
        {-1, 100000,  100, 100},
        {-1, -1000,   100, 100},
    };
    
    Solution.findMaxSubMatrix(A, 3, false);
    long actual = Solution.cutAStrip(A, 4);
//    int actual = 0;
    int expected = 100700;
    Solution.println("test case 6: actual = " + actual);
    assertEquals(expected, actual);
  }
  
  
  
}
