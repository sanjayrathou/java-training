import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the case number : ");
        String day= sc.nextLine();
        switch(day){
            case "a":
                System.out.println("monday");
                break;
            case "b":
                System.out.println("tuesday");
                break;
            case"c" :
                System.out.println("wednessday");
                break;
            case "d":
                System.out.println("thursday");
                break;
            case "e":
                System.out.println("friday");
                break;
            case"f" :
                System.out.println("saturday");
                break;
            case"g" :
                System.out.println("sunday");
                break;
            default:
                System.out.println("invalid");
        }

    }
}
