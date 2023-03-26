/**  Given an integer array of integrs of size n. answer q queries where you need to print the sum of values
 *   in a given range of indices from l to r(both included).
 *   The values of l and r in queries follow 1 based indexing.
  **/

import java.util.*;
public class PrefixSum2 {
    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static int[] prefix(int[] arr){
        int n = arr.length;
        for( int i = 1; i < n; i++){
            arr[i] =+ arr[i-1] ;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.println("Enter the " + n + " elements :");
        for ( int i = 1; i <= n; i++){      //  NOTE 1 BASED INDEXING.
             arr[i] = sc.nextInt();
        }
        int[] pref = prefix(arr);
        System.out.println("Enter no of queries :");
        int q = sc.nextInt();
        while (q-- > 0){
            System.out.println("Enter the range ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int sum = pref[r] - pref[l-1];
            System.out.println("Sum is :" + sum);
        }


    }
}
