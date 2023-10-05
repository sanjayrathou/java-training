package OOPS;

abstract class Vehicle{
    abstract void start();           // abstract method don't have body.
}
class Car extends Vehicle{
    public void start(){
        System.out.println("start by key");
    }

}
class Scooter extends Vehicle{
     void start(){
        System.out.println("start by kick");
    }

}
public class Abstraction {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
    }

}
