package com.example.leetcode;

import com.example.problems.RotateArray189;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeetcodeApplication {

  public static void main(String[] args) {
    SpringApplication.run(LeetcodeApplication.class, args);
    RotateArray189 removeDuplicatesFromSortedArray26 = new RotateArray189();
    removeDuplicatesFromSortedArray26.rotate(new int[] {1, 2}, 2);
  }
}
