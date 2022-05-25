/**
 	Given an unsorted array, sort the given array. You are allowed to do only following operation on array. 
 	flip(arr, i): Reverse array from 0 to i (No swapping)
  
 */
package prefixSortingProblem;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class PrefixSorting {

	/**
	 * @param args
	 */
	static int count=0;
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
		
		prefixSorting(array,n);
		
		System.out.println("\nAfter sorting: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		sc.close();
		System.out.println("Count: "+count);

	}

	
	private static void prefixSorting(int[] array, int n) {
		
		for(int i=n;i>0;i--)
		{
			int max=findMax(array,i);
			
			if(max!=i-1)
			{
				count++;
				flip(array,max);
				flip(array,i-1);
				
			}
			
			//System.out.println(Arrays.toString(array));
		}
		
	}

	private static void flip(int[] array, int max) {
	
		//count++;
		int start=0;
		while(start<max)
		{
			int temp=array[start];
			array[start]=array[max];
			array[max]=temp;
			start++;
			max--;
		}
		
	}

	private static int findMax(int[] array, int n) {
		
		int max=array[0],index=0;;
		for(int j=1;j<n;j++)
		{
			if(array[j]>max)
			{
				max=array[j];
				index=j;
			}
		}
		return index;
	}

}
