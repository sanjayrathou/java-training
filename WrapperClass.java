package Revision;

public class WrapperClass {

    public static void main(String[] args) {

        Integer i = new Integer(6);       //  boxing

        int n = i.intValue();                       // unboxing

        System.out.println(n);

        String s = Integer.toString(n);
        System.out.println(s);

        int a = Integer.valueOf(s);              //    string to int convert.
    }
}
