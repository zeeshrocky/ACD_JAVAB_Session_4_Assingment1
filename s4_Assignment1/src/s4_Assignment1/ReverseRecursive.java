package s4_Assignment1;

public class ReverseRecursive {
	static void revereseArray(int arr[], int start, int end)
	{
	int temp;
	if (start >= end)
		return;
	temp = arr[start]; 
	arr[start] = arr[end];
	arr[end] = temp;
	revereseArray(arr, start+1, end-1); 
	}	 

	static void printArray(int arr[], int size)
	{
	
	for (int j=0; j<size; j++)
		System.out.println(arr[j]);

	} 
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5};
		printArray(arr, 5);
		revereseArray(arr, 0, 4);
		System.out.println("Reversed array is \n");
		printArray(arr, 5); 
		return;
		


	}

}
