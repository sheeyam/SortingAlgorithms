
public class MergeSorting {

	public static void MergeSort(int[] array) 
	{
		MergeSort(array, new int[array.length], 0, array.length - 1);
	}
	
	private static void MergeSort(int[] array, int[] temp, int leftStart, int rightEnd) 
	{
		if(leftStart >= rightEnd) {
			return;
		}
		
		int middle = (leftStart + rightEnd) / 2;
		MergeSort(array, temp, leftStart, middle);
		MergeSort(array, temp, middle + 1, rightEnd);
		MergeHalves(array, temp, leftStart, rightEnd);
	}
	
	private static void MergeHalves(int[] array, int[] temp, int leftStart, int rightEnd) 
	{
		int leftEnd = (leftStart + rightEnd) / 2;
		int rightStart = leftEnd + 1;
		int size = rightEnd - leftStart + 1;
		
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while(left <= leftEnd && right <= rightEnd) {
			if(array[left] < array[right]) {
				temp[index] = array[left];
				left++;
			} else {
				temp[index] = array[right];
				right++; 
			}
			index++;
		}
		
		System.arraycopy(array, left, temp, index, leftEnd - left + 1);
		System.arraycopy(array, right, temp, index, rightEnd - right + 1);
		System.arraycopy(temp, leftStart, array, leftStart, size);
	}
	
	static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 

	public static void main(String[] args) 
	{
		int arr[] = {12, 11, 13, 5, 6, 7}; 
		MergeSort(arr);
		
		System.out.println("Merged Sorted array is:"); 
	    printArray(arr); 
	}
}
