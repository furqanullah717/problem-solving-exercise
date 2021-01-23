package com.furqan.codility.exercise.missinginteger;

import org.junit.Assert;
import org.junit.Test;

public class MissingIntegerTest {

    MissingInteger testableClass = new MissingInteger();
    @Test
    public void test1(){
        int  result=  testableClass .solution(new int[]{1, 3, 6, 4, 1, 2});
        int  expected = 5;
        Assert.assertEquals((expected), (result));
    }
    @Test
    public void test2(){
        int  result=  testableClass .solution(new int[]{-1, -3});
        int  expected = 1;
        Assert.assertEquals((expected), (result));
    }
    @Test
    public void test3(){
        int  result=  testableClass .solution(new int[]{1, 2, 3});
        int  expected = 4 ;
        Assert.assertEquals((expected), (result));
    }
    @Test
    public void test4(){
        int  result=  testableClass .solution(new int[]{Integer.MAX_VALUE,Integer.MIN_VALUE});
        int  expected = 1 ;
        Assert.assertEquals((expected), (result));
    }
    @Test
    public void test5(){
        int  result=  testableClass .solution(new int[]{1});
        int  expected = 2 ;
        Assert.assertEquals((expected), (result));
    }
    @Test
    public void test6(){
        int  result=  testableClass .solution(new int[]{Integer.MAX_VALUE});
        int  expected = 1 ;
        Assert.assertEquals((expected), (result));
    }
    @Test
    public void test7(){
        int  result=  testableClass .solution(new int[]{Integer.MIN_VALUE});
        int  expected = 1 ;
        Assert.assertEquals((expected), (result));
    }
    @Test
    public void test8(){
        int  result=  testableClass .solution(new int[]{150, 151, 152, 153, 154, 155});
        int  expected = 1 ;
        Assert.assertEquals((expected), (result));
    }
}