import java.util.Scanner;

class divide{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        float num1 = sc.nextFloat();
        System.out.println("enter the second number");
        float num2 = sc.nextFloat();
        float div= num1/num2;
        System.out.println("result is "+ div);

    }
}