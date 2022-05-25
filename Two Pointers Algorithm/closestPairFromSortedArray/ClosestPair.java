/**
  Problem Statement: 
  ------------------
  Given two sorted arrays and a number x, find the pair whose sum is closest 
  to x and the pair has an element from each array. 
  
  We are given two arrays ar1[0…m-1] and ar2[0..n-1] and a number x, we need to find the 
  pair ar1[i] + ar2[j] such that absolute value of (ar1[i] + ar2[j] – x) is minimum.
  
	Input:  ar1[] = {1, 4, 5, 7};
	      	ar2[] = {10, 20, 30, 40};
	        x = 32    
	          
	Output: 1 and 30
	
	Input:  ar1[] = {1, 4, 5, 7};
	        ar2[] = {10, 20, 30, 40};
	        x = 50      
	Output:  7 and 40
  
  
 */
package closestPairFromSortedArray;
import java.util.*;

/**
 * @author apiiit-rkv
 *
 */
public class ClosestPair {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of first array: ");
		int n=sc.nextInt();
		System.out.print("Enter length of second array: ");
		int m=sc.nextInt();
		System.out.println("Enter sum X:");
		int x=sc.nextInt();
		int array1[]=new int[m];
		int array2[]=new int[n];
		
		System.out.println("Enter elements into array1: ");
		for(int i=0;i<m;i++)
		{
			array1[i]=sc.nextInt();
		}
		
		System.out.println("Enter elements into array2: ");
		for(int i=0;i<n	;i++)
		{
			array2[i]=sc.nextInt();
		}
		
		int close_sum[]=closeSum(array1,array2,x);
		System.out.println("Closest sum: "+array1[close_sum[0]]+" and "+array2[close_sum[1]]);
		
		closeSum(array1,m,array2,n,x);
		sc.close();
		
		
		

	}

	private static void closeSum(int[] array1, int m, int[] array2, int n, int x) {
		
		int dif=Integer.MAX_VALUE;
		
		int array1_value=0;
		int array2_value=0;
		int l=0;
		int r=n-1;
		
	
		while(l<m && r>=0)
		{
			if(Math.abs(array1[l]+array2[r]-x)<dif)
			{
				array1_value=array1[l];
				array2_value=array2[r];
				dif=Math.abs(array1[l]+array2[r]-x);
			}
			
			if(array1[l]+array2[r]>x)
			{
				r--;
			}
			else
			{
				l++;
			}
		}
		
		System.out.println("Closest sum: "+array1_value+" and "+array2_value);
		
	}

	private static int[] closeSum(int[] array1, int[] array2, int x) {
		
		int min_sum=Integer.MAX_VALUE;
		int start=0,last=0;
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array2.length;j++)
			{
				if(min_sum>Math.abs(array1[i]+array2[j]-x))
				{
					start=i;last=j;
					min_sum=Math.abs(array1[i]+array2[j]-x);
				}
			}
		}
		return new int[]{start,last};
	}

}
