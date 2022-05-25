/**
 	Given two sorted arrays, the task is to merge them in a sorted manner.
 	
 	Input: arr1[] = { 1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
    Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}

    Input: arr1[] = { 5, 8, 9}, arr2[] = {4, 7, 8}
    Output: arr3[] = {4, 5, 7, 8, 8, 9} 
    
 */
package MergeSort;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class MergeTwoSortedArrays {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter lenght of first array: ");
		int m=sc.nextInt();
		System.out.print("Enter length of second array: ");
		int n=sc.nextInt();
		int array1[]=new int[m];
		int array2[]=new int[n];
		
		System.out.println("Enter elements into array1: ");
		for(int i=0;i<m;i++)
		{
			array1[i]=sc.nextInt();
		}
		
		System.out.println("Enter elements into array2: ");
		for(int i=0;i<n;i++)
		{
			array2[i]=sc.nextInt();
		}
		
		int temp[]=merge(array1,array2,m,n);
		
		System.out.println("\nResultant array after merging two arrays: ");
		for(int i=0;i<m+n;i++)
		{
			System.out.print(temp[i]+" ");
		}
		System.out.println();
		sc.close();

	}

	
	//Time complexity:O(m+n) Space complexity:O(m+n)
	private static int[] merge(int[] array1, int[] array2, int m, int n) {
		
		int result[]=new int[m+n];
		
		int first=0;
		int second=0;
		int i=0;
		while(first<m && second<n)
		{
			if(array1[first]>array2[second])
			{
				result[i]=array2[second];
				i++;
				second++;
			}
			else
			{
				result[i]=array1[first];
				first++;
				i++;
			}
		}
		
		
		while(first<m)
		{
			result[i]=array1[first];
			i++;
			first++;
		}
		while(second<n)
		{
			result[i]=array2[second];
			i++;
			second++;
		}
		
		return result;
		
	}

}
