import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimalNum = sc.nextInt();
        int ans=0;
        int power=1;
        while(decimalNum>0){
            int result=decimalNum%2;
            ans=ans+(result*power);
            power*=10;
            decimalNum/=2;
        }
        System.out.println(ans);

    }
}