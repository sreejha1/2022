package src.stringManipulation;

import java.util.*;

/* 
Qn 1– Tasks coming like – 1,2,2,2,1,5,4,1,2,4,1,4,1,5,1,5,1,2,4,2,3,4,5,2

Output should be – 1,1,1,1,1,1,1,2,2,2,2,2,2,2,5,5,5,5,4,4,4,4,4,3
Tasks should be grouped together but they should also maintain the order that they came in. 


 */
public class GroupAndMaintainOrder {
    public static void main(String args[]) {
        int[] input = new int[]{1, 2, 2, 2, 1, 5, 4, 1, 2, 4, 1, 4, 1, 5, 1, 5, 1, 2, 4, 2, 3, 4, 5, 2,9};

        System.out.println(Arrays.toString(input));
        countingSort(input, 256);

    }

    public static void countingSort(int[] input, int k) {
        // create buckets 
        int counter[] = new int[k + 1];
        // fill buckets 
        for (int i : input) {
            counter[i]++;
        }
        // sort array 
        int ndx = 0;
        for (int i = 0; i < counter.length; i++) {
            while (0 < counter[i]) {
                input[ndx++] = i;
                counter[i]--;
            }
        }
        System.out.println(Arrays.toString(input));

    }
}