/**
  Count and print all Sub arrays with product less than K in O(n)
  
  Objec­tive:  Given an array of positive integers and integer ‘K’. Write an algorithm to count all 
  the possible sub arrays where product of all the elements in the sub array is less than k.
  
   Int [] nums = {10, 4, 2, 6};
	K = 100
	
	Output: 9
	Sub arrays: [10], [10 4], [10, 4, 2], [4], [4, 2], [4, 2, 6], [2], [2, 6], [6]
 */
package subArrayProduct;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class SubArrayProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array Size: ");
		int n=sc.nextInt();
		System.out.print("Enter K: ");
		int k=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elements into array: ");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		int count=countSubArrays(array,n,k);
		
		System.out.println("No of sub arrays: "+count);
		sc.close();

	}

	private static int countSubArrays(int[] array, int n, int k) {
		
		int count=0;
		int product=array[0];
		int start=0;
		int end=1;
		
		while(start<=end && end<=n)
		{
			if(product<k)
			{
				count=count+end-start;
				if(end<n)
				{
					product=product*array[end];
				}
				end++;
			}
			else
			{
				product=product/array[start];
				start++;
			}
		}
		return count;
	}

}
