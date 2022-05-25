import java.util.Arrays;
import java.util.Random;

public class Sorting {

	public static void main(String[] args) throws Exception {
		Random rand = new Random();
		// hold starting time of execution of algorithm in milliseconds
		long startTime;
		// hold starting time of execution of algorithm in milliseconds
		long endTime;
		// hold time taken by algorithm for execution in milliseconds
		long elapsedTime;

		// creating array with size 100000
		int array[] = new int[100000];
		// reading random numbers into array from 1 to 1000000
		for (int j = 0; j < array.length; j++) {
			array[j] = rand.nextInt(1000000) + 1;
		}

		System.out.println("* * * * * Array Size " + array.length + " * * * * * ");

		// -------------------------------------------------------------------------------
		// calculating and printing elapsed time for insertion sort
		System.out.print("Elapsed Time for method Arrays.sort(): ");
		// creating temp1 array with same size of array
		int temp1[] = new int[array.length];
		// copying array elements to temp1 array
		for (int k = 0; k < temp1.length; k++) {
			temp1[k] = array[k];
		}
		startTime = System.currentTimeMillis();// Starting time of insertion sort
		Arrays.sort(temp1);// calling Insertion Sort
		endTime = System.currentTimeMillis();// Ending time of insertion sort
		elapsedTime = endTime - startTime;// calculating elapsed time for insertion sort
		System.out.println(elapsedTime + " milli seconds");// printing elapsed time

		// -------------------------------------------------------------------------------
		// calculating and printing elapsed time for merge sort
		System.out.print("Elapsed Time for merge Sort: ");
		// creating temp2 array with same size of array
		int temp2[] = new int[array.length];
		// copying array elements to temp2 array
		for (int k = 0; k < temp2.length; k++) {
			temp2[k] = array[k];
		}
		startTime = System.currentTimeMillis();// starting time of merge sort
		mergeSort(temp2);// calling mergeSort
		endTime = System.currentTimeMillis();// Ending time of merge sort
		elapsedTime = endTime - startTime;// calculating elapsed time for merge sort
		System.out.println(elapsedTime + " milli seconds");// printing elapsed time
		// -------------------------------------------------------------------------------

		// calculating and printing elapsed time for merge sort
		System.out.print("Elapsed Time for Selection Sort: ");
		// creating temp2 array with same size of array
		int temp3[] = new int[array.length];
		// copying array elements to temp2 array
		for (int k = 0; k < temp3.length; k++) {
			temp3[k] = array[k];
		}
		startTime = System.currentTimeMillis();// starting time of merge sort
		selectionSort(temp3);// calling mergeSort
		endTime = System.currentTimeMillis();// Ending time of merge sort
		elapsedTime = endTime - startTime;// calculating elapsed time for merge sort
		System.out.println(elapsedTime + " milli seconds");// printing elapsed time
	}

	// Merge Sort
	public static void mergeSort(int array[]) {
		mergeSort(array, 0, array.length - 1);
	}

	private static void mergeSort(int[] array, int first, int last) {
		if (first < last) {
			int mid = (first + last) / 2;
			mergeSort(array, first, mid);
			mergeSort(array, mid + 1, last);
			merge(array, first, mid, last);
		}
	}

	// Method to merge array
	private static void merge(int array[], int first, int mid, int last) {
		int left = mid - first + 1;
		int right = last - mid;
		int leftarray[] = new int[left];
		int rightarray[] = new int[right];

		for (int i = 0; i < left; i++) {
			leftarray[i] = array[first + i];
		}

		for (int i = 0; i < right; i++) {
			rightarray[i] = array[mid + i + 1];
		}
		int i = 0, j = 0, k = first;
		while (i < left && j < right) {
			if (leftarray[i] < rightarray[j]) {
				array[k] = leftarray[i];
				i++;
			} else {
				array[k] = rightarray[j];
				j++;
			}
			k++;
		}
		while (i < left) {
			array[k] = leftarray[i];
			i++;
			k++;
		}
		while (j < right) {
			array[k] = rightarray[j];
			k++;
			j++;
		}
	}

	// selection sort
	public static void selectionSort(int arr[]) {
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n - 1; i++) {
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}
	}
}
