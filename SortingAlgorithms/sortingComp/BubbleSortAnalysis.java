package sortingComp;

import java.util.Random;

public class BubbleSortAnalysis {

	public static void main(String[] args) {
		Random rand = new Random();
		// hold starting time of execution of algorithm in milliseconds
		long startTime;
		// hold starting time of execution of algorithm in milliseconds
		long endTime;
		// hold time taken by algorithm for execution in milliseconds
		long elapsedTime;

		System.out.println("Bubble Sort: ");
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
			// calculating and printing elapsed time for Bubble sort
			startTime = System.currentTimeMillis();
			bubbleSort(array);
			endTime = System.currentTimeMillis();
			elapsedTime = endTime - startTime;
			System.out.println("Elapsed Time : " + elapsedTime + " milli seconds");

		}
	}

	// method to bubble sort to sort array in increasig order
	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap temp and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
}
