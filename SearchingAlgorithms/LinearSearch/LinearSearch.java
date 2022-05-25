package LinearSearch;

import java.util.Scanner;

public class LinearSearch {

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
		System.out.println("Enter key to search: ");
		int key=sc.nextInt();
		System.out.println("Array elements: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		
		System.out.println("Method1 to check key is there or not");
		boolean isThere=linearSearch(array,key);
		if(isThere)
		{
			System.out.println(key+" is present in array ");
		}
		else
		{
			System.out.println(key+" is not present in array");
		}
		
		
		
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");
		System.out.println("Using Method2 to print where key is present ");
		int index=linearSearch1(array,key);
		if(index==-1)
		{
			System.out.println(key+" is not present in array");
		}
		else
		{
			System.out.println(key+" is )present in array at "+index+" indexed Position");
		}
		
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("Method3 to check key is there or not");
		boolean recursionsearch=linearSearchRecursion(array,0,key);
		if(recursionsearch)
		{
			System.out.println(key+" is present in array");
		}
		else
		{
			System.out.println(key+" is not present in array");
		}
		
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("Using Method4 to print where key is present ");
		int recursionsearch1=linearSearchRecursion(array,key);
		if(recursionsearch1!=-1)
		{
			System.out.println(key+" is present in array at "+recursionsearch1+" indexed position");
		}
		else
		{
			System.out.println(key+" is not present in array");
		}
		sc.close();
		
	}

	//METHOD1
	//Iterative Method to check whether key is present in array or not
	private static boolean linearSearch(int[] array, int key) 
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==key)
			{
				return true;
			}
		}
		return false;
	}
	
	//METHOD2
	//Using Iterative method to  print where key is present in array 
	private static int linearSearch1(int[] array, int key) 
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==key)
			{
				return i;
			}
		}
		return -1;
	}
	
	
	//METHOD3
	//Using RECURSIVE METHOD to only know whether key is present in array or not
	
	public static boolean linearSearchRecursion(int array[],int start,int key)
	{
		
		if(start==array.length)
		{
			return false;
		}
		if(array[start]==key)
		{
			return true;
		}
		return linearSearchRecursion(array,start+1,key);
	}
	
	//METHOD4
	//Using RECURSIVE METHOD to only print where key is present in array 
	private static int linearSearchRecursion(int[] array, int key) {
		int start=0;
		int last=array.length;
		return linearSearchRecursion(array,start,last,key);
	}

	private static int linearSearchRecursion(int[] array, int start, int last, int key) 
	{
		if(start==last)
		{
			return -1;
		}
		if(array[start]==key)
		{
			return start;
		}
		return linearSearchRecursion(array,start+1,last,key);
	}
}
