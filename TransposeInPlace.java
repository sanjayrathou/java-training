// This method is only used for square matrix.
// Transpose of a matrix 
import java.util.*;
public class TransposeInPlace{
   static void  printArray(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void findTranspose(int[][] arr , int r, int c){
        for(int i = 0; i < c; i++){
            for(int j = i; j < r; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

    } 
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of r :");
        int r = sc.nextInt();
        System.out.println("enter the value of c :");
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
        System.out.println("Enter the " + (r * c) + " elements ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original matris is :");
        printArray(arr);
        System.out.println("Transpose matris is :");
        findTranspose(arr, r, c);
        printArray(arr);

    

    }

}