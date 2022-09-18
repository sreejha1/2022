package src.linkedList;
import java.util.*;
import java.util.HashMap;

import static java.util.List.of;

class findOddOne {
        Integer findOddOne1(ArrayList<Integer> a) {
            HashMap<Character, Integer> m = new HashMap<>();
           
            Integer x = a.get(0);
            for(int i=1;i<a.size();i++){
               x = a.get(i)^x;
            }
            return x;
          

    }
}

    public class OddOneOut {
        public static void main(String[] args) {
            System.out.println(new findOddOne().findOddOne1(new ArrayList<>(Arrays. asList(10, 10, 10, 10, 90, 10))));
            System.out.println(100^100);
        }
    }

