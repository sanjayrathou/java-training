package OOPS;
interface I1{
    default void show1(){
        System.out.println("interface 1");
    }
    void show2();

}
interface I2{
      default void show3(){
         System.out.println("gjy");

     }
     void show4();
}
class C1 implements I1,I2{
   public void show2(){
   }
   public void show4(){

   }

}
public class MultipleInheritance {
    public static void main(String[] args) {

        I1 ref1 = new C1();      // CREATING REFERENCE FROM INTERFACE I1
        ref1.show1();

        I2 ref2 = new C1();           // CREATING REFERENCE FROM INTERFACE I2
        ref2.show4();
    }
}
