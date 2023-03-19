import java.util.*;
public class StreamOfIntegers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num!=0){      // stop at 0
            sum+=num; // sum=sum+num
            num=sc.nextInt();
        }
        System.out.println(sum);
    }
}
