package com.furqan.problem.exercise.product_array_puzzle;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ProductArrayPuzzleTest {

    ProductArrayPuzzle productArrayPuzzle;
    @Before
    public void setUp(){
        productArrayPuzzle=  new ProductArrayPuzzle();
    }
    @Test
    public void test1(){
        int [] a =  new int[] {1,2,3,4};
        int [] expected =  new int[]{24,12,8,6};
       boolean result = Arrays.equals(productArrayPuzzle.solution(a),expected);
        Assert.assertTrue(result);
    }

    @Test
    public void test2(){
        int [] a =  new int[] {1,2,3,4,5};
        int [] expected =  new int[]{120, 60, 40, 30, 24};
        boolean result = Arrays.equals(productArrayPuzzle.solution(a),expected);
        Assert.assertTrue(result);
    }

}