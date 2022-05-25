package MergeSort;

import java.util.Arrays;
import java.util.Scanner;


public class MergeSort {

	static int count=0;
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		//System.out.print("Enter length: ");
		//int n=sc.nextInt();
		int array[]= {30, 5, 40, 11, 20, 9, 15, 2, 60, 25, 80, 3, 73, 35, 4, 75, 20, 6 };
//		System.out.println("Enter elmenents into array :");
//		for(int i=0;i<n;i++)
//		{
//			System.out.print("Element "+(i+1)+" : ");
//			array[i]=sc.nextInt();
//		}
		
//		System.out.println("Array Before sorting :");
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.print(array[i]+" ");
//		}
		int first=0;
		int last=array.length-1;
		mergeSort(array,first,last);
//		System.out.println("\nArray After sorting :");
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.print(array[i]+" ");
//		}
		sc.close();
		
		System.out.println("Count"+count);
		

	}

	
	private static void mergeSort(int[] array, int first, int last) {
		if(first<last)
		{
			int mid=(first+last)/2;
			mergeSort(array,first,mid);
			System.out.println(Arrays.toString(array));
			mergeSort(array,mid+1,last);
			System.out.println(Arrays.toString(array));
			merge(array,first,mid,last);
			System.out.println(Arrays.toString(array));
		}
		
	}
	
	public static void merge(int array[],int first,int mid,int last)
	{
		int left=mid-first+1;
		int right=last-mid;
		int leftarray[]=new int[left];
		int rightarray[]=new int[right];
		
		for(int i=0;i<left;i++)
		{
			leftarray[i]=array[first+i];
		}
		
		for(int i=0;i<right;i++)
		{
			rightarray[i]=array[mid+i+1];
		}
		int i=0,j=0,k=first;
		while(i<left && j<right)
		{
			if(leftarray[i]<rightarray[j])
			{
				array[k]=leftarray[i];
				i++;
			}
			else
			{
				array[k]=rightarray[j];
				j++;
				count=count+1;
			}
			k++;
		}
		while(i<left)
		{
			array[k]=leftarray[i];
			i++;k++;		
		}
		while(j<right)
		{
			array[k]=rightarray[j];
			k++;j++;
		}
		
		
	}

}
