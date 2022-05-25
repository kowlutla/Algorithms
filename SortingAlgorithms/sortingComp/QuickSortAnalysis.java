package sortingComp;

import java.util.Random;

public class QuickSortAnalysis {

	public static void main(String[] args) {
		Random rand = new Random();
		// hold starting time of execution of algorithm in milliseconds
		long startTime;
		// hold starting time of execution of algorithm in milliseconds
		long endTime;
		// hold time taken by algorithm for execution in milliseconds
		long elapsedTime;
		
		System.out.println("Quick Sort: ");
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
			// calculating and printing elapsed time for Quick sort
			startTime = System.currentTimeMillis();
			quickSort(array);
			endTime = System.currentTimeMillis();
			elapsedTime = endTime - startTime;
			System.out.println("Elapsed Time : " + elapsedTime + " milli seconds");

		}
	}

	// Quick sort
	public static void quickSort(int array[]) {
		quickSort(array, 0, array.length - 1);
	}

	private static void quickSort(int array[], int first, int last) {
		if (first < last) {
			int part = partition(array, first, last);
			quickSort(array, first, part - 1);
			quickSort(array, part + 1, last);
		}
	}

	// method to find the partition index
	private static int partition(int[] array, int first, int last) {
		int pivot = array[last];
		int j = first - 1;
		for (int i = first; i < last; i++) {
			if (array[i] < pivot) {
				j = j + 1;
				swap(array, i, j);
			}
		}
		j = j + 1;
		swap(array, j, last);
		return j;
	}

	private static void swap(int array[], int dex1, int dex2) {
		int temp = array[dex1];
		array[dex1] = array[dex2];
		array[dex2] = temp;
	}

}
