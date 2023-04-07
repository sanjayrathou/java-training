import java.util.*;
public class ToeplitzMatrix{
    static boolean findToeplitz(int[][] matrix){

        for(int i = 0; i < matrix.length-1; i++){
            for(int j = 0; j < matrix[i].length-1; j++){
                if(matrix[i][j] != matrix[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of r :");
        int r = sc.nextInt();
        System.out.println("enter the value of c :");
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter the " + (r * c) + " elements ");

       // int[][] matrix = {{1,0,0,0},{0,1,0,0,0,0},{0,0,1,0,0,0,0,0,0,0}};

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        boolean flag = findToeplitz(matrix);
        System.out.println(flag);

    }

}