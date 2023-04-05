/**   Add 2 matrices of same dimension
 */


import java.util.*;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the rows and columns");

        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] a = new int[rows][columns];
        int[][] b = new int[rows][columns];
        int[][] ans = new int[rows][columns];

        System.out.println("enter the elements");
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the elements");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                b[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                ans[i][j] = a[i][j] + b[i][j];

            }
        }
        System.out.println("sum of matrices is :");
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();

        }

    }
}
