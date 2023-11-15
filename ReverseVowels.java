package Strings;

import java.util.Arrays;

public class ReverseVowels {
    static String reverseVowels(String s){
        char[] ch = s.toCharArray();
        int i = 0, j = ch.length-1;
        while(i < j){
            while(ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u'){
                i++;
            }
            while(ch[j] != 'a' && ch[j] != 'e' && ch[j] != 'i' && ch[j] != 'o' && ch[j] != 'u'){
                j--;
            }
            if(i >= j){
                break;
            }
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
      
       String res = new String(ch);
       return res;
    }

    public static void main(String[] args) {
        String ans =  ReverseVowels.reverseVowels("Rohit");
        System.out.println(ans);
     }
}

