
import java.util.*;

public class MaxElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        int max=Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){

            if(max<arr[i]){
                max=arr[i];
            }

        }
        System.out.println("maximum element is: "+max);

 //       System.out.println(Integer.MIN_VALUE);     -2147483648

 //       System.out.println(Integer.MAX_VALUE);      2147483647



    }
}