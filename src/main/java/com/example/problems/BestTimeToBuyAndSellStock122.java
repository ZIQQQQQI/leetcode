package com.example.problems;

/** */
public class BestTimeToBuyAndSellStock122 {
  public int maxProfit(int[] prices) {
    int min = Integer.MAX_VALUE;
    int currentmMax = 0;
    int max = 0;
    for (int i : prices) {
      if (i < min) {
        min = i;
        max += currentmMax;
      } else if (i - min > currentmMax) {
        currentmMax = i - min;
      }
    }
    max += currentmMax;

    return max;
  }
}
