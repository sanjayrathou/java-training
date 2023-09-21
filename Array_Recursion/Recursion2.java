package ArrayRecursion;

public class Recursion2 
{
	
	static int findMax(int[] arr, int idx) {
		
		
		
		if(idx == arr.length - 1) {
			return arr[idx];
		}
		
	   
		int smallAns = findMax(arr, idx + 1);
		int max = Math.max(arr[idx], smallAns);
		
		return max;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,4,54,6,7,31,9};
		System.out.println(findMax(arr, 0));
	}

}
