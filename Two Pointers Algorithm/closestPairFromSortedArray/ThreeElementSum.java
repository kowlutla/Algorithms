/**
  Objective: Given an array of integers, find the sum of any three elements which is closest to zero.
   The array may contain positive and negative elements.
   
	Given Input: [-1, 4, -2, 5, 10, -5]
	Minimum Sum with three elements is: 1
	Explanation:  -1, 4, -2 sums to 1 
	
	
	Given Input: [-1, 4, -2, 5, 10, -5, 1]
	Minimum Sum with three elements is: 0
	Explanation:  1, 4, -5 sums to 0
 */
package closestPairFromSortedArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class ThreeElementSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elements into array: ");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		int close_sum=closeSumToZero(array,n);
		
		System.out.println("Closest sum to 0 is "+close_sum);
		sc.close();
		

	}

	private static int closeSumToZero(int[] array, int n) {
		
		Arrays.sort(array);
		int sum=0;
		int neg_sum=Integer.MIN_VALUE;
		int pos_sum=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			int a=array[i];
			int left=i+1;
			int right=n-1;
			while(left<right)
			{
				sum=sum+array[left]+array[right]+a;
				if(sum==0)
				{
					return 0;
				}
				else if(sum>0)
				{
					pos_sum=Math.min(pos_sum, sum);
					right--;
				}
				else
				{
					neg_sum=Math.max(neg_sum, sum);
					left++;
				}
			}
		}
		
		
		if(Math.abs(neg_sum)<pos_sum)
		{
			return neg_sum;
		}
		else
		{
			return pos_sum;
		}
		
		
		
	}

}
