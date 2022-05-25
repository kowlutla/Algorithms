package InsertionSort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) 
	{
		InsertionSort is=new InsertionSort();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elmenents into array :");
		for(int i=0;i<n;i++)
		{
			System.out.print("Element "+(i+1)+" : ");
			array[i]=sc.nextInt();
		}
		
		System.out.println("Array Before sorting :");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		is.insertionSort(array);
		System.out.println("\nArray After sorting :");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		is.insertionSort(array);
		
	}

	private void insertionSort(int[] array) 
	{
		for(int i=1;i<array.length;i++)
		{
			int key=array[i];
			int j=i-1;
			while(j>=0 && array[j]>key)
			{
				array[j+1]=array[j];
				j=j-1;
			}
			array[j+1]=key;
		}
		
	}

}
