package college;

public class GCD {
	public  static int findGCD (int x, int y) {

		while(x % y != 0) {
			int ans = findGCD(y,x % y);
			return ans;
		}
		return  y;
		
	}
	
	public static int GCD2 (int x, int y) {
		if(y == 0) {
			return x;
		}
		return GCD2(y, x % y);
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(findGCD(20, 10));
		
		System.out.println(GCD2(20, 60));
	}

}
