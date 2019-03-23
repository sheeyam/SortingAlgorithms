public class InsertionSort {
	void sort(int arr[]) {
		
		int n = arr.length;
		
		// Loop through the array
		for (int i = 0; i < n-1; i++) {
			int key = arr[i]; 
            		int j = i - 1; 
  
            		while (j >= 0 && arr[j] > key) { 
                	arr[j + 1] = arr[j]; 
                	j = j - 1; 
            	} 
            	arr[j + 1] = key; 
	}
}
	
	public static void main(String[] args) {
		InsertionSort iSort = new InsertionSort();
		int arr[] = { 12, 45, 2, 39, 77 };
		iSort.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
