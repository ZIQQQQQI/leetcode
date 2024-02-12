package com.example.problems;

import java.util.Locale;

/** */
public class IsPalindrome125 {
  public boolean isPalindrome(String s) {
    s = s.toLowerCase(Locale.ROOT).replaceAll("[^a-z0-9]", "");
    for (int i = 0; i < s.length() / 2; i++) {
      if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
        return false;
      }
    }
    return true;
  }
}
