/**  Even at beginning and odd at last order not matter.
 **/

import java.util.*;
public class OddEven {
    static void sortByParity(int[] arr){
        int n=arr.length;
        int i=0,j=n-1,temp;
        while(i<j){
            if((arr[i]%2!=0)&&(arr[j]%2==0)){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            if(arr[i]%2==0){
                i++;
            }
            if(arr[j]%2!=0){
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
        sortByParity(arr);
        System.out.println("sorted array is :");
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

