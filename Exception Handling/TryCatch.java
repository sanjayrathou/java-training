package Exception;

public class TryCatch {
    public static void main(String[] args) {

        try {
            int a = 10,  b = 0, c;
            System.out.println("1");
            c = a/b;
            System.out.println("2");
        }
        catch (ArithmeticException e){

            System.out.println("3");
            e.printStackTrace();        // IT WILL PRINT ALL DETAIL OF A EXCEPTION.

            System.out.println(e);      //  IT WILL PRINT THE NAME AND DESCRIPTION OF THE EXCEPTION.

            System.out.println(e.toString());      //  IT WILL PRINT THE NAME AND DESCRIPTION OF THE EXCEPTION.

            System.out.println(e.getMessage());  // IT WILL PRINT ONLY DESCRIPTION OF THE EXCEPTION.

            System.out.println("4");
        }
    }
}
