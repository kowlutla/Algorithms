package heapSort;

import java.util.Scanner;

public class HeapSortAsc {
	
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
		heapSortAsc(array);
		
		System.out.println("\nAfter sorting array in Ascending order: ");
		
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	}

	public static void heapSortAsc(int[] array) {
	
		int n=array.length;
		//to build max heap
		for(int i=n/2-1;i>=0;i--)
		{
			maxheapify(array,n,i);
		}
		
		//delete element one by one
		
		for(int i=n-1;i>=0;i--)
		{
			int temp=array[0];
			array[0]=array[i];
			array[i]=temp;
			maxheapify(array,i,0);
		}
		
		
	}

	private static void maxheapify(int[] array, int n, int i) {
	
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left<n && array[left]>array[largest])
		{
			largest=left;
		}
		
		if(right<n && array[right]>array[largest])
		{
			largest=right;
		}
		
		if(largest!=i)
		{
			int temp=array[i];
			array[i]=array[largest];
			array[largest]=temp;
			maxheapify(array,n,largest);
		}
		
		
	}


}
