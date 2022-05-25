/**

 	We are given two sorted array. We need to merge these two arrays such that the initial
 	numbers (after complete sorting) are in the first array and the remaining numbers are in 
 	the second array. Extra space allowed in O(1).
 	
 	Input: ar1[] = {10};
       	   ar2[] = {2, 3};
       
	Output: ar1[] = {2}
	        ar2[] = {3, 10}  
	
	Input: ar1[] = {1, 5, 9, 10, 15, 20};
	       ar2[] = {2, 3, 8, 13};
	       
	Output: ar1[] = {1, 2, 3, 5, 8, 9}
	        ar2[] = {10, 13, 15, 20} 

 */
package MergeSort;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class MergeTwoSortedArraysWithoutSpace {

	/**
	 * @param args
	 */
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
		
		mergeSortedArrays(array1,array2,m,n);
		
		for(int i=0;i<m;i++)
		{
			System.out.print(array1[i]+" ");
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(array2[i]+" ");
		}
		
		sc.close();

	}

	//Time complexity:O(m*n)
	private static void mergeSortedArrays(int[] array1, int[] array2, int m, int n) {
		
		if(m==0 || n==0)
			return;
		
		for(int i=n-1;i>=0;i--)
		{
			int last=array1[m-1],j=0;
			for(j=m-2;j>=0 && array1[j]>array2[i];j--)
			{
				array1[j+1]=array1[j];
			}
			
			if(j!=m-2)
			{
				array1[j+1]=array2[i];
				array2[i]=last;
			}
		}
		
	}

}
