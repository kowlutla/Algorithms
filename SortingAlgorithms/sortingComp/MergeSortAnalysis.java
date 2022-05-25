package sortingComp;

import java.util.Random;

public class MergeSortAnalysis {

	public static void main(String[] args) {
		Random rand = new Random();
		// hold starting time of execution of algorithm in milliseconds
		long startTime;
		// hold starting time of execution of algorithm in milliseconds
		long endTime;
		// hold time taken by algorithm for execution in milliseconds
		long elapsedTime;

		System.out.println("Merge Sort: ");
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
			// calculating and printing elapsed time for Merge sort
			startTime = System.currentTimeMillis();
			mergeSort(array);
			endTime = System.currentTimeMillis();
			elapsedTime = endTime - startTime;
			System.out.println("Elapsed Time : " + elapsedTime + " milli seconds");

		}
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

}
