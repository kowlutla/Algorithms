import java.util.Arrays;
import java.util.Random;

public class AllSortingAlgorithms {
	
	public static void selectionSort(int array[])
	{
		int count=0;
		int n=array.length;
		for(int i=0;i<n-1;i++)
		{
			int min_index=i;
			for(int j=i+1;j<n;j++)
			{
				if(array[j]<array[min_index])
				{
					min_index=j;
				}
				count++;
			}
			
			if(min_index!=i)
			{
				int temp=array[i];
				array[i]=array[min_index];
				array[min_index]=temp;
			}
			System.out.println("After Pass "+(i+1)+Arrays.toString(array));
		}
		System.out.println("No of Operations: "+count);
	}
	
	
	public static void bubbleSort(int array[])
	{
		int count=0;
		int n=array.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					count++;
				}
			}
			System.out.println("After Pass "+(i+1)+" : "+Arrays.toString(array));
		}
		System.out.println("No of Operations: "+count);
	}
	
	public static void insertionSort(int array[])
	{
		int count=0;
		int n=array.length;
		for(int i=1;i<n;i++)
		{
			int j=i-1;
			int key=array[i];
			while(j>=0 && array[j]>key)
			{
				array[j+1]=array[j];
				j--;
				count++;
			}
			array[j+1]=key;
			System.out.println("After Pass "+i+" : "+Arrays.toString(array));
		}
		System.out.println("No of Operations: "+count);
	}
	
	public static int[] fillArray()
	{
		int array1[]=new int[15];
		Random rand=new Random(4);
		for(int i=0;i<15;i++)
		{
			array1[i]=rand.nextInt(1000);
		}
		return array1;
	}
	
	public static void main(String[] args) {
		
		System.out.println("\n* * * * * Selection Sort* * * * *");
		int[]array1=fillArray();
		System.out.println("Original array: "+Arrays.toString(array1));
		selectionSort(array1);
		
		System.out.println("\n\n* * * * * Insertion Sort* * * * *");
		array1=fillArray();
		System.out.println("Original array: "+Arrays.toString(array1));
		insertionSort(array1);
		
		System.out.println("\n\n* * * * * Bubble Sort* * * * *");
		array1=fillArray();
		System.out.println("Original array: "+Arrays.toString(array1));
		bubbleSort(array1);
	}

}
