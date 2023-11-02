package Revision;

public class ReverseArray {

    public void reverseArray(int[] arr){

        int n = arr.length;
        int j = n-1;
        int i = 0;

        while (i < n/2){
            // swaping
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        for(int x : arr){
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        new ReverseArray().reverseArray(new int[]{2,3,4,5,6,7,8,9,10,11});
    }
}
