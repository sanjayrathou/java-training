package college;
import java.util.*;

public class Recursion4 {
	public static void printReverse(int n) {
		if(n == 1) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		printReverse(n - 1);
		
		return;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int x = sc.nextInt();
		printReverse(x);
		
	}

}
