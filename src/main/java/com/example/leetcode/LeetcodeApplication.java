package com.example.leetcode;

import com.example.problems.BestTimeToBuyAndSellStock122;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeetcodeApplication {

  public static void main(String[] args) {
    SpringApplication.run(LeetcodeApplication.class, args);
    BestTimeToBuyAndSellStock122 removeDuplicatesFromSortedArray26 = new BestTimeToBuyAndSellStock122();
    removeDuplicatesFromSortedArray26.maxProfit(new int[] {1,2,3,4,5});
  }
}
