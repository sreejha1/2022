package src.dynamicProgramming.fibo;

public class Fibonacci {
    public static void main(String args[]) {
        int n = 10;
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
            System.out.println(arr[i]);
        }
    }
}
