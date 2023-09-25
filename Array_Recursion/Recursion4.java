package ArrayRecursion;

public class Recursion4 {
	static boolean search(int[] arr, int target, int idx) {
		
		if(idx >= arr.length) {
			return false;
		}
		
		if(arr[idx] == target) {
			System.out.printf("Index is %d \n", idx);
			return true;
		}
		
		return(search(arr, target, idx + 1));
		
//		if(search(arr, target, idx + 1) == true) {
//			return true;
//		}else {
//			return false;
//		}
		
	}
	public static void main(String[] args) {
		int[] arr = {3,5,2,3};
		int target = 3;
		System.out.println(search(arr, target, 0));
		
	}

}
