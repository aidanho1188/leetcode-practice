package ho.aidan.leetcode.problem1768;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem1768Test {

  @Test
  public void testMergeStrings_Example1() {
    String word1 = "abc";
    String word2 = "pqr";
    String expected = "apbqcr";
    String result = Solution1768.mergeAltenately(word1, word2);
    assertEquals(expected, result);
  }

  @Test
  public void testMergeStrings_Example2() {
    String word1 = "ab";
    String word2 = "pqrs";
    String expected = "apbqrs";
    String result = Solution1768.mergeAltenately(word1, word2);
    assertEquals(expected, result);
  }

  @Test
  public void testMergeStrings_Example3() {
    String word1 = "abcd";
    String word2 = "pq";
    String expected = "apbqcd";
    String result = Solution1768.mergeAltenately(word1, word2);
    assertEquals(expected, result);
  }
  
  @Test
  public void testMergeStrings_Custom() {
    String word1 = "fb";
    String word2 = "ce";
    String expected = "fcbe";
    String result = Solution1768.mergeAltenately(word1, word2);
    assertEquals(expected, result);
  }
}
