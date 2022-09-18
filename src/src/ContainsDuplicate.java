package src;

import java.util.HashSet;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Input: nums = [1,2,3,1]
Output: true
 */
public class ContainsDuplicate {
    public static void main(String args[]){
        int[] s = new int[]{1,2,3,1};
        HashSet results = new HashSet();
       
        for(int i =0;i< s.length;i++ ){
            if(results.contains(s[i]))
         //    return true;
            results.add(s);
        }
      
    }
}
