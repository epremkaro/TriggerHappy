package projecteuler.euler001;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;


class SolutionTest {
  
  
  @Test
  public void test01() {
    long actual = Solution.getResult(10);
    long expected = 23;
    assertEquals(expected, actual);
  }
  
  @Test
  public void test02() {
    long actual = Solution.getResult(100);
    long expected = 2318;
    assertEquals(expected, actual);
    
  }
  
  
}
