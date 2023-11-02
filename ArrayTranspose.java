package Revision;

import java.util.Arrays;

public class ArrayTranspose {

    public void arrayTranspose(int[][] arr){

        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0; j < i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int[] i : arr){                    // printing 2d array using foreach loop.
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }

//        for(int i = 0; i < arr.length; i++){
//            for(int j = 0; j < arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

    public static void main(String[] args) {
        new ArrayTranspose().arrayTranspose(new int[][]{{4,5,6},{7,8,9},{10,11,12}});
    }
}
