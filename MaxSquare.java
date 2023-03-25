/** Given an array 'ans' sorted in non decreasing order ,return an array of the squares of each number
    sorted in non decreasing order.
 */
public class MaxSquare {
    static int[] sortByParity(int[] arr) {
        int n = arr.length;
        int[] ans=new int[n];
        int i = 0, j = n - 1,k=0;
        while(i<=j) {
            if (Math.abs( arr[i])>Math.abs(arr[j]) ) {
                ans[k++] = arr[i] * arr[i];
                i++;
            }
            if ( Math.abs(arr[i]) <=Math.abs( arr[j] )) {
                ans[k++] = arr[j] * arr[j];
                j--;
            }
        }
        return ans;
    }
    static int[] reverseArr(int[] arr) {
        int[] ans = new int[arr.length];
        int j = 0;
        for (int i = arr.length - 1; i >= 0; i--) {

            ans[j++] = arr[i];

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] arr={-10,-3,-1,4,6,8,11};
        int[] ans=sortByParity(arr);
        reverseArr(ans);

    }
}
