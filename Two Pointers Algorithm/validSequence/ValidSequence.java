/*
 	PROBLEM STATEMENT: 
 	-------------------
	Given an array arr[] with N distinct numbers and another array arr1[] with N-1 operators (either < or >)
	the task is to organize the numbers to form a valid sequence which obeys relational operator rules with 
	respect to provided operators.
	
	Input: arr[] = {3, 12, 7, 8, 5}; arr1= {‘<‘, ‘>’, ‘>’, ‘<‘}
	Output: {3, 12, 8, 5, 7}
	Explanation:
	3 < 12 > 8 > 5 < 7
	
	Input: arr[] = {8, 2, 7, 1, 5, 9}; arr1[] = {‘>’, ‘>’, ‘<‘, ‘>’, ‘<‘}
	Output:{9, 8, 1, 7, 2, 5}
	Explanation:
	9 > 8 > 1 < 7 > 2 < 5 
	
  
 */
package validSequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author apiiit-rkv
 *
 */
public class ValidSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter length of array: ");
		int n=Integer.parseInt(br.readLine());
		int array[]=new int[n];
		char[] symbol=new char[n-1];
		
		System.out.println("Enter elements into array: ");
		for(int i=0;i<n;i++)
		{
			array[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Enter Relational operators either < or > ");
		
		for(int i=0;i<n-1;i++)
		{
			symbol[i]=br.readLine().charAt(0);
		}
		
		array=validSequence(array,symbol);
		
		System.out.print(array[0]+" ");
		for(int i=1,k=0;i<array.length && k<array.length-1;i++,k++)
		{
			System.out.print(symbol[k]+" "+array[i]+" ");
		}
		
		br.close();
		

	}

	private static int[] validSequence(int[] array, char[] symbol) {
		
		Arrays.parallelSort(array);
		int n=array.length;
		int result[]=new int[n];
		int i=0,j=n-1,k=0;
		while(k<n-1 && i<=j)
		{
			if(symbol[k]=='<')
			{
				result[k]=array[i];
				i++;
			}
			else
			{
				result[k]=array[j];
				j--;
			}
			k++;
		}
		
		result[n-1]=array[i];
		
		return result;
	}

}
