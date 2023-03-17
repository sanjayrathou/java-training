import java.util.*;
public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int num =sc.nextInt();
        int ans=0;
        int remainder;
        while(num>0){
            remainder=num%10;
            ans=ans*10+remainder;
            num=num/10;
        }
        System.out.println(ans);
    }
}
