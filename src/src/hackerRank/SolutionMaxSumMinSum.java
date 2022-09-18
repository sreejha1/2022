package src.hackerRank;

import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result1 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long total = arr.get(0);
        int min =0;
        int localMax = arr.get(0);
        int localMin = arr.get(0);
        for(int i =1;i <arr.size();i++){
            if(arr.get(i) > localMax)
                localMax = arr.get(i);
            if(arr.get(i) < localMin)
                localMin = arr.get(i);
            total = total+arr.get(i);
        }
        System.out.println("Max = " +localMax +" "+"LocalMin= "+localMin +" total "+total);
    
        System.out.println((total-localMax) +" "+(total-localMin));
    }

}

public class SolutionMaxSumMinSum {
    public static void main(String[] args) throws IOException {
       
        Result1.miniMaxSum(new ArrayList<>(Arrays.asList(256741038, 623958417, 467905213, 714532089 ,938071625)));

    }
}

