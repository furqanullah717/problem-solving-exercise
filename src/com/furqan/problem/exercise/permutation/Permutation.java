package com.furqan.problem.exercise.permutation;

import java.util.Arrays;
public class Permutation {
    public int solution(int[] A) {
        Arrays.sort(A);
        int val =1;
        for (int j : A) {
            if (j == val)
                val++;
            else return 0;
        }
        if(val==A.length+1)
            return 1;
        return 0;
    }
}
