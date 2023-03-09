import java.util.*;
public class DivisionUsingMethod {

     int division(int a,int b){
        int ans=a/b;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        DivisionUsingMethod obj=new DivisionUsingMethod();  // making the object of given class

        System.out.println(obj.division(x,y));
    }

}
