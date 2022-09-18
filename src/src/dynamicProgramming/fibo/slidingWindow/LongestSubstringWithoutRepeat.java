package src.dynamicProgramming.fibo.slidingWindow;

import java.util.HashSet;
import java.util.Set;
/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
 */
public class LongestSubstringWithoutRepeat {
    public static int getLengthOfLongestSubstring(String s){
        int max = 0;
        int i =0, j=0;
        Set uniqueChars = new HashSet();
        if(s == null  || s.length()<1)
            return 0;
        while(i<s.length()){
            while(uniqueChars.contains(s.charAt(i))){
                
                    uniqueChars.remove(s.charAt(j));
                    ++j;
                
            }
            uniqueChars.add(s.charAt(i));
            max = Math.max(max, (i-j)+1);
            ++i;
        }
        System.out.println(uniqueChars);
        return max;
    }
    public static void main(String args[]){
       System.out.println( getLengthOfLongestSubstring("abcdsxysz"));
    }
}
