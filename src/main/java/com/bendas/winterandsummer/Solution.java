package com.bendas.winterandsummer;

public class Solution {

  public int solution(int[] T) {

    int minValue = T[0];
    int maxValue = T[0];
    int maxWinterValue = T[0];
    int lastWinterDay = 0;
    for (int i = 1; i < T.length; i++) {
      if (T[i] <= minValue) {
        minValue = T[i];
      }
      if (T[i] >= maxValue) {
        maxValue = T[i];
      }
      if (T[i] <= maxWinterValue) {
        lastWinterDay = i;
        if (maxWinterValue < maxValue) {
          maxWinterValue = maxValue;
        }
      }
    }
    return lastWinterDay + 1;
  }
}
