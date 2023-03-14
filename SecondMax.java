
import java.util.*;

public class SecondMax {

    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }

        }
        return (max);
    }

    static int findsecondMax(int[] arr) {
        int max = findMax(arr);
        for (int i = 0; i < arr.length; i++) {

            if (max == arr[i]) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax=findMax(arr);
        return(secondMax);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size :");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("enter the elements :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        System.out.println("second maximum element is: "+findsecondMax(arr));

        //       System.out.println(Integer.MIN_VALUE);     -2147483648

        //       System.out.println(Integer.MAX_VALUE);      2147483647



    }
}