import java.util.Random;

public class SortingComparision2 {

	public static void main(String[] args) throws Exception {
		Random rand = new Random();
		//hold starting time of execution of algorithm in milliseconds
		long startTime;
		//hold starting time of execution of algorithm in milliseconds
		long endTime;
		//hold time taken by algorithm for execution in milliseconds
		long elapsedTime;
		
		//sizes array store the sizes of array of each execution
		final int sizes[] = {5000,10000,15000,20000, 25000,30000 };
		
		for (int i = 0; i < sizes.length; i++) {
			// creating array with size in above sizes array
			int array[] = new int[sizes[i]];
			// reading random numbers into array from 1 to 1000000
			for (int j = 0; j < array.length; j++) {
				array[j] = rand.nextInt(1000000) + 1;
			}
			
			System.out.println("* * * * * For Array Size " + array.length + " * * * * * ");

			//-------------------------------------------------------------------------------
			// calculating and printing elapsed time for insertion sort
			System.out.print("Elapsed Time for insertion Sort: ");
			// creating temp1 array with same size of array
			int temp1[] = new int[array.length];
			// copying array elements to temp1 array
			for (int k = 0; k < temp1.length; k++) {
				temp1[k] = array[k];
			}
			startTime = System.currentTimeMillis();// Starting time of insertion sort
			insertionSort(temp1);// calling Insertion Sort
			endTime = System.currentTimeMillis();// Ending time of insertion sort
			elapsedTime = endTime - startTime;// calculating elapsed time for insertion sort
			System.out.println(elapsedTime + " mills");// printing elapsed time

	
			//-------------------------------------------------------------------------------
			// calculating and printing elapsed time for HeapSort
			System.out.print("Elapsed Time for Heap Sort: ");
			// creating temp4 array with same size of array
			int temp2[] = new int[array.length];
			// copying array elements to temp4 array
			for (int k = 0; k < temp2.length; k++) {
				temp2[k] = array[k];
			}
			startTime = System.currentTimeMillis();// starting time of heapSort
			heapSort(temp2);// calling heapSort
			endTime = System.currentTimeMillis();// ending time of heapSort
			elapsedTime = endTime - startTime;// calculating elapsed time for heap sort
			System.out.println(elapsedTime + " mills");// printing elapsed time
			System.out.println("\n--------------------------------------------------\n");

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


	// Heap sort
	public static void heapSort(int[] array) {
		int n = array.length;
		// to build max heap
		for (int i = n / 2 - 1; i >= 0; i--) {
			maxheapify(array, n, i);
		}
		// delete element one by one
		for (int i = n - 1; i >= 0; i--) {
			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			maxheapify(array, i, 0);
		}
	}

	// max heapify method
	private static void maxheapify(int[] array, int n, int i) {

		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < n && array[left] > array[largest]) {
			largest = left;
		}

		if (right < n && array[right] > array[largest]) {
			largest = right;
		}

		if (largest != i) {
			int temp = array[i];
			array[i] = array[largest];
			array[largest] = temp;
			maxheapify(array, n, largest);
		}
	}
}
