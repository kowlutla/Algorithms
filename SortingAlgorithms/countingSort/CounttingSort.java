package countingSort;

import java.util.Arrays;
import java.util.Scanner;

public class CounttingSort {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter length of array: ");
//		int n=sc.nextInt();
//		int array[]=new int[n];
//		System.out.println("Enter elements into array: ");
//		for(int i=0;i<n;i++)
//		{
//			System.out.print("Enter element "+(i+1)+" : ");
//			array[i]=sc.nextInt();
//		}
		
		int array[]= {1,2,4,6,5,4,4,1,4,1};
		countSort(array);

	}

	private static void countSort(int[] array) {
		
//		//to find the range of values in array
//		int max=array[0];
//		for(int i=1;i<array.length;i++)
//		{
//			max=Math.max(array[i], max);
//		}
		//System.out.println("Max: "+max);
		int countarray[]=new int[6+1];	//to store occurance of each element of array in range//1
		int len=array.length;//2
		int result[]=new int[len];//3
		
		for(int i=0;i<len;i++)//4
		{
			countarray[array[i]]++;//5
		}//6
		for(int i=1;i<countarray.length;i++)//find the actual position of each element in sorted of each element//7
		{
			countarray[i]=countarray[i]+countarray[i-1];//8
		}//9

		
		System.out.println(Arrays.toString(countarray));
		int iter=0;
		for(int i=len-1;i>=0;i--)
		{
			
			result[--countarray[array[i]]]=array[i];
			
			System.out.println("After Iteration "+(++iter)+": "+Arrays.toString(result));
		}
		
//		System.out.println("Sorted array: ");
//		for(int i=0;i<len;i++)
//		{
//			System.out.print(result[i]+" ");
//		}
		
		
		
		
	}

}
