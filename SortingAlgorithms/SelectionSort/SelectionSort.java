package SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {

//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter length: ");
//		int n=sc.nextInt();
//		int array[]=new int[n];
//		System.out.println("Enter elmenents into array :");
//		for(int i=0;i<n;i++)
//		{
//			System.out.print("Element "+(i+1)+" : ");
//			array[i]=sc.nextInt();
//		}
//		
//		System.out.println("Array Before sorting :");
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.print(array[i]+" ");
//		}
//		selectioSort(array);
//		System.out.println("\nArray After sorting :");
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.print(array[i]+" ");
//		}
		
		int intArr[] = {5, 10, 7, 2, 24, 19};
		selectioSort(intArr);
		

	}

	private static void selectioSort(int[] array) {
		for(int i=0;i<array.length-1;i++)
		{
			int min=i;
			System.out.println("Pass "+(i+1));
			for(int j=i+1;j<array.length;j++)
			{
				if(array[min]>array[j])
				{
					min=j;
				}
				//System.out.println(Arrays.toString(array));
			}
			int temp=array[i];
			array[i]=array[min];
			array[min]=temp;
			System.out.println(Arrays.toString(array));
		}
		
	}

}
