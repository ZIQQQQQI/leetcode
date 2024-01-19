package com.example.leetcode;

import com.example.problems.JumpGame55;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeetcodeApplication {

  public static void main(String[] args) {
    SpringApplication.run(LeetcodeApplication.class, args);
    JumpGame55 removeDuplicatesFromSortedArray26 = new JumpGame55();
    removeDuplicatesFromSortedArray26.canJump(new int[] {2, 3, 1, 1, 4});
  }
}
