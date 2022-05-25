/**
  	Objective: Given k sorted array, write an algorithm to merge Them into One sorted array.
  	
  	int[][] A = new int[5][];

	A[0] = new int[] { 1, 5, 8, 9 };
	A[1] = new int[] { 2, 3, 7, 10 };
	A[2] = new int[] { 4, 6, 11, 15 };
	A[3] = new int[] { 9, 14, 16, 19 };
	A[4] = new int[] { 2, 4, 6, 9 };
	
	Output:
	[1, 2, 2, 3, 4, 4, 5, 6, 6, 7, 8, 9, 9, 9, 10, 11, 14, 15, 16, 19]
  	
 */
package MergeSort;

import java.util.Arrays;
import java.util.Scanner;
import MergeSort.MergeThreeSortedArrays;

/**
 * @author apiiit-rkv
 *
 */
public class MergeKSortedArrays {

	
	public static void main(String[] args) {
		
		MergeThreeSortedArrays merge=new MergeThreeSortedArrays();
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of Arrays: ");
		int n=sc.nextInt();
		int array[][]=new int[n][];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter no of elements to array "+(i+1)+" : ");
			int m=sc.nextInt();
			int temp[]=new int[m];
			System.out.println("Enter array "+(i+1)+" Elements: ");
			for(int j=0;j<m;j++)
			{
				temp[j]=sc.nextInt();
			}
			
			array[i]=temp;
		}
		
		
		for(int i=0;i<n;i++)
		{
			System.out.println(Arrays.toString(array[i]));
		}
		
		int result[]=merge.mergeArrays(array[0],array[1],array[0].length,array[1].length);
		
		
		for(int i=2;i<array.length;i++)
		{
			result=merge.mergeArrays(result, array[i], result.length, array[i].length);
		}
		System.out.println(Arrays.toString(result));
		
		
		

	}

}
