package bubbleSort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		int n=sc.nextInt();
		String array[]=new String[n];
		System.out.println("Enter elmenents into array :");
		for(int i=0;i<n;i++)
		{
			//System.out.print("Element "+(i+1)+" : ");
			array[i]=sc.next();
		}
		
		System.out.println("Array Before sorting :");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		bubbleSort(array);
		System.out.println("\nArray After sorting :");
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]+" ");
		}
		
		int temp[]= {2,4,6,7,1,10,3};
		for(int k:temp)
		{
			System.out.print(k+" ");
		}
		
		System.out.println();
		paritySort(temp);
		for(int k:temp)
		{
			System.out.print(k+" ");
		}
		
		

	}

	private static void bubbleSort(String[] array) {
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int j=0;j<array.length-i-1;j++)
			{
				if(array[j].compareTo(array[j+1])>0)
				{
					String temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
	
	public static void paritySort(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-i-1;j=j+2)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			
			for(int j=1;j<array.length-i-1;j=j+2)
			{
				if(array[j]>array[j+1])
				{
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}

}
