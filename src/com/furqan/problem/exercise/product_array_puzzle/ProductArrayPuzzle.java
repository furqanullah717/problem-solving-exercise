package com.furqan.problem.exercise.product_array_puzzle;

public class ProductArrayPuzzle {
    public int[] solution(int[] A) {

        int [] product=  new int[A.length];
        int r=1;
        for(int i=0;i<A.length;i++){
            product[i] = r;
            r*= A[i];
        }
        r=1;
        for(int i=A.length-1;i>=0;i--){
            product[i]*=r;
            r*=A[i];
        }

        return product;
    }
}
