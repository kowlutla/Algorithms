import java.util.Arrays;
import java.util.Random;

public class SortingAlgoComparision {

	public static void main(String[] args) throws Exception {
		Random rand = new Random();
		// hold starting time of execution of algorithm in milliseconds
		long startTime;
		// hold starting time of execution of algorithm in milliseconds
		long endTime;
		// hold time taken by algorithm for execution in milliseconds
		long elapsedTime;

		// sizes array store the sizes of array of each execution
		final int sizes[] = { 10,100,1000,10000,100000};

		for (int i = 0; i < sizes.length; i++) 
		{
			// creating array with size in above sizes array
			int array[] = new int[sizes[i]];
			// reading random numbers into array from 1 to 1000000
			for (int j = 0; j < array.length; j++) {
				array[j] = rand.nextInt(1000000) + 1;
			}

			System.out.println("* * * * * For Array Size " + array.length + " * * * * * ");

			// -------------------------------------------------------------------------------
			// calculating and printing elapsed time for insertion sort
			System.out.print("Elapsed Time for insertion Sort: ");
			// creating temp1 array with same size of array
			int temp1[] = new int[array.length];
			// copying array elements to temp1 array
			for (int k = 0; k < temp1.length; k++) {
				temp1[k] = array[k];
			}
			startTime = System.nanoTime();// Starting time of insertion sort
			insertionSort(temp1);// calling Insertion Sort
			endTime = System.nanoTime();// Ending time of insertion sort
			elapsedTime = endTime - startTime;// calculating elapsed time for insertion sort
			System.out.println(elapsedTime + " nanos");// printing elapsed time

			// -------------------------------------------------------------------------------
			// calculating and printing elapsed time for merge sort
			System.out.print("Elapsed Time for merge Sort: ");
			// creating temp2 array with same size of array
			int temp2[] = new int[array.length];
			// copying array elements to temp2 array
			for (int k = 0; k < temp2.length; k++) {
				temp2[k] = array[k];
			}
			startTime = System.nanoTime();// starting time of merge sort
			mergeSort(temp2);// calling mergeSort
			endTime = System.nanoTime();// Ending time of merge sort
			elapsedTime = endTime - startTime;// calculating elapsed time for merge sort
			System.out.println(elapsedTime + " nanos");// printing elapsed time

			// -------------------------------------------------------------------------------
			// calculating and printing elapsed time for HeapSort
			System.out.print("Elapsed Time for Heap Sort: ");
			// creating temp4 array with same size of array
			int temp3[] = new int[array.length];
			// copying array elements to temp4 array
			for (int k = 0; k < temp3.length; k++) {
				temp3[k] = array[k];
			}
			startTime = System.nanoTime();// starting time of heapSort
			heapSort(temp3);// calling heapSort
			endTime = System.nanoTime();// ending time of heapSort
			elapsedTime = endTime - startTime;// calculating elapsed time for heap sort
			System.out.println(elapsedTime + " nanos");// printing elapsed time

//			// -------------------------------------------------------------------------------
			// calculating and printing elapsed time for QuickSort
			System.out.print("Elapsed Time for Quick Sort: ");
			// creating temp3 array with same size of array
			int temp4[] = new int[array.length];
			// copying array elements to temp3 array
			for (int k = 0; k < temp4.length; k++) {
				temp4[k] = array[k];
			}
			startTime = System.nanoTime();// starting time of Quick Sort
			quickSort(temp4);// calling quickSort
			endTime = System.nanoTime();// Ending time of QuickSort
			elapsedTime = endTime - startTime;// calculating elapsed time for quick sort
			System.out.println(elapsedTime + " nanos");// printing elapsed time
			// -------------------------------------------------------------------------------
			// calculating and printing elapsed time for QuickSortRandom
			System.out.print("Elapsed Time for Quick Sort Random: ");
			// creating temp3 array with same size of array
			int temp5[] = new int[array.length];
			// copying array elements to temp3 array
			for (int k = 0; k < temp5.length; k++) {
				temp5[k] = array[k];
			}
			startTime = System.nanoTime();// starting time of Quick Sort
			quickSortRandom(temp5);// calling quickSort
			endTime = System.nanoTime();// Ending time of QuickSort
			elapsedTime = endTime - startTime;// calculating elapsed time for quick sort
			System.out.println(elapsedTime + " nonos");// printing elapsed time
			
			// -------------------------------------------------------------------------------
			// calculating and printing elapsed time for QuickSortRandom
			System.out.print("Elapsed Time for radixSort: ");
			// creating temp3 array with same size of array
			int temp6[] = new int[array.length];
			// copying array elements to temp3 array
			for (int k = 0; k < temp6.length; k++) {
				temp6[k] = array[k];
			}
			startTime = System.nanoTime();// starting time of Quick Sort
			radixsort(temp6);// calling quickSort
			endTime = System.nanoTime();// Ending time of QuickSort
			elapsedTime = endTime - startTime;// calculating elapsed time for quick sort
			System.out.println(elapsedTime + " nonos");// printing elapsed time

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

	// Heap sort
	public static void heapSort(int[] array) {
		int n = array.length;
		// to build max heap
		for (int i = n / 2 - 1; i >= 0; i--) {
			maxheapify(array, n, i);
		}
		// delete element one by one
		for (int i = n - 1; i >= 0; i--) {
			swap(array, 0, i);
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
			swap(array, i, largest);
			maxheapify(array, n, largest);
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

	// Quick sort with random pivot
	public static void quickSortRandom(int array[]) {
		quickSortRandom(array, 0, array.length - 1);
	}

	private static void quickSortRandom(int array[], int left, int right)

	{
		if (right - left <= 0)
			return;
		else {
			Random rand = new Random();
			int pivotIndex = left + rand.nextInt(right - left + 1);
			swap(array, pivotIndex, right);
			int pivot = array[right];
			int partition = partitionIt(array, left, right, pivot);
			quickSortRandom(array, left, partition - 1);
			quickSortRandom(array, partition + 1, right);
		}
	}

	// method to partion the array with random pivot value
	private static int partitionIt(int array[], int left, int right, long pivot) {
		int leftPtr = left - 1;
		int rightPtr = right;
		while (true) {
			while (array[++leftPtr] < pivot)
				;
			while (rightPtr > 0 && array[--rightPtr] > pivot)
				;
			if (leftPtr >= rightPtr)
				break;
			else
				swap(array, leftPtr, rightPtr);
		}
		swap(array, leftPtr, right);
		return leftPtr;
	}

	private static void swap(int array[], int dex1, int dex2) {
		int temp = array[dex1];
		array[dex1] = array[dex2];
		array[dex2] = temp;
	}

	// ------------------------------------------------------------------------
	public static void radixsort(int[] arr) {
		radixsort(arr, arr.length);
	}

// The main function to that sorts arr[] of size n using 
// Radix Sort 
	private static void radixsort(int arr[], int n) {
		// Find the maximum number to know number of digits
		int m = getMax(arr, n);

		// Do counting sort for every digit. Note that instead
		// of passing digit number, exp is passed. exp is 10^i
		// where i is current digit number
		for (int exp = 1; m / exp > 0; exp *= 10)
			countSort(arr, n, exp);
	}

	// A function to do counting sort of arr[] according to
	// the digit represented by exp.
	private static void countSort(int arr[], int n, int exp) {
		int output[] = new int[n]; // output array
		int j;
		int count[] = new int[10];
		Arrays.fill(count, 0);

		// Store count of occurrences in count[]
		for (j = 0; j < n; j++)
			count[(arr[j] / exp) % 10]++;

		// Change count[i] so that count[i] now contains
		// actual position of this digit in output[]
		for (j = 1; j < 10; j++)
			count[j] += count[j - 1];

		// Build the output array
		for (j = n - 1; j >= 0; j--) {
			output[count[(arr[j] / exp) % 10] - 1] = arr[j];
			count[(arr[j] / exp) % 10]--;
		}

		// Copy the output array to arr[], so that arr[] now
		// contains sorted numbers according to current digit
		for (j = 0; j < n; j++)
			arr[j] = output[j];
	}

	// A utility function to get maximum value in arr[]
	private static int getMax(int arr[], int n) {
		int mx = arr[0];
		for (int i = 1; i < n; i++)
			if (arr[i] > mx)
				mx = arr[i];
		return mx;
	}
}
