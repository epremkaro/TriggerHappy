package challenges.feb2018.revised_russian_roulette;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void test3nd6() {
    int[] actual = Solution.revisedRussianRoulette(new int[] { 0, 1, 1, 0, 1, 1, 1, 1, 0, 0 });
    int[] expected = new int[] { 3, 6 };
    Assert.assertArrayEquals(expected, actual);
  }

  @Test
  void testAllOneOdd() {
    int[] actual = Solution.revisedRussianRoulette(new int[] { 1, 1, 1, 1, 1, 1, 1 });
    int[] expected = new int[] { 4, 7 };
    Assert.assertArrayEquals(expected, actual);
  }
  
  @Test
  void testAllOneEven() {
    int[] actual = Solution.revisedRussianRoulette(new int[] { 1, 1, 1, 1, 1, 1 });
    int[] expected = new int[] { 3, 6 };
    Assert.assertArrayEquals(expected, actual);
  }
  
  @Test
  void testAllZeroOdd() {
    int[] actual = Solution.revisedRussianRoulette(new int[] { 0, 0, 0, 0, 0 });
    int[] expected = new int[] { 0, 0 };
    Assert.assertArrayEquals(expected, actual);
  }
  
  @Test
  void testAllZeroEven() {
    int[] actual = Solution.revisedRussianRoulette(new int[] { 0, 0, 0, 0, 0, 0 });
    int[] expected = new int[] { 0, 0 };
    Assert.assertArrayEquals(expected, actual);
  }
  
  @Test
  void testFirstIsOne() {
    int[] actual = Solution.revisedRussianRoulette(new int[] { 1, 0, 0, 0, 0 });
    int[] expected = new int[] { 1, 1 };
    Assert.assertArrayEquals(expected, actual);
  }
  
  @Test
  void testLastIsOne() {
    int[] actual = Solution.revisedRussianRoulette(new int[] { 0, 0, 0, 0, 1 });
    int[] expected = new int[] { 1, 1 };
    Assert.assertArrayEquals(expected, actual);
  }
  
  @Test
  void testFirst2AreOne() {
    int[] actual = Solution.revisedRussianRoulette(new int[] { 1, 1, 0, 0, 0 });
    int[] expected = new int[] { 1, 2 };
    Assert.assertArrayEquals(expected, actual);
  }
  
  @Test
  void testFirst3AreOne() {
    int[] actual = Solution.revisedRussianRoulette(new int[] { 1, 1, 1, 0, 0 });
    int[] expected = new int[] { 2, 3 };
    Assert.assertArrayEquals(expected, actual);
  }
  
  @Test
  void testLast2AreOne() {
    int[] actual = Solution.revisedRussianRoulette(new int[] { 0, 0, 0, 1, 1 });
    int[] expected = new int[] { 1, 2 };
    Assert.assertArrayEquals(expected, actual);
  }
  
  @Test
  void testLast3AreOne() {
    int[] actual = Solution.revisedRussianRoulette(new int[] { 0, 0, 1, 1, 1 });
    int[] expected = new int[] { 2, 3 };
    Assert.assertArrayEquals(expected, actual);
  }

}
