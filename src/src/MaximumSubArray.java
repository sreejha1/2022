package src;

import java.util.Date;
import java.util.GregorianCalendar;

/*Dynamic Programming is a method for solving a complex problem by breaking it down into a collection of simpler subproblems,
 solving each of those subproblems just once, and storing their solutions using a memory-based data structure (array, map, etc.).
 So the next time the same sub-problem occurs, instead of recomputing its solution,
 one simply looks up the previously computed solution, thereby saving computation time.
Because of the way this algorithm uses optimal substructures (the maximum subarray ending at each position is calculated in a simple way from a related but smaller and overlapping subproblem: the maximum subarray ending at the previous position) this algorithm can be viewed as a simple example of dynamic programming.
 */
public class MaximumSubArray {
    public static int findMaxSubArray(int[] arr)
    {
        int localSum = arr[0];
        int globalSum =arr[0];
        int sum=0; int endArray = 0; int startArr = 0;
  
        for(int i=1; i<arr.length;i++){
            if(localSum < 0  ){
                localSum = arr[i];
                startArr = i;
            }
            else{
                localSum = localSum+arr[i];
            }
            System.out.println(localSum +" "+globalSum);
          //  localSum=  Integer.max(localSum+arr[i], arr[i]);
         if(globalSum <localSum) {
              endArray = i;
             globalSum = localSum;
         }
        }
        //start and stop indicates the arrya indices
        System.out.println(startArr+" "+endArray);
        return globalSum;   // return the elements in the array whose sum is equal to the value passed as parameter 
    }

    public static void main(String args[]) {
        int result = findMaxSubArray(new int[]{11, 5, 3, -14, 25, -60});
        
        System.out.println(result+" ");
    }
}


        




