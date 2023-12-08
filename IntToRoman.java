package Revision;

import java.util.Map;

public class IntToRoman {
    public String intToRoman(int num){
        StringBuilder sb = new StringBuilder();
        String[] s = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for(int i = 0; i < s.length; i++){
            while (num >= arr[i]){
                num -= arr[i];
                sb.append(s[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new IntToRoman().intToRoman(89));
    }
}
