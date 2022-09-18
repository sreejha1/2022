package src.dynamicProgramming.fibo;
/*You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
https://leetcode.com/problems/house-robber/

Input: nums = [1,2,3,1]
Output: 4
Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
Total amount you can rob = 1 + 3 = 4.
 */

    public class HouseRobber {
            public static int rob(int[] nums) {
                int[] localMax = new int[nums.length+1];
                localMax[0] = 0;
                localMax[1] = nums[0];
                for (int ik = 1; ik < nums.length; ik++) {
                    localMax[ik+1] = Math.max(localMax[ik], nums[ik] + localMax[ik - 1]);
                }

                System.out.println(localMax[nums.length ]);
                return localMax[nums.length];
            }
        
    public static void main(String args[]){
       rob(new int[]{1,3,1,1});
    }
}

