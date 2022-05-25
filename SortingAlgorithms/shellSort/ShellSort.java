package shellSort;

import java.util.Arrays;
import java.util.Scanner;

public class ShellSort {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elmenents into array :");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("Array Before sorting :");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		shellSort(array,n);
		
		System.out.println("\nAfter sorting array: ");
		
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}

	}

	private static void shellSort(int[] array, int n) {
		
		
		for(int gap=n/2;gap>0;gap=gap/2)
		{
			for(int i=gap;i<n;i++)
			{
				for(int j=i-gap;j>=0;j=j-gap)
				{
					if(array[j+gap]>array[j])
					{
						break;
					}
					else
					{
						int temp=array[j];
						array[j]=array[j+gap];
						array[j+gap]=temp;
					}
				}
			}
			System.out.println(Arrays.toString(array));
		}
		
	}

}
