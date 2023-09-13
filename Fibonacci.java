package college;
import java.util.*;

public class Fibonacci {
	public static int findSeries(int n) {
		int a = 0;
		int b = 1;
		for(int i = 1; i <= n; i++) {
			System.out.print(a + ",");
			int c = a + b;
			a = b;
			b = c;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		findSeries(n);
	}

}
