/**  Given an integer array . return the prefix sum/running sum in the same array without creating a new array.
 **/
import java.util.*;
public class PrefixSum {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] prefix(int[] arr){
        int n = arr.length;
        for( int i = 1; i < n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + " elements :");
        for ( int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Prefix array is :");
        int[] pref = prefix(arr);
        printArray(pref);
    }
}
