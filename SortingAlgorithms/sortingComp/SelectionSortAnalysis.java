package sortingComp;

import java.util.Random;

public class SelectionSortAnalysis {

	public static void main(String[] args) {
		Random rand = new Random();
		// hold starting time of execution of algorithm in milliseconds
		long startTime;
		// hold starting time of execution of algorithm in milliseconds
		long endTime;
		// hold time taken by algorithm for execution in milliseconds
		long elapsedTime;

		System.out.println("Selection Sort: ");
		// sizes array store the sizes of array of each execution
		final int sizes[] = { 10000, 20000, 100000, 200000, 1000000, 2000000, 20000000 };

		for (int i = 0; i < sizes.length; i++) {
			// creating array with size in above sizes array
			int array[] = new int[sizes[i]];
			// reading random numbers into array from 1 to 1000000
			for (int j = 0; j < array.length; j++) {
				array[j] = rand.nextInt(1000000) + 1;
			}
			System.out.println("\n* * * * * For Array Size " + array.length + " * * * * * ");

			// -------------------------------------------------------------------------------
			// calculating and printing elapsed time for Selection sort
			startTime = System.currentTimeMillis();
			selectionSort(array);
			endTime = System.currentTimeMillis();
			elapsedTime = endTime - startTime;
			System.out.println("Elapsed Time : " + elapsedTime + " milli seconds");

		}
	}

	// Method selectionSort to sort array in increasing order
	private static void selectionSort(int[] arr) {
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
