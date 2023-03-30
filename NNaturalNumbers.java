import java.util.*;
public class NNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int sum=0;
        do{
            sum=sum+i;
            i++;
        }while(i<=n);
        System.out.println(sum);

    }
}
