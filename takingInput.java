import java.util.Scanner;

public class takingInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("enter your name");
        String name = sc.nextLine();
        System.out.println("entered name is " + name);

        System.out.println("enter your lucky number");
        int num1 = sc.nextInt();
        System.out.println("entered lucky number is " + num1);


        System.out.println("enter the float value ");
        float f = sc.nextFloat();
        System.out.println("float value is "+f);


    }
}
