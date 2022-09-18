package src.stringManipulation;

/* It increments the bucket value with String s and decrement with string t. So if they are anagrams, all buckets should remain with initial value which is zero. So just checking that and return
Complexity O(n)
 */

import java.util.HashMap;

class AnagramChecker {
    boolean isAnagram(String a, String b) {
        HashMap<Character, Integer> m = new HashMap<>();
        if (a.length() != b.length())
            return false;

        for (int i = 0; i < a.length(); i++) {
            m.put(a.charAt(i), m.getOrDefault(a.charAt(i), 0) + 1);
            m.put(b.charAt(i), m.getOrDefault(b.charAt(i), 0) - 1);
        }

        for (char c : m.keySet()) {
            if (m.get(c) != 0)
                return false;
        }
        return true;
    }

}

public class AnagramCheck {
    public static void main(String[] args) {
        System.out.println(new AnagramChecker().isAnagram("abcc", "cbac"));
        System.out.println(new AnagramChecker().isAnagram("paint", "painp"));
    }
}