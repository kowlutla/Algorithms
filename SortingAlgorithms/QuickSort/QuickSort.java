package QuickSort;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {

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
		int first=0;
		int last=array.length-1;
		quickSort(array,first,last);
		System.out.println("\nArray After sorting :");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
	}
	
	
	public static void quickSort(int array[],int first,int last)
	{
		if(first<last)
		{
			int part=partition(array,first,last);
			quickSort(array,first,part-1);
			quickSort(array,part+1,last);
		}
	}


	private static int partition(int[] array, int first, int last) 
	{
		int lastS1=first;
		int pivot=array[first];
		for(int firstUnKnown=first+1;firstUnKnown<=last;firstUnKnown++)
		{
			if(array[firstUnKnown]<=pivot)
			{
				lastS1=lastS1+1;
				int temp=array[firstUnKnown];
				array[firstUnKnown]=array[lastS1];
				array[lastS1]=temp;
			}
		}
		int temp=array[lastS1];
		array[lastS1]=array[first];
		array[first]=temp;
		//System.out.println("partiotion: "+j);
		return lastS1;
		
	}

}
