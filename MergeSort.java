public class MergeSort {
	
	private static void PrintArray(int[] arr) {
		for(int x: arr) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	private static int[] mergeSort(int[] array) {
		
		if(array.length <= 1) {
			return array;
		}
		
		int midpoint = array.length / 2;
		int[] left = new int[midpoint];
		int[] right;
		
		if(array.length % 2 == 0) {
			right = new int[midpoint];
		} else {
			right = new int[midpoint + 1];
		}
		
		for (int i = 0; i < midpoint; i++) {
			left[i] = array[i];
		}
		
		for (int j = 0; j < right.length; j++) {
			right[j] = array[midpoint + j];
		}
		
		int[] result = new int[array.length];
		
		left = mergeSort(left);
		right = mergeSort(right);
		
		result = Merge(left, right);
		return result;
		
	}
	
	private static int[] Merge(int[] left, int[] right) {
		int[] result = new int[left.length + right.length];
		
		int leftPointer, rightPointer, resultPointer;
		leftPointer = rightPointer = resultPointer = 0;
		
		while(leftPointer < left.length || rightPointer < right.length) {
			if(leftPointer < left.length && rightPointer < right.length) {
				if(left[leftPointer] < right[rightPointer]) {
					result[resultPointer++] = left[leftPointer++];
				} else {
					result[resultPointer++] = right[rightPointer++];
				}
			} else if (leftPointer < left.length) {
				result[resultPointer++] = left[leftPointer++];
			} else if (rightPointer < right.length) {
				result[resultPointer++] = right[rightPointer++];
			}
		} 
		return result;
	}
	
	public static void main(String[] args) {
		//Initial
		int arr[] = { 12, 45, 7, 88, 28 };		
		System.out.println("Initial --->");		
		PrintArray(arr);		

		// Sorted and Merged.
		arr = mergeSort(arr);
		System.out.println("Sorted --- >");	
		PrintArray(arr);
	}

}
