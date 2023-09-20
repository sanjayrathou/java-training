package ArrayRecursion;

 public class Recursion1 {
	 public static void printElements(int[] arr, int idx) {
		
	 if(idx == arr.length) {
		                          // Base case
			return;
		}

		System.out.println(arr[idx]);
		
		printElements(arr, idx + 1);
		
	}
	public static void main(String[] args) {
		int[] arr = {3,5,2,5,2,3,4,2};
		printElements(arr, 3);
	}
	

}
