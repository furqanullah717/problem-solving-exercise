package com.furqan.codility.exercise.maxcounter;

import java.util.Arrays;

public class MaxCounter {

        public int[] solution(int N, int[] A) {
            int[] counters = new int[N];
            int maxValue = 0;
            for (int j : A) {
                if (j <= N) {
                    int val = ++(counters[j - 1]);
                    if (maxValue < val)
                        maxValue = val;
                } else {
                    Arrays.fill(counters, maxValue);
                }
            }
            return counters;
        }
}
