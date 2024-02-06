package com.example.problems;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/** */
public class RandomizedSet380 {
  Set set;

  public RandomizedSet380() {
    set = new HashSet();
  }

  public boolean insert(int val) {
    return set.add(val);
  }

  public boolean remove(int val) {
    return set.remove(val);
  }

  public int getRandom() {
    Random random = new Random(set.size());
    return (int) set.parallelStream().findAny().get();
  }
}
