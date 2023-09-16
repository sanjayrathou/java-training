package college;

public class Recursion2 {
    
	public static void printNumber(int n) {
		if(n > 5) {
			return;
		}
		System.out.print(n + " ");
		printNumber(n + 1);
	}
	public static void main(String[] args) {
		int n = -7;
		printNumber(n);
	}
}
