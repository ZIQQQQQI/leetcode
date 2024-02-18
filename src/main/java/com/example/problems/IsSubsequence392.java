package com.example.problems;

/** */
public class IsSubsequence392 {
  public boolean isSubsequence(String s, String t) {
    int tIndex = 0, sIndex = 0;

    while (tIndex <= (t.length() - 1) && sIndex <= (s.length() - 1)) {
      if (t.charAt(tIndex) == s.charAt(sIndex)) {
        sIndex++;
      }
        tIndex++;

    }

    return sIndex == s.length() - 1;
  }
}
