package ho.aidan.leetcode.problem215;

import org.junit.Assert;
import org.junit.Test;

public class Problem215Test {

  @Test
  public void testFindKthLargest() {
    int[] nums = {3, 2, 1, 5, 6, 4};
    int k = 2;
    int expected = 5;
    int result = Solution215.findKthLargest(nums, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void testFindKthLargest_EmptyArray() {
    int[] nums = {};
    int k = 1;
    int expected = -1; // or any other appropriate value to indicate an empty array
    int result = Solution215.findKthLargest(nums, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void testFindKthLargest_SingleElementArray() {
    int[] nums = {7};
    int k = 1;
    int expected = 7;
    int result = Solution215.findKthLargest(nums, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void testFindKthLargest_Example1() {
    int[] nums = {3, 2, 1, 5, 6, 4};
    int k = 2;
    int expected = 5;
    int result = Solution215.findKthLargest(nums, k);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void testFindKthLargest_Example2() {
    int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
    int k = 4;
    int expected = 4;
    int result = Solution215.findKthLargest(nums, k);
    Assert.assertEquals(expected, result);
  }

}