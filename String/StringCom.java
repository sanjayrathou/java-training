package Strings;

import java.util.Arrays;

public class StringCom {
    public boolean demo(String s1, String s2){
        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        if(new String(str1).equals(new String(str2))) return true;
        return false;
    }

    public static void main(String[] args) {
        boolean ans = new StringCom().demo("abcd","dcba");
        System.out.println(ans);
    }
}
