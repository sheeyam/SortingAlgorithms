
public class SelectionSort {
	
	void sort(int arr[]){
		
		int n = arr.length;
		
		// Loop through the array
		for (int i = 0; i < n-1; i++) {
			int min_index = i;
			for (int j = i+1; j < n; j++) {
				if(arr[j] < arr[min_index]) {
					min_index = j; 
				}
			}
			
			// Swap the Values
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
	}
	
	public static void main(String[] args) {
		SelectionSort sSort = new SelectionSort();
		int arr[] = { 12, 45, 2, 39, 77 };
		sSort.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
