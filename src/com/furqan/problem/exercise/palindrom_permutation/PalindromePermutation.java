package com.furqan.problem.exercise.palindrom_permutation;

import java.util.HashMap;

public class PalindromePermutation
{

    public boolean isPalindromePermutation(String s){
        HashMap<Character, Integer> map = new HashMap<> ();
        for (Character c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        for (char key: map.keySet()) {
            count += map.get(key) % 2;
        }

        return count <= 1;
    }
}
