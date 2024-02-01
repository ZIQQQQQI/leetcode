package com.example.leetcode;

import com.example.problems.JumpGame45;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeetcodeApplication {

  public static void main(String[] args) {
    SpringApplication.run(LeetcodeApplication.class, args);
    JumpGame45 removeDuplicatesFromSortedArray26 = new JumpGame45();
    removeDuplicatesFromSortedArray26.canJump(new int[] {2, 3, 0, 1, 4});
  }
}
