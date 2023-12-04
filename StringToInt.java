package Strings;

public class StringToInt {
    static void stringToInt(String s){
        String str = s.replaceAll("\\s","");
        String num  = "-+12344567890";
        String ans = "";
        for(char ch : str.toCharArray()){
           if(num.contains(String.valueOf(ch))){
               ans += ch;
           }
        }
        System.out.println(Integer.valueOf(ans));
    }
    public static void main(String[] args) {
        StringToInt.stringToInt(" dg   -87fchh4g ");
    }
}
