import java.util.*;
public class ArrayNames{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();

        String arr[]=new String[size];    //  making array of strings

        // give input

        for(int i=0;i<size;i++){
            arr[i]=sc.next();        //  taking input of strings
        }

        // print output

        for(int i=0;i<size;i++){
            System.out.println("name "+(i+1)+" is : "+ arr[i]);
        }

    }
}
