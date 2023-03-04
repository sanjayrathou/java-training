import java.util.*;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        int numberOfDigits=0;
        while(num>0) {
            numberOfDigits++;
            num = num / 10;
        }
        System.out.println("no of digits in "+ numberOfDigits);

    }



}


