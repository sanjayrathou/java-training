import java.util.*;
public class RotateBy90{

    static void reverse(int[][] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = arr[i].length-1; j >= 0; j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        int[][] arr = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};

        int[][] ans = new int[3][3];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                ans[i][j] = arr[j][i];
            }    
        }
         System.out.println("Transpose matrix is : ");
        for(int i = 0; i < ans.length; i++) {
            for(int j = 0; j < ans.length; j++){
                System.out.print(ans[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("Rotated matrix is : ");
        reverse(ans);
    }
}