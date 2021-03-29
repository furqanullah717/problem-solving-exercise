package com.furqan.problem.exercise.missinginteger;

import java.util.Arrays;

public class MissingInteger {
    public int solution(int[] A) {
        Arrays.sort(A);
        int min = 1;
        for (int i : A) {
            if (i == min) {
                min++;
            }
        }
        return min;
    }
}
