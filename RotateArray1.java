import java.util.*;
public class RotateArray1 {
    static void reverse(int[] ans,int k,int n){
        k=k%n;
        for(int i=n-k;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        for(int i=0;i<n-k;i++){
            System.out.print(ans[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the k:");
        int k=sc.nextInt();
        int [] arr={1,2,3,4,5};
        int n=arr.length;
        System.out.println("Before rotation:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("After rotation:");
        reverse(arr,k,n);
    }
}
