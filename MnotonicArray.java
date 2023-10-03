public class MnotonicArray {

    public static boolean check(int[] arr, int n){
        boolean increasing = false;
        boolean decreasing = false;
        for(int i = 0; i < n-1; i++){

            if(arr[i] < arr[i+1]){
                increasing = true;
            }
            else
            if(arr[i] > arr[i+1]){
                decreasing = true;
            }
            if(increasing && decreasing){     // IF BOTH ARE TRUE  THEN THIS CONDITION WILL EXECUTE .
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int[] arr = {10,11,33,44,55,90};
        int n = arr.length;
        System.out.println(MnotonicArray.check(arr,n));

    }
}
