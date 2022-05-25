package equilibriumIndex;

import java.util.Scanner;

public class EquilibriumIndex {

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
		
		method1(array);
		method2(array);
		sc.close();

	}

	
	private static void method1(int[] array) {
		
		long starttime=System.nanoTime();
		System.out.println("Equilibrium Index from Method 1: "+equilibriumIndex1(array));
		long endtime=System.nanoTime();
		System.out.println("Execution time of Method 1: "+(endtime-starttime));
		
	}

	private static int equilibriumIndex1(int[] array) {
		
		
		int i,j;
		for(i=0;i<array.length;i++)
		{
			int leftsum=0;
			int rightsum=0;
			for(j=0;j<i;j++)
			{
				leftsum+=array[j];
			}
			
			for(j=i+1;j<array.length;j++)
			{
				rightsum+=array[j];
			}
			
			if(leftsum==rightsum)
			{
				return i;
			}
		}
		return -1;
	}


	private static void method2(int[] array) {
		long starttime=System.nanoTime();
		System.out.println("Equilibrium Index from Method 2: "+equilibriumIndex2(array));
		long endtime=System.nanoTime();
		System.out.println("Execution time of Method 2: "+(endtime-starttime));
		
	}


	private static int equilibriumIndex2(int[] array) {
		
		int sum=0,leftsum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		
		for(int i=0;i<array.length;i++)
		{
			sum=sum-array[i];
			
			if(sum==leftsum)
			{
				return i;
			}
			leftsum=leftsum+array[i];
		}
		return -1;
		
	}

}
