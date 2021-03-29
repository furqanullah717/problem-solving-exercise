package com.furqan.problem.exercise.maxcounter;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class MaxCounterTest {

    MaxCounter testableClass = new MaxCounter();
    @Test
    public void test1() {
        int []  result=  testableClass .solution(5,new int[]{3, 4, 4, 6, 1, 4, 4});
        int [] expected =  {3, 2, 2, 4, 2};
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }
    @Test
    public void test2() {
        int []  result=  testableClass .solution(1,new int[]{1, 1,1});
        int [] expected =  {3};
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }
}