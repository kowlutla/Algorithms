import java.util.Arrays;

public class MyClass {

	public static void main(String[] args) {
		int a=3,b=5,c=9,g=0;
		g=(a>b)?(a>c)?a:c:(b>c)?b:c;
		System.out.println(g);
	}

	public static void quickSort(int array[], int first, int last) {
		if (first < last) {
			int part = partition(array, first, last);
			System.out.println(Arrays.toString(array));
			quickSort(array, first, part - 1);
			quickSort(array, part + 1, last);
		}
	}

	private static int partition(int[] array, int first, int last) {
		int lastS1 = first;
		int pivot = array[first];
		for (int firstUnKnown = first + 1; firstUnKnown <= last; firstUnKnown++) {
			if (array[firstUnKnown] <= pivot) {
				lastS1 = lastS1 + 1;
				int temp = array[firstUnKnown];
				array[firstUnKnown] = array[lastS1];
				array[lastS1] = temp;
			}
		}
		int temp = array[lastS1];
		array[lastS1] = array[first];
		array[first] = temp;
		// System.out.println("partiotion: "+j);
		return lastS1;

	}

}
