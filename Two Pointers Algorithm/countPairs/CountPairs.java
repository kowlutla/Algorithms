/**
 	Problem Statement:
 	------------------
 	Given a sorted integer array and number k, the task is to count pairs in an array 
 	whose product is less than x.
 	
 	Example:
 	
 	Input: A = {2, 3, 5, 6}, k = 16
	Output: 4
	Pairs having product less than 16: (2, 3), (2, 5), (2, 6), (3, 5)
 
 
	Input: A = {2, 3, 4, 6, 9}, k = 20
	Output: 6
	Pairs having product less than 20: (2, 3), (2, 4), (2, 6), (2, 9), (3, 4), (3, 6) 
 */
package countPairs;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class CountPairs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);

		System.out.print("Length of array: ");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.print("Enter upper bound : ");
		int k=sc.nextInt();
		System.out.println("Enter elements into array : ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("Array elements: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		int count=countPairs(array,k);
		
		System.out.println("No of pairs with products less than "+k+" is: "+count);
		sc.close();
		
		printPairs(array,k);
		

	}

	//time complexity: O(n)
	private static int countPairs(int[] array, int k) {
		
		int count=0;
		
		int start=0;
		int end=array.length-1;
		while(start<end)
		{
			if(array[start]*array[end]<k)
			{
				count+=(end-start);
				start++;
			}
			else
			{
				end--;
			}
		}
		return count;
	}
	
	
	private static void printPairs(int[]array,int k)
	{
		int start=0;
		int end=array.length-1;
		while(start<end)
		{
			if(array[start]*array[end]<k)
			{
				printPairs(array,start,end);
				start++;
			}
			else
			{
				end--;
			}
		}
	}

	private static void printPairs(int[] array, int start, int end) {
		
		for(int i=start+1;i<=end;i++)
		{
			System.out.println("("+array[start]+" "+array[i]+")");
		}
		
	}
	
	
	
	
	

}
