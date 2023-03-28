// Suffix Array Program .

import java.util.*;
public class SuffixSum {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static int[] suffixSum(int[] arr, int n){
        for(int i = n - 2; i >= 0; i--){
            arr[i] += arr[i+1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + " elements :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array is : ");
        printArray(arr);
        suffixSum(arr,n);
        System.out.println("Suffix array is : ");
        printArray(arr);
    }

}