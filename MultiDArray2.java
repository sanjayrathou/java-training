import java.util.*;
public class MultiDArray2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int row = sc.nextInt();
        int column = sc.nextInt();
        int[][] arr = new int[row][column];

        System.out.println("enter the elements in array: ");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the element to search:");
        int x=sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if(x==arr[i][j]){
                    System.out.println("element found at index "+ i+" ,"+j);

                }
            }
        }

    }
}