package src;

import java.util.HashMap;

public class TwoNumbersThatAddToN {

        public static int[] findSum(int[] arr, int n)
        {
            int[] result = new int[2];
            HashMap<Integer, Integer> m = new HashMap();
            for(int i=0; i<arr.length;i++){
                int complement = n - arr[i];
                if(m.containsKey(complement)){
                    result[0] = i;
                    result[1] =m.get(complement);
                    return result;
                }
                else
                    
                m.put(arr[i], i);
            }
            return result;   // return the elements in the array whose sum is equal to the value passed as parameter 
        }

    public static void main(String args[]) {
        int[] result = findSum(new int[]{1, 21, 3, 14, 5, 60, 7, 6},27);
        System.out.println(result[0] +" "+result[1]);
    }
    }

