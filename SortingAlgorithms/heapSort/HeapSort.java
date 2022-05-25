package heapSort;

import java.util.Scanner;

public class HeapSort {

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
		heapSort(array,n);
		
		System.out.println("\nAfter sorting array: ");
		
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		sc.close();
		
	}

	private static void heapSort(int[] array, int n) {
	
		//to build max heap
		for(int i=n/2-1;i>=0;i--)
		{
			heapify(array,n,i);
		}
		
		//delete element one by one
		
		for(int i=n-1;i>=0;i--)
		{
			int temp=array[0];
			array[0]=array[i];
			array[i]=temp;
			heapify(array,i,0);
		}
		
		
	}

	private static void heapify(int[] array, int n, int i) {
	
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
			heapify(array,n,largest);
		}
	}

}
