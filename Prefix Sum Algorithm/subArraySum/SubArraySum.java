package subArraySum;

import java.util.Scanner;

public class SubArraySum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length of array: ");
		int n=sc.nextInt();
		
		System.out.println("Enter elements into array: ");
		int array[]=new int[n];
		for(int i=0;i<n;i++)
		{
			//System.out.print("Enter element: "+i+" : ");
			array[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+ " ");
		}
		
		int start=2;
		int end=5;
		int sum=subArraySum(array,start,end);
		System.out.println("\nSub array sum: "+sum);
		sc.close();
	

	}

	private static int subArraySum(int[] array, int start, int end) {
	
		for(int i=1;i<array.length;i++)
		{
			array[i]=array[i]+array[i-1];
		}
		int sum=array[end]-array[start-1];
		return sum;
	
		
	}

}



//array:
//position:0	1	2	3	4	5	6 
//element: 4	5	-4	5	9	3	9
//updated: 4 	9 	5 	10 	19 	22 	31 
//sum array sum[1,4]= 5+-4+5+9=15  ==>19-4(a[4]-a[0])==> sum (a[i,j])=a[j]-a[i-1];



