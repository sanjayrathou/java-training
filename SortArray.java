package college;

public class SortArray {
	public static void main(String[] args) {
		int[] arr = {4,6,34,42,7,81,7,98,56};
		int temp = 0;
		int n = arr.length;
		for(int i = 0; i < n / 2; i++) {
			for(int j = i + 1; j < n / 2; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = n / 2; i < n; i++) {
			for(int j = n / 2; j < n ; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for( int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
