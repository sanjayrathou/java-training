
// FROG JUMP SHORTEST PATH QUESTION. PW L-36.

package ArrayRecursion;

public class Recursion7 {
	
	static int bestPath(int[] arr, int n, int idx) {
		
		if(idx == n-1) return 0;          // BASE CASE
		
		int op1 = Math.abs(arr[idx] - arr[idx + 1]) + bestPath(arr, n, idx + 1);
		
		if(idx == n-2) return op1;        // BECAUSE AT N-2 THERE IS ONLY 1 OPTION I.E,  OP1
		
		int op2 = Math.abs(arr[idx] - arr[idx + 2]) + bestPath(arr, n, idx + 2);
		
		return Math.min(op1, op2);
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2,13,14,5,6};
		
		System.out.println(bestPath(arr, arr.length, 0));
	}

}
