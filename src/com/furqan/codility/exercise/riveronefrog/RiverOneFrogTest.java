package com.furqan.codility.exercise.riveronefrog;

import org.junit.Assert;
import org.junit.Test;

public class RiverOneFrogTest {

    RiverOneFrog testableClass = new RiverOneFrog();

    @Test
    public void test1() {
        int[] A = {1, 3, 1, 4, 2, 4, 5, 4};
        int X = 5;
        Assert.assertEquals(6, testableClass.solution(X, A));
    }
    @Test
    public void test2() {
        int[] A = {1, 3, 1, 4, 2, 4, 5, 4};
        int X = 7;
        Assert.assertEquals(-1, testableClass.solution(X, A));
    }
    @Test
    public void test3() {
        int[] A = {1, 3, 1, 4,7, 2, 4, 5, 4,6};
        int X = 7;
        Assert.assertEquals(9, testableClass.solution(X, A));
    }
}
