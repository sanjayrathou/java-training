import java.util.*;
public class SpiralMatrix{
    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void findSpiral(int[][] matrix, int r, int c){

        int topRow = 0, bottomRow = r-1, leftCol = 0, rightCol = c-1;
        int totalElements = 0;

        while(totalElements <= r * c){

            for(int i = leftCol; i <= rightCol && totalElements < r * c; i++){
                System.out.print( matrix[topRow][i] + " ");
                totalElements++;
            }
            topRow++;

            for(int i = topRow; i <= bottomRow && totalElements < r * c; i++){
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            for(int i = rightCol; i >= leftCol && totalElements < r * c; i-- ){
                System.out.print(matrix[bottomRow][i] + " ");
                totalElements++;
            }
            bottomRow--;

            for(int i = bottomRow; i >= topRow && totalElements < r * c; i-- ){
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of r :");
        int r = sc.nextInt();
        System.out.println("enter the value of c :");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter the " + (r * c) + " elements ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        } 
        System.out.println("Spiral order is : ");
        findSpiral(matrix, r, c);
        printMatrix(matrix);
    }  

} 