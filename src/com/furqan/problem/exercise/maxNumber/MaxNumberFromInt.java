package com.furqan.problem.exercise.maxNumber;

public class MaxNumberFromInt {
    public int solution(int N,int replaceValue) {

        if (N == 0)
        {
            return replaceValue * 10;
        }

        int negative = N / Math.abs(N);
        N = Math.abs(N);
        int n = N;
        int resultant = Integer.MIN_VALUE;
        int counter = 0;
        int position = 1;
        while (n > 0)
        {
            counter++;
            n = n / 10;
        }
        for (int i = 0; i <= counter; i++)
        {
            int valueObtained = ((N / position) * (position * 10)) + (replaceValue * position) + (N % position);
            if (valueObtained * negative > resultant)
            {
                resultant = valueObtained * negative;
            }

            position = position * 10;
        }

        return resultant;
    }
}
