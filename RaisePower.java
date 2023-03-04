
import java.util.*;
public class RaisePower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a and b :");
        int a = sc.nextInt(); int b=sc.nextInt();
        int ans=1;
        int i;
        for(i=1;i<=b;i++){
            ans*=a;
        }
        System.out.println(ans);
    }
}
