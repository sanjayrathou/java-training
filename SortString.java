import java.util.Arrays;  // (ARRAY CLASS FOR SORTING THE STRING)

public class SortString {
    public static void main(String[] args) {
        String str="java";
        char[] arr=str.toCharArray();
        char temp;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(new String(arr));



    //    APPROACH 2
        String str2="sanjay";
        char[] arr2=str2.toCharArray();
        Arrays.sort(arr2);
        System.out.println(new String(arr2));

    }
}