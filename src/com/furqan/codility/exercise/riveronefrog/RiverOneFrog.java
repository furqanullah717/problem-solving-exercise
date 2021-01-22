package com.furqan.codility.exercise.riveronefrog;


public class RiverOneFrog {

    public int solution(int X, int[] A){
        boolean []  positionFilled =  new boolean[X+1];
        for(int i=0;i<A.length;i++){
            if(!positionFilled[A[i]]){
                positionFilled[A[i]]=true;
                X--;
                if(X==0) return i;
            }
        }
        return  -1;
    }
}


