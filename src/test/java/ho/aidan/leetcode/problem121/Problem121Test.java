package ho.aidan.leetcode.problem121;

import org.junit.Assert;
import org.junit.Test;

public class Problem121Test {

  @Test
  public void testMaxProfit() {
    int[] prices = { 7, 1, 5, 3, 6, 4 };
    int expected = 5;
    Solution121 solution = new Solution121();
    int result = solution.maxProfit(prices);
    Assert.assertEquals(expected, result);
  }
  
  @Test
  public void testMaxProfit_EmptyArray() {
    int[] prices = {7,6,4,3,1};
    int expected = 0;
    Solution121 solution = new Solution121();
    int result = solution.maxProfit(prices);
    Assert.assertEquals(expected, result);
  }

  @Test
  public void testMaxProfit_SingleElementArray() {
    int[] prices = {1, 2};
    int expected = 1;
    Solution121 solution = new Solution121();
    int result = solution.maxProfit(prices);
    Assert.assertEquals(expected, result);
  }
  
}
