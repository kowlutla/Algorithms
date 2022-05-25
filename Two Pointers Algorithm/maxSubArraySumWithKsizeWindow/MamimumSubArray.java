/*
	Given an array of N positive integers and a positive number K
	Find the maximum sum of any contiguous sub array of size k
	
	Ex1:
	Input:{2,1,5,1,3,2}  k=3
 	Output:9
 	Explanation:{5,1,3};
  
 */
package maxSubArraySumWithKsizeWindow;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class MamimumSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Length of array: ");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter size of window: ");
		int k=sc.nextInt();
		System.out.println("Enter elements into array: ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		int max_sum=getMaximumSum(array,k);
		System.out.println("Maximum subarray sum: "+max_sum);
		sc.close();
		

	}

	private static int getMaximumSum(int[] array, int k) {
		
		int sum=0;
		for(int i=0;i<k;i++)
		{
			sum+=array[i];
		}
		int max=0;
		
		for(int i=k;i<array.length;i++)
		{
			sum=sum+array[i]-array[i-k];
			max=Math.max(max, sum);
		}
		return max;
		
		
	}

}
