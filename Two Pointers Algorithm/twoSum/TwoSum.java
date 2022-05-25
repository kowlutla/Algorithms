/*
	Given an array of Integers that are already in ascending sorted Order.
	Find Two Numbers such that they add up to a specific target number
	(the function twoSum should return indices of two numbers such that they add up to the target where index1 
	must be less than index2)
	
	INput:[2,7,11,5] target=9
	Output: 0,1
 
 */
package twoSum;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Length of array: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.print("Enter target sum: ");
		int target=sc.nextInt();
		System.out.println("Enter elements in asc order: ");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		int result[]=twoSum(array,target);
		
		System.out.println("Starting index: "+result[0]);
		System.out.println("ending index: "+result[1]);
		sc.close();
	
	}

	
	//Time complexity:O(n) Space complexity: O(1)
	private static int[] twoSum(int[] array, int target) {
		
		
		int start=0;
		int end=array.length-1;
		int result[]=new int[2];
		while(start<=end)
		{
			int sum=array[start]+array[end];
			if(sum==target)
			{
				result[0]=start;
				result[1]=end;
				break;
			}
			else if(sum>target)
			{
				end--;
			}
			else 
			{
				start++;
			}
		}
		
		return result;
	}

}
