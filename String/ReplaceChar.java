package Strings;

// replace ? by another char without repetition.

public class ReplaceChar {

    static String replaceChar(String s){
        char[] arr = s.toCharArray();
        char prev = ' ';
        char next = ' ';
        for(int i = 0; i < arr.length; i++ ){
            if(arr[i] != '?'){
                continue;
            }
            if(i > 0){
                 prev = arr[i-1];
            }
            if(i == 0){
                 prev = 'a' - 1;
            }
            if(i < arr.length-1){
                 next = arr[i+1];
            }
            if(i == arr.length-1){
                 next = 'z' + 1;
            }
            char c = 'a';
            while(c == prev || c == next){
                c++;
            }
            arr[i] = c;
        }
        return String.valueOf(arr);
    }


    public static void main(String[] args) {

        String ans = ReplaceChar.replaceChar("?sasa?");
        System.out.println(ans);
    }





}
