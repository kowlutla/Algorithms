package sortingComp;

import java.util.Random;

public class InsertionSortAnalysis {
	

	public static void main(String[] args) {
		Random rand = new Random();
		// hold starting time of execution of algorithm in milliseconds
		long startTime;
		// hold starting time of execution of algorithm in milliseconds
		long endTime;
		// hold time taken by algorithm for execution in milliseconds
		long elapsedTime;

		System.out.println("Insertion Sort: ");
		// sizes array store the sizes of array of each execution
		final int sizes[] = { 10000,20000,100000,200000,1000000,2000000,20000000};

		for (int i = 0; i < sizes.length; i++) 
		{
			// creating array with size in above sizes array
			int array[] = new int[sizes[i]];
			// reading random numbers into array from 1 to 1000000
			for (int j = 0; j < array.length; j++) {
				array[j] = rand.nextInt(1000000) + 1;
			}
			System.out.println("\n* * * * * For Array Size " + array.length + " * * * * * ");

			// -------------------------------------------------------------------------------
			// calculating and printing elapsed time for Insertion sort
			startTime=System.currentTimeMillis();
			insertionSort(array);
			endTime=System.currentTimeMillis();
			elapsedTime=endTime-startTime;
			System.out.println("Elapsed Time : "+elapsedTime+" milli seconds");
			
		}
	}
		// Insertion sort
		public static void insertionSort(int[] array) {
			for (int i = 1; i < array.length; i++) {
				int key = array[i];
				int j = i - 1;
				while (j >= 0 && array[j] > key) {
					array[j + 1] = array[j];
					j = j - 1;
				}
				array[j + 1] = key;
			}
		}
}
