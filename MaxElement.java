package college;

public class MaxElement {
	public static int  findMax(int[] arr) {
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;

		}
	
	public static void main(String[] args) {
		int[] arr = {23,5,67,-405,34,-5};
	System.out.println(findMax(arr)); 
		
	}

}


