/**
 	Problem:
 	---------
 		Given an array arr[] of length N, the task is to remove the minimum number of elements 
 		from the ends of the array to make the array non-decreasing. Elements can only be removed
 		from the left or the right end.
 		
 	Examples:
 	---------
 		Input: arr[] = {1, 2, 4, 1, 5}
		Output: 2
		
		Input: arr[] = {3, 2, 1}
		Output: 2 
  
 */
package elementsRemoveToSorted;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class NumberOfElementsRemoveToSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elements into array: ");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Array elements: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}	
		
		int remove=findMinRemoval(array,n);
		System.out.println("\nMinimum no of elements removed to make array sorted: "+remove);
		sc.close();
	}

	private static int findMinRemoval(int[] array, int n) {
		
		int max=1;
		for(int i=0;i<n;i++)
		{
			int j=i+1;
			while(j<n && array[j]>=array[j-1])
				j++;
			max=Math.max(max, (j-i));
			i=j-1; //all the numbers until j-1 are in increasing order
		}
		return n-max;
	}

}
