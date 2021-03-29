package com.furqan.problem.exercise.palindrom_permutation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromePermutationTest {

    PalindromePermutation palindromePermutation;
    @Before
    public void setup(){
        palindromePermutation = new PalindromePermutation();
    }

    @Test
    public void test1(){
        Assert.assertTrue(palindromePermutation.isPalindromePermutation("aab"));
    }
    @Test
    public void test2(){
        Assert.assertFalse(palindromePermutation.isPalindromePermutation("code"));
    }
    @Test
    public void test3(){
        Assert.assertTrue(palindromePermutation.isPalindromePermutation("aabbcdd"));
    }
}