package Strings;

public class ReplaceAll {
    static  String replaceAll(String str, String part){
      //  String ans = "";
        while (str.contains(part)){
           str =  str.replace(part,"");
        }
        return str;
    }
    public static void main(String[] args) {


        System.out.println(ReplaceAll.replaceAll("","abc"));
    }
}
