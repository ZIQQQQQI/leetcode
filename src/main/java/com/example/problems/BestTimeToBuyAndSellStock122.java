package com.example.problems;

/** */
public class BestTimeToBuyAndSellStock122 {
  public int maxProfit(int[] prices) {
    if (prices.length == 1) return 0;
    int currentMin = prices[0];
    int currentmMax;
    int max = 0;

    for (int i = 1; i < prices.length; i++) {
      if (prices[i] < prices[i - 1]) {
        currentMin = prices[i];
      } else {
        currentmMax = prices[i];
        if (i == prices.length - 1) {
          max += prices[i] - currentMin;
        } else if (prices[i] > prices[i + 1]) {
          max += currentmMax - currentMin;
        }
      }
    }
    return max;
  }
}
