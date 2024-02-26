package com.example.leetcode;

import com.example.problems.MinimumSizeSubarraySum209;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeetcodeApplication {

  public static void main(String[] args) {
    SpringApplication.run(LeetcodeApplication.class, args);
    MinimumSizeSubarraySum209 removeDuplicatesFromSortedArray26 = new MinimumSizeSubarraySum209();
    removeDuplicatesFromSortedArray26.minSubArrayLen(4, new int[] {1, 4, 4});
  }
}
