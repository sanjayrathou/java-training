import java.util.*;
class algebra{
       void mul(int a,int b){
         int ans=a*b;
         System.out.println(ans);
         return;
    }
}
public class Function{
    public static void main(String[] args){
        algebra obj=new algebra();
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        obj.mul(x,y);
    }
}