package Strings;

public class StringBufferClass {


    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Sanjay");       // creating object of StringBuffer class

        sb.append("rathour");     //  this will not added in string capacity.

        System.out.println(sb);

        System.out.println(sb.capacity());          // defau;t capacity of  sb is 16.


    }

}
