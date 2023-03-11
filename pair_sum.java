 public class pair_sum {
     static void approach1(int arr[], int k) {

         for (int i = 0; i < arr.length; i++) {
             for (int j = i + 1; j < arr.length; j++) {
                 int sum = arr[i] + arr[j];
                 if (sum == k) {
                     System.out.println("pair found:" + arr[i] + "," + arr[j]);
                     return;
                 }
             }
         }
     }

          public static void main(String[] args) {
              int[] arr = {2, 1, 5, 6, 3, 7};
              int k = 11;
              approach1(arr, k);
          }

}