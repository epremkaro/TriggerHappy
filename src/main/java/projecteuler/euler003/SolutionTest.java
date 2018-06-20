package projecteuler.euler003;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;


class SolutionTest {
  
  
  @Test
  public void test01() {
    long actual = Solution.getResult2(1000000000003L);
    long expected = 1152763;
    System.out.println(actual);
    assertEquals(expected, actual);
  }
  @Test
  public void test02() {
    long actual = Solution.getResult2(10);
    long expected = 5;
    System.out.println(actual);
    assertEquals(expected, actual);
  }
  @Test
  public void test03() {
    long actual = Solution.getResult2(17);
    long expected = 17;
    System.out.println(actual);
    assertEquals(expected, actual);
  }
  
  @Test
  public void test04() {
    long actual = Solution.getResult2(13195);
    long expected = 29;
    System.out.println(actual);
    assertEquals(expected, actual);
  }
  
  @Test
  public void test05() {
    long actual = Solution.getResult2(9);
    long expected = 3;
    System.out.println(actual);
    assertEquals(expected, actual);
  }
  
  @Test
  public void test06() {
    long actual = Solution.getResult2(18);
    long expected = 3;
    System.out.println(actual);
    assertEquals(expected, actual);
  }
  
  @Test
  public void test07() {
    long actual = Solution.getResult2(25);
    long expected = 5;
    System.out.println(actual);
    assertEquals(expected, actual);
  }
  
  @Test
  public void test08() {
    long actual = Solution.getResult2(29);
    long expected = 29;
    System.out.println(actual);
    assertEquals(expected, actual);
  }
  
  @Test
  public void test09() {
    long actual = Solution.getResult2(187);
    long expected = 17;
    System.out.println(actual);
    assertEquals(expected, actual);
  }
  
  
}
