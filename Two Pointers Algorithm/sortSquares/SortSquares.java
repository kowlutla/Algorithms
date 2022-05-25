/**
  Given an sorted array of integers sort the elements after squaring each element
  
  ex:
  	Input: {-5,-3,1,4,6}
  	Output:{1,9,16,25,36}
 */
package sortSquares;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class SortSquares {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter arrays size: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elements in ascending order ");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("Original array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		array=sortSquares(array,n);
		
		System.out.println("Square sorted array: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		sc.close();

	}

	private static int[] sortSquares(int[] array, int n) {
		
		int result[]=new int[n];
		int start=0,end=n-1,i=n-1;
		while(start<=end)
		{
			if(Math.abs(array[start])>Math.abs(array[end]))
			{
				result[i]=array[start]*array[start];
				start++;
			}
			else
			{
				result[i]=array[end]*array[end];
				end--;
			}
			i--;
		}
		return result;
	}

}
