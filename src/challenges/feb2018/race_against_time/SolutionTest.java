package challenges.feb2018.race_against_time;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void test1() {
    Solution.print("test case 1: ");
    int n = 4;
    int mason_height = 5;
    int[] heights = new int[] {2, 6, 2};
    int[] prices = new int[] {2, 3, 2};
    long actual = Solution.raceAgainstTime(n, mason_height, heights, prices);
    long expected = 8;
    Solution.print("test case 1: actual = " + actual);
    assertEquals(expected, actual);
  }
  
  @Test
  void test2() {
    Solution.print("test case 2: ");
    int n = 4;
    int mason_height = 5;
    int[] heights = new int[] {2, 3, 1};
    int[] prices = new int[] {2, 3, 2};
    long actual = Solution.raceAgainstTime(n, mason_height, heights, prices);
    long expected = 4;
    Solution.print("test case 2: actual = " + actual);
    assertEquals(expected, actual);
  }
  
  @Test
  void test3() {
    Solution.print("test case 3: ");
    int n = 7;
    int mason_height = 5;
    int[] heights = new int[] {2, 3, 1, 4, 3, 6};
    int[] prices = new int[] {2, 3, 2, -1, 5, 1};
    long actual = Solution.raceAgainstTime(n, mason_height, heights, prices);
    long expected = 9;
    Solution.print("test case 3: actual = " + actual);
    assertEquals(expected, actual);
  }
  
  
  
  
  @Test
  void test4() {
    Solution.print("test case 4: ");
    int n = 10;
    int mason_height = 5;
    int[] heights = new int[] {6, 1, 2, 7, 3, 6, 1, 2, 7};
    int[] prices = new int[] {-2, -7, 7, -2, -13, -2, -7, 7, -2};
    long actual = Solution.raceAgainstTime(n, mason_height, heights, prices);
    long expected = 9;
    Solution.print("test case 4: actual = " + actual);
    assertEquals(expected, actual);
  }
  @Test
  void test5() {
    Solution.print("test case 5: ");
    int n = 7;
    int mason_height = 5;
    int[] heights = new int[] {3, 6, 1, 8, 10, 4};
    int[] prices = new int[] {4, 3, -2, 4, 6, 1};
    long actual = Solution.raceAgainstTime(n, mason_height, heights, prices);
    long expected = 25;
    Solution.print("test case 5: actual = " + actual);
    assertEquals(expected, actual);
  }

}
