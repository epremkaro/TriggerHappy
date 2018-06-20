package challenges.feb2018.acid_naming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void testNonMetalacid1() {
    String nonMetalAcid = Solution.acidNaming("hydrochloric");
    String result = "non-metal acid";
    assertEquals(result, nonMetalAcid);
  }
  
  @Test
  void testNonMetalacid2() {
    String nonMetalAcid = Solution.acidNaming("hydroic");
    String result = "non-metal acid";
    assertEquals(result, nonMetalAcid);
  }
  
  @Test
  void testPolyatomic () {
    String nonMetalAcid = Solution.acidNaming("rainbowic");
    String result = "polyatomic acid";
    assertEquals(result, nonMetalAcid);
  }
  
  @Test
  void testNothing () {
    String nonMetalAcid = Solution.acidNaming("idontevenknow");
    String result = "not an acid";
    assertEquals(result, nonMetalAcid);
  }
  
  @Test
  void testEmptyString () {
    String nonMetalAcid = Solution.acidNaming("");
    String result = "not an acid";
    assertEquals(result, nonMetalAcid);
  }
  
  @Test
  void testStartingWithHydroButNotEndingWithIc () {
    String nonMetalAcid = Solution.acidNaming("hydrochloricc");
    String result = "not an acid";
    assertEquals(result, nonMetalAcid);
  }

}
