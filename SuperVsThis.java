class Parent {
    int x;
    public Parent(){
        x = 10;
        System.out.println("Parent class default const....");
    }

}
class Child extends Parent {
    int x ;
    public Child() {
        super();
        x  = 20;
        System.out.println("Child class default const...");
    }

    public Child(int x){
        int total = x + x + x ;
        System.out.println("Child class default const...");
        System.out.println("total is " + total);


    }

}
public class SuperVsThis {

    public static void main(String[] args) {
        Child obj = new Child(50);

    }
}
