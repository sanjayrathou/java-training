import java.util.*;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n :");
        int n = sc.nextInt();
        for(int i = 2; i <= n/2 ; i++){
            if(n % i == 0){
                System.out.println(n + " is non prime ");
                return;
            }
        }
        System.out.println(n + " is prime");


    }
}
