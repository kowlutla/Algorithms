package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) 
	{
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
		System.out.println("Enter key to search: ");
		int key=sc.nextInt();
		System.out.println("Array elements: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		Arrays.parallelSort(array);
		System.out.println("Just checking whether key is present ot not");
		int first=0,last=array.length-1;
		boolean isThere=binarySearch(array,first,last,key);
		if(isThere)
		{
			System.out.println(key+" is present in array ");
		}
		else
		{
			System.out.println(key+" is not present in array");
		}
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("Checking where the key is present ");
		int index=binarySearch1(array,first,last,key);
		if(index==-1)
		{
			System.out.println(key+" is not present in array ");
		}
		else
		{
			System.out.println(key+" is present in array at "+index+" indexed position");
		}

	}

	private static boolean binarySearch(int[] array, int first, int last, int key)
	{
		if(first<=last)
		{
			int mid=(first+last)/2;
			if(array[mid]==key)
			{
				return true;
			}
			if(key<array[mid])
			{
				return binarySearch(array,first,mid-1,key);
			}
			return binarySearch(array,mid+1,last,key);
		}
		return false;
	}
	
	public static int binarySearch1(int array[],int first,int last,int key)
	{
		if(first<=last)
		{
			int mid=(first+last)/2;
			if(array[mid]==key)
			{
				return mid;
			}
			if(key<array[mid])
			{
				return binarySearch1(array,first,mid-1,key);
			}
			return binarySearch1(array,mid+1,last,key);
		}
		return -1;
		
		
	}

}
