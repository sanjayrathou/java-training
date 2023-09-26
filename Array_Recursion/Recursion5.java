package ArrayRecursion;
	

	public class Recursion5 {
		static void searchAll(int[] arr, int target, int idx) {
			
			if(idx >= arr.length) {
				return ;
			}
			
			if(arr[idx] == target) {
				System.out.println(idx);
			}
			
			searchAll(arr, target, idx + 1);
			
			
		}
		
		
		public static void main(String[] args) {
			int[] arr = {3,5,2,3};
			int target = 3;
			searchAll(arr, target, 0);
			
		}

	}



