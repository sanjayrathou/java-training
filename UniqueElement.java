import java.util.*;

public class UniqueElement {

    static void pairSum(int arr[]){

        int ans=-1;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;


                }
            }
        }
        for(int i=0;i<arr.length;i++){

            if(arr[i]!=-1){
                ans=arr[i];
            }
        }
        System.out.println("unique element is :"+ans);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size:");
        int size=sc.nextInt();

        System.out.println("enter the array element :"); //elements being repeated twice and must have a unique element

        int[] arr=new int[size];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        pairSum(arr);
    }

}

