package Exception;

import java.util.Scanner;
import java.io.FileInputStream;
public class ExceptionHandling {
    public static void main(String[] args) {
        String name = null;

       try{                                                     // compile time ecxeption

           Class.forName("com.mysql.jdbc.Driver");       // HANDLING THE EXCEPTION.

       }
       catch (ClassNotFoundException e){

           System.out.println(e);
       }
        System.out.println("Exception is handled");

//        Scanner sc = new Scanner(System.in);
//        int[] a = {3,4,43,23,98};
//        try {
//            System.out.println(a[6]);                 //This is a run time exception .
//        }
//        catch (Exception exception){
//            // catch the exception.
//        }
//        System.out.println();

          System.out.println(name.length());         // IT WILL SHOW RUNTIME NULLPOINTER EXCEPTION

    }
}
