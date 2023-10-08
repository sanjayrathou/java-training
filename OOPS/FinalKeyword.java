package OOPS;

final class Test3{
    final int x =9;              // FINAL VARIABLES MUST BE INITIALIZED.
    final float pi = 3.14f;
    final static void show(){
        final int y ;
        System.out.println("final variable inside method");
        System.out.println("method inside final class");
    }
}
public class FinalKeyword {
    public static void main(String[] args) {

        Test3 obj = new Test3();
        System.out.println(obj.x);
        Test3.show();
    }
}
