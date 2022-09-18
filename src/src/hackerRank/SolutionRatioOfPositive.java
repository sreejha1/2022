package src.hackerRank;

import java.io.*;
import java.math.*;
import java.util.*;

/*
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.
 */
class Result0 {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        BigDecimal[] result = new BigDecimal[3];
        BigDecimal one = new BigDecimal(1);
        BigDecimal divisor = new BigDecimal(arr.size());
        result[0]=new BigDecimal(0);
        result[1]=new BigDecimal(0);
        result[2]=new BigDecimal(0);
        for(int i=0; i< arr.size();i++){
            
             if(arr.get(i) > 0){
                result[1] = (BigDecimal)(result[1].add(one));
            }
            else if(arr.get(i) == 0) {
                 result[0] = (BigDecimal) (result[0].add(one));
             }
            else{
                result[2] = (BigDecimal)(result[2].add(one));
            }
        }
        for(int i=0; i< 3;i++){
            System.out.println(result[i].divide(divisor, MathContext.DECIMAL32));
        }
    }

}
public class SolutionRatioOfPositive {
    public static void main(String[] args) throws IOException {
      
        List input = new ArrayList(Arrays.asList(-4 ,3, -9, 0, 4, 1));
        Result0.plusMinus(input);

       
    }
}
