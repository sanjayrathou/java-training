package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

     //   String name = null;          IT WILL GIVE NULL POINTER EXCEPTION IF WE PRINT ITS LENGTH.

        String a = " ";
        String s1 = " abc  def ";
        String s2 = "sanjay";
        String s3 = "Sanjay Rathour";

        System.out.println(s1.length());     // return int value
        System.out.println(s1.trim());       // return string value
        System.out.println(s1.isEmpty());   // return boolean value

        System.out.println(a.equals(s1));

        System.out.println(s2.equalsIgnoreCase(s3));

        System.out.println(s2.compareTo(s3));    // IT WILL PRINT THE ASCII VALUE DIFFERENCE OF FIRST CHAR OF s2 AND s3.

        System.out.println(s1.concat(s2));

        System.out.println(10 + 20 + s3);          // add operator .

        System.out.println(String.join("/",s2,s3));      // join method.

        System.out.println(s2.subSequence(2,6));     // it will return char sequence

        System.out.println(s2.substring(2,6));      //  it will return string value

        System.out.println(s2.replace("s","r"));
        System.out.println(s2.replaceAll("a(.)","u"));          // for regular expression
        System.out.println(s3.replaceFirst("a","l"));

        // searching methods in string

        System.out.println(s1.indexOf('r'));
        System.out.println(s1.lastIndexOf("a"));
        System.out.println(s2.contains("rat"));
        System.out.println(s2.startsWith("t"));
        System.out.println(s2.endsWith("h"));

        String[] arr = s3.split(" ");         // String to array change we use split method.

        System.out.println(Arrays.toString(arr));

    }

}
