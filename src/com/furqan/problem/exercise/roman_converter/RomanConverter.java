package com.furqan.problem.exercise.roman_converter;

import java.util.Map;
import java.util.TreeMap;

public class RomanConverter {

    public String solution(int a){
        TreeMap<Integer,String> map =  new TreeMap<>();
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
        return toRoman(map,a);
    }

    private String toRoman(TreeMap<Integer, String> map, int a) {
      Map.Entry<Integer,String > val =  map.floorEntry(a);
      if(val.getKey() == a){
          return val.getValue();
      }
      return val.getValue() + toRoman(map,a-val.getKey());
    }


   // public String solutionArray(){
    //    int a[] =  new int [] {1,4,5,9,10,40,50,90,100,400,500,900,1000};
    //}


}
