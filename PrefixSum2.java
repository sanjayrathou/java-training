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
        Scanner sc = new Scanner (System.in);
        
        int l = sc.nextInt();
        int r = sc.nextInt();
        int n = arr.length;
        for( int i = 1; i <= n; i++){
            arr[i] = arr[i-1] + arr[i];
        }
        int ans = arr[r] - arr[l-1];
        System.out.println(ans);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the " + n + " elements :");
        for ( int i = 1; i <= n; i++){      //  NOTE 1 BASED INDEXING.
             arr[i] = sc.nextInt();
        }
        System.out.println("Prefix array is :");
        int[] pref = prefix(arr);
        printArray(pref);
    }
}
