import java.util.Arrays;

public class ParitySort {

	public static void main(String[] args) {

		// Array to sort
		int data[] = { 1701, 15, 137, 17, 666, 555};
		// printing original data
		System.out.print("Original Data: ");
		for (int k : data) {
			System.out.print(k + " ");
		}

		System.out.println("\n");
		// calling parity sorting method to sort
		paritySort(data);
		// printing sorted data
		System.out.print("\nSorted Data: ");
		for (int k : data) {
			System.out.print(k + " ");
		}

	}

	// variable to count the pass
    //increments for each time when pass start with 0 and start with 1
	static int pass = 0;

	// Method to sort the array
	public static void paritySort(int array[]) {
		// traverse the each element in array
		for (int i = 0; i <=array.length/2; i++) {
			// starts with 0 (even indices)
			for (int j = 0; j < array.length - 1; j = j + 2) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
			System.out.println("Pass# " + (++pass) + "  " + Arrays.toString(array));
			// starts with 1(Odd indices)
			for (int j = 1; j < array.length - 1; j = j + 2) {
				if (array[j] > array[j + 1]) {
					swap(array, j, j + 1);
				}
			}
			System.out.println("Pass# " + (++pass) + "  " + Arrays.toString(array));
		}
	}

	// Helper method to swap the array elements
	private static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

}
