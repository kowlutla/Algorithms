/**
 
 Given an array containing zeroes, ones and twos only. Write a function to sort the given array in O(n) 
 time complexity.
 
 Input :
	[1, 2, 2, 0, 0, 1, 2, 2, 1]

Output :
	[0, 0, 1, 1, 1, 2, 2, 2, 2] 
 
 
 */
package separate0s1sInArray;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class Sort012 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array Size: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elements into array 0's,1's and 2's only: ");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		method2(array,n);
		System.out.println();
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		

	}


	private static void method1(int[] array, int n) {
		
		int freq[]=new int[3];
		for(int i=0;i<n;i++)
		{
			freq[array[i]]++;
		}
		
		
		for(int i=0;i<freq.length;i++)
		{
			System.out.print(freq[i]+" ");
		}
		
		int index=0;
		for(int i=0;i<freq.length;i++)
		{
			
			while(freq[i]>0)
			{
				array[index]=i;
				index++;
				freq[i]--;
			}
			
		}
	}
	
	
	private static void method2(int array[],int n)
	{
		int low=0,mid=0,high=n-1;
		while(mid<=high)
		{
			if(array[mid]==0)
			{
				int temp=array[low];
				array[low]=array[mid];
				array[mid]=temp;
				low++;
				mid++;
			}
			else if(array[mid]==2)
			{
				int temp=array[high];
				array[high]=array[mid];
				array[mid]=temp;
				high--;
			}
			else
			{
				mid++;
			}
		}
	}

}
