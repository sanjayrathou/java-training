import java.util.*;

public class NoOfPairSum {

    static int pairSum(int[] arr,int x){

        int count=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]+arr[j])==x){
                    count++;
                    System.out.println("pairs are: "+"( "+arr[i]+", "+arr[j]+" )");


                }
            }
        }
        System.out.println(count+" times");
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt();

        System.out.println("enter the sum:");

        int x=sc.nextInt();

        System.out.println("enter the array element :");

        int[] arr=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        pairSum(arr,x);
    }

}
