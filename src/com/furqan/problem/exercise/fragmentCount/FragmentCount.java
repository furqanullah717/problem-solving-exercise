package com.furqan.problem.exercise.fragmentCount;

import java.util.ArrayList;
import java.util.HashMap;

public class FragmentCount {
     public int solution(int [] A){
         HashMap<Integer, ArrayList<Integer>> map = new HashMap();
         ArrayList<Integer> indices;
         int sum = 0;
         int subarraysCount = 0;
         for (int i : A) {
             sum += i;
             if (sum == 0) subarraysCount++;
             indices = new ArrayList();
             if(map.get(sum)!=null){
                 subarraysCount += map.get(sum).size();
                 indices = map.get(sum);
             }
             indices.add(i);
             map.put(sum,indices);
         }
         if(subarraysCount>1000000000){
             return -1;
         }
         return subarraysCount;
     }
}
