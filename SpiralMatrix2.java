/** Given a positive integer n. Generate an n*n matrix filled with elements from 1 to 
    n^2 in spiral order.
**/
import java.util.*;
public class SpiralMatrix2{

    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n :");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int current = 1;
        int topRow = 0, bottomRow = n-1, leftCol = 0, rightCol = n-1;

       while(current <= n*n){

            for(int i = leftCol; i <= rightCol; i++){
            matrix[topRow][i] = current++;
            }
            topRow++;

            for(int i = topRow; i <= bottomRow; i++){
                matrix[i][rightCol] = current++;
            }
            rightCol--;

            for(int i = rightCol ; i>= leftCol; i--){
                matrix[bottomRow][i] = current++;
            } 
            bottomRow--;

            for(int i = bottomRow; i >= topRow; i--){
                matrix[i][leftCol] = current++;
            }
            leftCol++;

        }
        System.out.println("Spiral Matrix : ");
        printMatrix(matrix);
    }
}
