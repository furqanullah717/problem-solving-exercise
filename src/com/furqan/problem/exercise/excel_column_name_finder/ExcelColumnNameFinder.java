package com.furqan.problem.exercise.excel_column_name_finder;

public class ExcelColumnNameFinder {

    public String getColumnName(int n){
        StringBuilder result = new StringBuilder();
        while(n > 0){
        int rem =  n % 26;

            if(rem==0){
                result.append("Z");
                n = (n/26) -1;
            }else{
                result.append((char) ((rem - 1) + 'A'));
                n = n / 26;
            }
        }
        return result.reverse().toString();
    }
}
