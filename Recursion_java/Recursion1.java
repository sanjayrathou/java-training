package college;

public class Recursion1 {
	public static void printNumber(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		printNumber(n - 1);
		
	}
	public static void main(String[] args) {
		int n =7;
		printNumber(n);
	}

}
