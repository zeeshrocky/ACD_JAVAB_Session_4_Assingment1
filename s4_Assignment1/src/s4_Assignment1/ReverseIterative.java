package s4_Assignment1;

public class ReverseIterative {
	
	static void revereseArray(int arr[], int start, int end)
	{
		int temp;
		while (start < end)
		{
			temp = arr[start]; 
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		} 
	}	 

	static void printArray(int arr[], int size)
	{
	for (int i=0; i < size; i++)
		System.out.println(+arr[i]);

	} 

	public static void main(String[] args) {
			
		int arr[] = {1, 2, 3, 4, 5, 6};
		printArray(arr, 6);
		revereseArray(arr, 0, 5);
		System.out.println("Reversed array is \n");
		printArray(arr, 6); 
		return;
	}

}
