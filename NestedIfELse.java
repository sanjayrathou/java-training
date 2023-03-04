import java.util.*;
public class NestedIfELse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age: ");
        long age= sc.nextLong();
        if(age<=12){
            if(age<=5){
                System.out.println("Toddler");
            }else{
                System.out.println("Child");
            }
        }else{
            System.out.println("Adult");
        }
    }

}

