package challenges.feb2018.give_check;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void testOne() {
    char[][] board = new char[][] {
      {'#','#','#','#','#','#','#','#'},
      {'#','k','#','P','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','K','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    int expected = 1;
    assertEquals(expected, actual);
  }
  
  @Test
  void testTwo() {
    char[][] board = new char[][] {
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','P','#'},
      {'#','#','#','#','k','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','K','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    int expected = 2;
    assertEquals(expected, actual);
  }
  
  @Test
  void test3() {
    char[][] board = new char[][] {
      {'b','b','b','b','#','#','b','#'},
      {'#','P','P','#','#','#','P','P'},
      {'#','#','#','#','k','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','K','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    int expected = 0;
    assertEquals(expected, actual);
  }
  
  @Test
  void test4() {
    char[][] board = new char[][] {
      {'b','b','b','b','#','#','b','#'},
      {'#','P','P','#','#','#','P','P'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','K','#','#','#'},
      {'k','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    int expected = 0;
    assertEquals(expected, actual);
  }
  
  
  @Test
  void test5() {
    char[][] board = new char[][] {
      {'b','b','b','b','#','#','b','#'},
      {'#','P','P','#','#','#','P','P'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','K','#','#','#'},
      {'#','#','#','#','#','#','#','k'},
    };
    int actual = Solution.waysToGiveACheck(board);
    int expected = 2;
    assertEquals(expected, actual);
  }
  
  @Test
  void test6() {
    char[][] board = new char[][] {
      {'b','b','b','b','#','#','b','#'},
      {'#','P','P','#','#','#','P','P'},
      {'#','#','#','#','#','#','k','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','K','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    int expected = 1;
    assertEquals(expected, actual);
  }
  
  @Test
  void test7() {
    char[][] board = new char[][] {
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','P','#','#','#','#'},
      {'#','k','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','K','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    int expected = 2;
    assertEquals(expected, actual);
  }
  
  
  @Test
  void test8() {
    char[][] board = new char[][] {
      {'#','#','#','#','#','#','b','#'},
      {'#','#','#','P','#','P','P','#'},
      {'#','#','#','#','#','P','#','#'},
      {'#','#','#','#','#','#','k','#'},
      {'#','#','#','#','#','#','#','P'},
      {'#','#','#','#','#','#','#','#'},
      {'#','K','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    int expected = 0;
    assertEquals(expected, actual);
  }
  
  @Test
  void test9() {
    System.out.println("9:");
    char[][] board = new char[][] {
      {'#','#','#','#','#','#','#','#'},
      {'#','Q','#','P','#','#','k','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','P'},
      {'#','#','#','#','#','#','#','#'},
      {'#','K','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    int expected = 1;
    assertEquals(expected, actual);
  }
  
  @Test
  void test10() {
    char[][] board = new char[][] {
      {'#','#','#','#','Q','#','#','#'},
      {'#','#','#','P','#','#','#','#'},
      {'#','#','k','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','P'},
      {'#','#','#','#','#','#','#','#'},
      {'#','K','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    System.out.println("actual = " + actual);
    int expected = 2;
    assertEquals(expected, actual);
  }
  
  @Test
  void test11() {
    char[][] board = new char[][] {
      {'#','#','#','#','Q','#','#','#'},
      {'#','#','#','P','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','B','#','#','#','#','#','#'},
      {'k','#','#','#','#','#','#','P'},
      {'#','#','#','#','#','#','#','#'},
      {'#','K','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    System.out.println("actual = " + actual);
    int expected = 0;
    assertEquals(expected, actual);
  }
  
  
  @Test
  void test12() {
    char[][] board = new char[][] {
      {'#','#','#','Q','#','#','#','#'},
      {'#','#','#','P','P','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','B','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','k'},
      {'#','#','#','#','#','#','#','#'},
      {'#','K','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    System.out.println("actual = " + actual);
    int expected = 1;
    assertEquals(expected, actual);
  }
  
  @Test
  void test13() {
    char[][] board = new char[][] {
      {'#','#','#','Q','#','#','#','#'},
      {'#','#','#','P','P','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','B','#','#','#','#','P','#'},
      {'#','#','#','#','#','#','#','k'},
      {'#','#','#','#','#','#','#','#'},
      {'#','K','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    System.out.println("actual = " + actual);
    int expected = 0;
    assertEquals(expected, actual);
  }
  
  @Test
  void test14() {
    char[][] board = new char[][] {
      {'#','#','#','k','#','#','#','#'},
      {'#','#','#','P','P','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','B','#','#','#','#','Q','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','K','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    System.out.println("actual = " + actual);
    int expected = 3;
    assertEquals(expected, actual);
  }
  
  @Test
  void test15() {
    System.out.println("15");
    char[][] board = new char[][] {
      {'#','#','#','k','#','#','#','#'},
      {'#','#','#','P','P','Q','#','#'},
      {'#','#','#','#','#','B','#','#'},
      {'#','B','#','#','#','#','Q','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','K','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    System.out.println("actual = " + actual);
    int expected = 3;
    assertEquals(expected, actual);
  }
  
  @Test
  void test16() {
    System.out.println("15");
    char[][] board = new char[][] {
      {'#','#','#','k','#','#','#','#'},
      {'#','#','#','P','P','Q','#','#'},
      {'#','#','#','#','#','P','#','#'},
      {'#','B','#','#','#','#','Q','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','K','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    System.out.println("actual = " + actual);
    int expected = 2;
    assertEquals(expected, actual);
  }
  
  @Test
  void test17() {
    System.out.println("15");
    char[][] board = new char[][] {
      {'#','#','#','b','#','k','#','#'},
      {'#','#','#','P','P','Q','#','#'},
      {'#','#','#','#','#','P','#','#'},
      {'#','B','Q','#','#','#','Q','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','K','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    System.out.println("actual = " + actual);
    int expected = 3;
    assertEquals(expected, actual);
  }
  
  
  @Test
  void test18() {
    System.out.println("15");
    char[][] board = new char[][] {
      {'#','#','#','b','#','k','#','#'},
      {'#','#','#','P','P','Q','#','#'},
      {'#','#','#','b','#','P','#','#'},
      {'#','B','Q','#','#','#','Q','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','K','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    System.out.println("actual = " + actual);
    int expected = 2;
    assertEquals(expected, actual);
  }
  
  
  @Test
  void test19() {
    System.out.println("15");
    char[][] board = new char[][] {
      {'#','#','#','b','#','k','#','#'},
      {'#','#','#','P','P','Q','#','#'},
      {'#','#','#','#','#','P','#','#'},
      {'#','B','B','#','#','#','Q','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','K','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    System.out.println("actual = " + actual);
    int expected = 3;
    assertEquals(expected, actual);
  }
  
  @Test
  void test20() {
    System.out.println("20");
    char[][] board = new char[][] {
      {'#','#','#','b','#','k','b','#'},
      {'#','K','#','P','P','#','q','P'},
      {'#','#','#','#','#','P','#','#'},
      {'#','B','B','#','#','#','Q','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
      {'#','#','#','#','#','#','#','#'},
    };
    int actual = Solution.waysToGiveACheck(board);
    System.out.println("actual = " + actual);
    int expected = 2;
    assertEquals(expected, actual);
  }
  

}
