package src;

import java.util.Arrays;
/*In the solution , we start by creating a new empty array of the size equal to the sum of sizes of input arrays. 
Starting off from the index 0 individually compare the elements at corresponding indexes of both arrays. 
Place the element with smaller value in the resultant array, and increment the index of the array where you find the smallest element. 
Keep repeating this till you hit the end of one array. Move the elements of the other array into the resultantArray as it is.
 The time complexity for this algorithm is O(n+m)O(n+m), where nn and mm are the sizes of arr1 and arr2, respectively. This is because both arrays are iterated over once.
 * */
public class MergeSortedArrays {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int[] sortedArray = new int[arr1Length+arr2Length];
        int i=0, j =0,k=0;
        while(i<arr1Length && j<arr2Length){
            if(arr1[i] < arr2[j])
              sortedArray[k++]=arr1[i++];
            else
               sortedArray[k++]=arr2[j++];
            System.out.println("r "+i);
        }
        System.out.println("r "+ Arrays.toString(sortedArray));
        while(i<arr1Length )
            sortedArray[k++]=arr1[i++];
        while(j<arr1Length )
            sortedArray[k++]=arr2[j++];
        
        System.out.println("r "+ Arrays.toString(sortedArray));
        return sortedArray;
    }

    public static void main(String args[]) {
        mergeArrays(new int[]{1,3,4,5},new int[]{2,6,7,8});
    }
}

