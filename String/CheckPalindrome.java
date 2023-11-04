package Strings;

public class CheckPalindrome {

     CheckPalindrome(String s){    // constructor.

        StringBuilder sb = new StringBuilder(s);

        String rev = sb.reverse().toString();      //  converts Stringbuilder into string.

        if(rev.equals(s)){

            System.out.println(s + " is palindrome");

        }
        else {
            System.out.println("not palindrome");
        }
    }

    public static void main(String[] args) {

        CheckPalindrome obj = new CheckPalindrome("madam");
    }
}
