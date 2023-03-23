/**   Given Q queries,check if the given number is present in the array or not.
      value of elements in the array is less than 10 to the power 5.
 **/

import java.util.*;
public class FrequencyArray {
    static int[] frequencyArray(int[] arr){
        int[] freq=new int[10005];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+" elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] freq=frequencyArray(arr);
        System.out.print("enter no of queries :");
        int q=sc.nextInt();
        while(q>0){
            System.out.print("enter no to be searched :");
            int x=sc.nextInt();
            if(freq[x]>0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            q--;
        }
    }
}
