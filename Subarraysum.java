public class Subarraysum {
    public  static void subarray(int[] arr, int targetSum){
        int n = arr.length;
        int currentSum = 0;
        int count=0;
        int j=0;
        for(int i=0; i<n; i++ ) {
            currentSum += arr[i];
            if(currentSum>targetSum){
                while(currentSum>targetSum) {
                    currentSum -= arr[j];
                    j++;
                }
            }
            if(currentSum==targetSum){
                count++;
            }
        }
        System.out.println("there are "+count+" subarrays");


    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,90,20,80,50,40,60,30,90,90,-10,100};
        int targetSum = 90;
        subarray(arr, targetSum);

    }
}











