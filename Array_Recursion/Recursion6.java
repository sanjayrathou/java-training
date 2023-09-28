package ArrayRecursion;

public class Recursion6 {
	static void getSSQSum(int[] arr, int idx, int sum) {
		if(idx == arr.length) {
			System.out.println(sum);
			return;
		}
		
		
		getSSQSum(arr, idx + 1, arr[idx] + sum);
		getSSQSum(arr, idx + 1, sum);
		
		
	}
	
	public static void main(String[] args) {
		int[] arr = {2,4,5};
		getSSQSum(arr, 0, 0);
	}

}
