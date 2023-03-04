import java.util.Scanner;

public class readString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string ");
        char ch = sc.nextLine().charAt(11);
        System.out.println("char is "+ch);
    }
}
 /* sc.nextLine().charAt(2) is used To print the 3 rd character */