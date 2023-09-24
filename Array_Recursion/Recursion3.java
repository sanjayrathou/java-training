package ArrayRecursion;

public class Recursion3 {
	static int findSum(int[] arr, int idx) {
		
		if(idx == arr.length ) {
			return 0;
		}
		
		int smallSum = findSum(arr, idx + 1);
		
		return arr[idx] + smallSum;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {6,4,5,6};
		
		System.out.println(findSum(arr,0));
	}

}
