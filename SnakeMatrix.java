import java.util.*;

public class Snakematrix{
    static void snakeOrder(int[][] matrix, int n, int m){
        int i = 0;
        int totalElements = n * m;
        int elements = 0;
        int leftCol = 0, rightCol = m-1;
        while(elements <= totalElements-1 ){

            for(int j = leftCol; (j <= rightCol) && (elements <= totalElements) ; j++){
                System.out.print(matrix[i][j] + " ");
                elements++;
            }

            i++;

            for(int j = rightCol ; (j >= leftCol) && (elements <= totalElements); j-- ){
                 System.out.print(matrix[i][j] + " ");
                 elements++;
            }

            i++;

        }
    }
   
   
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt(); 
        int[][] matrix = new int[n][m];

        System.out.println("Enter the " + n * m + " elements :");

        for(int i = 0 ; i < matrix.length; i++){

            for(int j = 0; j < matrix[i].length; j++){ 

                matrix[i][j] = sc.nextInt();
            }

        }
        System.out.println("Snake order is :");
        snakeOrder(matrix,n,m);
    }
}