package com.example.problems;

/** */
public class BestTimeToBuyAndSellStock121 {
  public int maxProfit(int[] prices) {
    int min = Integer.MAX_VALUE;
    int max = 0;
    for (int i : prices) {
      if (i < min) {
        min = i;
      } else if (i - min > max) {
        max = i - min;
      }
    }

    return max;
  }
}
