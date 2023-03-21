
public class ArrayReverse{
    static int[] reverseArr(int[] arr){
        int[] ans=new int[arr.length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){

            ans[j++]=arr[i];

        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(ans[i] + " ");
        }

        return ans;

    }

    public static void main(String[] args) {
        int[] arr={3,4,4,2,7,8,6};
        reverseArr(arr);



    }
}
