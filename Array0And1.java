//  Sort an array consist of only 0 and 1.

import java.util.*;
public class Array0And1 {
    static void approach1(int[] arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        for(int i=0;i<arr.length;i++) {
            if ( i < count ) {
                arr[i] = 0;
            }else{
                arr[i]=1;
            }
        }
    }
    static void approach2(int[] arr){
        int n=arr.length;
        int i=0,j=n-1;
        while(i<j){
            if(arr[i]==1&&arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n+" elements");
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
      //approach1(arr);
        approach2(arr);                              // OPTIMAL APPROACH 2
        System.out.println("sorted array is :");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
