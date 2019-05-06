
public class QuickSorting {

	public static void quickSort(int[] arr) 
	{
		quickSort(arr, 0, arr.length - 1);
	}
	
	private static void quickSort(int[] arr, int left, int right) 
	{
		if(left >= right) {
			return;
		}
		
		int pivot = arr[(left + right) / 2];
		int index = partition(arr, left, right, pivot);
		quickSort(arr, left, index - 1);
		quickSort(arr, index, right);
	}
	
	private static int partition(int[] array, int left, int right, int pivot) 
	{
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            
            while (array[right] > pivot) {
                right--;
            }
            
            if (left <= right) {
                swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

	private static void swap(int[] arr, int left, int right) 
	{
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
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
		int arr[] = {12, 11, 13, 5, 6, 7, 8}; 
		quickSort(arr);
		
		System.out.println("Quick Sorted array is:"); 
	    printArray(arr); 
	}
}
