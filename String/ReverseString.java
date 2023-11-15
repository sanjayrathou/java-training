package Strings;

public class ReverseString {

    public String reverseString1(String s){            // method 1.

        String rev = "";

        for(int i = s.length()-1; i>=0; i--){

            rev += s.charAt(i);

        }
        return rev;
    }

    public String reverseString2(String s){          // method 2.

        String rev = "";

        for(int i = 0; i < s.length(); i++){

            rev = s.charAt(i) + rev;
        }

        return rev;
    }

    public String reverseString3(String s){             //   using recursion

        if(s.length() == 0){
            return s;
        }
        else {
            return reverseString2(s.substring(1)) + s.charAt(0);
        }
    }

    public String reverseString4(String s){          //  using StringBuilder class.

        StringBuilder sb = new StringBuilder(s);

        return sb.reverse().toString();
    }

    public static void main(String[] args) {

        ReverseString obj = new ReverseString();

        System.out.println( obj.reverseString2("sanjay"));

    }

}
