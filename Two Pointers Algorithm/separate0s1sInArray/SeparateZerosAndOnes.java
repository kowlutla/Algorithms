/**
Separate 0’s and 1’s in a given array

Objec­tive:  Given an array which contains only 0’s and 1’s. write an algorithm to separate 0’s and 1’s.

	Example:
	--------
 	int [] arrA = {1,0,1,0,1,1,0,0,0,0,1};
	Output: [0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1]
 */
package separate0s1sInArray;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class SeparateZerosAndOnes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array Size: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elements into array 0's and 1's only: ");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		method2(array,n);
		
		System.out.println("Method1: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		sc.close();

	}

	private static void method1(int[] array, int n) {
		
		int zero_count=0;
		for(int i=0;i<n;i++)
		{
			if(array[i]==0)
			{
				zero_count++;
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(zero_count>0)
			{
				array[i]=0;
				zero_count--;
			}
			else
			{
				array[i]=1;
			}
		}
	}
	
	
	private static void method2(int array[],int n)
	{
		int start=0;
		int end=n-1;
		while(start<end)
		{
			if(array[start]==0)
			{
				start++;
			}
			else if(array[end]==1)
			{
				end--;
			}
			else
			{
				int temp=array[start];
				array[start]=array[end];
				array[end]=temp;
				start++;
				end--;
			}
		}
	}

}
