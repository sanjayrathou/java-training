import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=2*(r-i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= r; i++) {
            for (int j = r; j >= i; j--) {
                System.out.print("* ");
            }

            for (int j = 1; j <= (2 * i - 2); j++) {
                System.out.print("  ");
            }
            for (int j = r; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}