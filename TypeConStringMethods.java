package Strings;

public class TypeConStringMethods {
    public static void main(String[] args) {
        String  s = "sanjay";

        int a = 45;

        char[] c = s.toCharArray();
        System.out.println(c);

        System.out.println(s.toUpperCase());
        System.out.println(c.length);

        String ss = String.valueOf(a);
        System.out.println(ss);

    }
}
