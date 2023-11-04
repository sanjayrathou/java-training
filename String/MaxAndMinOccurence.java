package Strings;

public class MaxAndMinOccurence {

  //  char c = '';    length of char datatype can't  be 0.

    char ch = 'j';

    public MaxAndMinOccurence(String s){

        int[] arr = new int[130];

        for (int i = 0; i < s.length(); i++){

            arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
        }
        int max = Integer.MIN_VALUE;
        char c  = ' ';

        int min = Integer.MAX_VALUE;
        char d = ' ';


        for(int i = 0; i<s.length(); i++){

            if(arr[s.charAt(i)] > max){

                max = arr[s.charAt(i)];

                c = s.charAt(i);
            }

            if (arr[s.charAt(i)] < min){

                min = arr[s.charAt(i)];

                d = s.charAt(i);

            }

        }

        System.out.println("max occurence character:" + c);
        System.out.println("min occurence character: " + d);

    }

    public static void main(String[] args) {

        MaxAndMinOccurence obj = new MaxAndMinOccurence("Dally");
    }
}
