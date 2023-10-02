// finding missing no from 1 to n.

public class MissingNumber {

    public int findNum(int[] arr, int n){

        int sum = (n * (n+1)) / 2;

        for(int i = 0 ; i < n ; i++){
            sum -= arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr= {0,1,3,9};
        int n = arr.length;

        MissingNumber obj = new MissingNumber();
        System.out.println(obj.findNum(arr,n));
    }
}
