import java.util.Scanner;

public class BinarytoDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binaryNum = sc.nextInt();
        int ans=0;
        int power=1;
        while(binaryNum>0){
            int unitDigit=binaryNum%10;
            ans+=unitDigit*power;
            binaryNum/=10;
            power*=2;
        }
        System.out.println(ans);
    }
}