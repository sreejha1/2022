package src.dynamicProgramming.fibo;

import java.util.Arrays;

/*You are given an integer array cost where cost[cursor] is the cost of ith step on a staircase. Once you pay the cost, you can either climb one or two steps.

You can either start from the step with index 0, or the step with index 1.

Return the minimum cost to reach the top of the floor.
 [10,15,20]
 15
 
 cost[] = new int[3];
  minCostLocal[] = new int[4];
  minCostLocal[4]=0
 for cursor=n; cursor<0; cursor--
    if(cursor!=n)
      cost[cursor] = min(cost[cursor]+cost[cursor+1] , cost[cursor]+cost[cursor+2]);
    
*/
public class MinCostClimbingStairs {
    public static void main(String args[]){
        int inputArray[] = new int[]{1,100,1,1,1,100,1,1,100,1,0};
        int arrLength = inputArray.length;
        
        int result = inputArray[arrLength-2];
        System.out.println("Result before "+result);
        for(int cursor=arrLength-3; cursor>=0; cursor--){
            inputArray[cursor] = Math.min(inputArray[cursor]+inputArray[cursor+1],inputArray[cursor]+inputArray[cursor+2]);
            System.out.println(inputArray[cursor]+" "+cursor);
        }
        System.out.println("Result "+Math.min(inputArray[0],inputArray[1]));
    }
    
}
