import java.util.Scanner;
public class fibonacci {
    static int fibonacci(int n){

        if (n==0 || n == 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2) ;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int m = s.nextInt();
        System.out.println("Fibonacci series will be:");
        for (int i=0; i<m; i++)
            System.out.print(fibonacci(i) + " ,");
    }

}


