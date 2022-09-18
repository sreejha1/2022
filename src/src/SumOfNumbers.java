package src;

public class SumOfNumbers {
    public static int[] runningSum(int[] nums) {
        int[] sumOfArray = new int[nums.length];
        sumOfArray[0]= nums[0];
        for(int i=1;i<nums.length;i++){
            sumOfArray[i] =  sumOfArray[i-1] + nums[i];
            
        }
        return sumOfArray;
    }
    public static void main(String args[]){
        int[] arr = runningSum(new int[]{1,2,3,4});
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at index " + i
                    + " : " + arr[i]);
    }
    
}
