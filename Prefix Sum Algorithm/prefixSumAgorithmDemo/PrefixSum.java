package prefixSumAgorithmDemo;

import java.util.Scanner;

public class PrefixSum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int n=sc.nextInt();
		
		System.out.println("Enter elements into array: ");
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter element: "+i+" : ");
			array[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			array[i]=array[i]+array[i-1];
		}
		
		System.out.println("Updatad array using prefix sum: ");
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.print("\nSum of total elements int array: ");
		
		
		System.out.println(array[n-1]);
		sc.close();

	}

}



		//array:
//position:0	1	2	3	4	5	6 
//element: 4	5	-4	5	9	3	9
//updated: 4 	9 	5 	10 	19 	22 	31 

