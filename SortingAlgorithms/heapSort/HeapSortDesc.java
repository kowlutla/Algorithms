package heapSort;

import java.util.Scanner;

public class HeapSortDesc {

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
		heapSortDesc(array,n);
		
		System.out.println("\nDescending Order of array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}

	}

	private static void heapSortDesc(int[] array, int n) {
		
		//to build min heap
		for(int i=n/2-1;i>=0;i--)
		{
			minheapify(array,n,i);
		}
		
		//to extract element one by one
		
		for(int i=n-1;i>=0;i--)
		{
			int temp=array[0];
			array[0]=array[i];
			array[i]=temp;
			minheapify(array,i,0);
		}
		
	}

	private static void minheapify(int[] array, int n, int i) {
		
		int small=i;
		int left=2*i+1;
		int right=2*i+2;
		
		if(left<n && array[left]<array[small])
		{
			small=left;
		}
		
		if(right<n && array[right]<array[small])
		{
			small=right;
		}
		
		if(small!=i)
		{
			int temp=array[small];
			array[small]=array[i];
			array[i]=temp;
			minheapify(array,n,small);
		}
		
	}

}
