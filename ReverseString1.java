import java.util.*;
public class ReverseString1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string :");
        String str=sc.next();
        int n=str.length();
        String sr="";
        for(int i=n-1;i>=0;i--){
            sr+=str.charAt(i);
        }
        System.out.println(sr);

    }
}
