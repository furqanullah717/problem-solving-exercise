package com.furqan.problem.exercise.excel_column_name_finder;

import org.junit.Assert;
import org.junit.Test;

public class ExcelColumnNameFinderTest {

    ExcelColumnNameFinder testClass = new ExcelColumnNameFinder();
    @Test
    public void test1(){
      Assert.assertEquals("Z",testClass.getColumnName(26));
    }
    @Test
    public void test2(){
        Assert.assertEquals("AA",testClass.getColumnName(27));
    }

    @Test
    public void test3(){
        Assert.assertEquals("AB",testClass.getColumnName(28));
    }

}