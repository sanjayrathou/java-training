import java.util.*;
public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int i = sc.nextInt();
        int[] arr = new int[i];

        System.out.println("enter the elements in array: ");

        for (int j = 0; j < i; j++) {
            arr[j] = sc.nextInt();
        }
        for (int j = 0; j < i; j++) {
            System.out.println(arr[j]);
        }

        System.out.println("enter the number to be search:");
        int num = sc.nextInt();
        for (int j = 0; j < i; j++) {
            if (num == arr[j]) {
                System.out.println("number found at index : " + j);
            }
        }
    }
}
