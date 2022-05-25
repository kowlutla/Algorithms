/**
 	Given 3 arrays (A, B, C) which are sorted in ascending order, we are required to merge 
 	them together in ascending order and output the array D. 
 	
 	Input : A = [1, 2, 3, 4, 5] 
        	B = [2, 3, 4]
        	C = [4, 5, 6, 7]
	Output : D = [1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6, 7]
	
	Input : A = [1, 2, 3, 5]
	        B = [6, 7, 8, 9 ]
	        C = [10, 11, 12]
	Output: D = [1, 2, 3, 5, 6, 7, 8, 9. 10, 11, 12]

 	
 	
 */
package MergeSort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class MergeThreeSortedArrays {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter lenght of first array: ");
		int n1=sc.nextInt();
		System.out.print("Enter length of second array: ");
		int n2=sc.nextInt();
		System.out.print("Enter length of third array : ");
		int n3=sc.nextInt();
		
		int array1[]=new int[n1];
		int array2[]=new int[n2];
		int array3[]=new int[n3];
		
		System.out.println("Enter elements into array1: ");
		for(int i=0;i<n1;i++)
		{
			array1[i]=sc.nextInt();
		}
		
		System.out.println("Enter elements into array2: ");
		for(int i=0;i<n2;i++)
		{
			array2[i]=sc.nextInt();
		}
		
		System.out.println("Enter elements into array3: ");
		for(int i=0;i<n3;i++)
		{
			array3[i]=sc.nextInt();
		}
		
		
		
		System.out.println("Three array elements are: ");
		for(int i=0;i<n1;i++)
		{
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n2;i++)
		{
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n3;i++)
		{
			System.out.print(array3[i]+" ");
		}
		System.out.println();
		
		int firstTwo[]=mergeArrays(array1,array2,n1,n2);
		
		int result[]=mergeArrays(array3,firstTwo,n3,n1+n2);
		
		
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}
		System.out.println();
		
		System.out.println(Arrays.toString(result));
		sc.close();

	}

	public static int[] mergeArrays(int[] array1, int[] array2, int n1, int n2) {
		
		int result[]=new int[n1+n2];
		int first=0;
		int second=0;
		int i=0;
		while(first<n1 && second<n2)
		{
			if(array1[first]<=array2[second])
			{
				result[i]=array1[first];
				i++;
				first++;
			}
			else
			{
				result[i]=array2[second];
				i++;
				second++;
			}
		}
		
		
		while(first<n1)
		{
			result[i]=array1[first];
			i++;
			first++;
		}
		
		
		while(second<n2)
		{
			result[i]=array2[second];
			i++;
			second++;
		}
		
		return result;
		
		
	}

}
