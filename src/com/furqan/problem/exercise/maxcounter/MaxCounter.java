package com.furqan.problem.exercise.maxcounter;

import java.util.Arrays;

public class MaxCounter {

        public int[] solution(int N, int[] A) {
           //create an array of integers
            int[] counters = new int[N];
            //initalize max value
            int maxValue = 0;
            //set a variable to contain lastUpdate value
            int lastUpdate=0;
            for (int k : A) {

               int j=k;
               //check if the given value equest the all max counter
               if(j==N+1){
                   //update the value to max
                    lastUpdate = maxValue;
                }
               else
                {
                    //decrement to get the actual position in array
                    j--;
                    //if current position value is lesser than lastUpdate fill it.
                    if(counters[j] < lastUpdate){
                        counters[j] = lastUpdate+1;
                    }else{
                        //update the counter at index
                        counters[j]++;
                    }
                    //set max value
                    if(counters[j]>maxValue){
                        maxValue = counters[j];
                    }
                }
            }
       //update those values that are less than lastUpdate
            for(int i=0 ;i<counters.length;i++ ){
                if(lastUpdate>counters[i]){
                    counters[i] = lastUpdate;
                }
            }
            return counters;
        }
}
