package com.furqan.problem.exercise.permutation;

import org.junit.Assert;
import org.junit.Test;

public class PermutationTest {
    Permutation testableClass = new Permutation();
    @Test
    public void test1(){
        int  result=  testableClass .solution(new int[]{1, 3, 2, 4});
        int  expected = 1;
        Assert.assertEquals((expected), (result));
    }
}