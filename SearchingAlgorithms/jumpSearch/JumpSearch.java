/**
 * 
 */
package jumpSearch;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class JumpSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter key to search: ");
		int key=sc.nextInt();
		System.out.println("Enter elmenents into array in ascending order :");
		for(int i=0;i<n;i++)
		{
			
			array[i]=sc.nextInt();
		}
		System.out.println("Array elements: ");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		int key_location=jumpSearch(array,key);
		System.out.println(key+" is present at "+key_location);
		
		sc.close();
	}

	
	//Time complexity: O((n/m)+(m-1))
	private static int jumpSearch(int[] array, int key) {
		
		int n=array.length;
		int i=0;
		int m=(int)Math.sqrt(n);
		int temp=m;
		while(array[m]<= key && m<n)
		{
			i=m;
			m=m+temp;
			
			if(m>=n)
			{
				return -1;
			}
		}
		
		for(int j=i;j<m;j++)
		{
			if(array[j]==key)
			{
				return j;
			}
		}
		return -1;
	}

}
