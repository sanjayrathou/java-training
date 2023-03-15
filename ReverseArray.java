import java.util.*;
public class ReverseArray{

    static int[] reverse(int[] arr){
         int l=arr.length;
        int[] ans=new int[l];
        int j=0;
       
        for(int i=l-1;i>=0;i--){
            ans[j++]=arr[i];
            
        }
        return ans;
    }
    static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        int[] arr={2,4,5,7,6,8,6,98};
        int[] ans=reverse(arr);
        print(ans);
        


    }
    
}