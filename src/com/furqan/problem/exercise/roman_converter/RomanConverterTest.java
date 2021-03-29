package com.furqan.problem.exercise.roman_converter;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanConverterTest {
    RomanConverter testClass = new RomanConverter();

    @Test
    public void test1(){
     assertEquals("IV", testClass.solution(4));
    }

    @Test
    public void test2(){
        assertEquals("VII", testClass.solution(7));
    }

}