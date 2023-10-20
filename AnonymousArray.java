package Sorting;

public class AnonymousArray {


     static void anonymousArray(int[] arr){
        int sum =0;
         for (int i: arr){
             sum = sum +i;
         }

         System.out.println(sum);
    }

    public static void main(String[] args) {

    //  AnonymousArray.anonymousArray(new int[]{1,2,3});

         AnonymousArray.anonymousArray(new int[]{1,2,3,4});

    }
}
