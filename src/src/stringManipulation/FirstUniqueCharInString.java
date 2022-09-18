package src.stringManipulation;
/*
https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FirstUniqueCharInString {
    
        public int firstUniqChar(String s) {
            char[] charArr = s.toCharArray();
            int[] counts = new int[26];

            for(int i=0; i<charArr.length; i++){
                int val =charArr[i]-'a';
                counts[val]++;
            }
            for(int i=0; i<charArr.length; i++){
                if (counts[charArr[i] - 'a'] == 1) {
                    return i;
                }
            }
            return -1;
        }
    }
    

