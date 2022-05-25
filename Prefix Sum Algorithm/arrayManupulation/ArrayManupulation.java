package arrayManupulation;

import java.util.Scanner;

public class ArrayManupulation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N:");
		int n=sc.nextInt();
		System.out.print("No of Quiries: ");
		int m=sc.nextInt();
		int q[][]=new int[m][2];
		for(int i=0;i<m;i++)
		{
			q[i][0]=sc.nextInt();
			q[i][1]=sc.nextInt();
		}
		
		int sum=getMaxSum(n,q);
		
		System.out.println("Max Sum: "+sum);
		sc.close();
	}

	private static int getMaxSum(int n, int[][] q) {
		
		
		int array[]=new int[n+1];
		for(int i=0;i<q.length;i++)
		{
			array[q[i][0]]=array[q[i][0]]+100;
			array[q[i][1]+1]=array[q[i][1]]-100;
		}
		
		for(int i=1;i<n;i++)
		{
			array[i]=array[i]+array[i-1];
		}
		int max=array[0];
		for(int i=1;i<n;i++)
		{
			if(array[i]>max)
			{
				max=array[i];
			}
		}
		return max;
	}

}



/*Consider an array of size n with all initial values as 0.
Perform given ‘m’ add operations from index ‘a’ to ‘b’ and evaluate highest element in array
An add operation adds 100 to all elements from a to b (both inclusive)*/

//Input n=5 array:{0,0,0,0,0}
//m=3
//a=2,b=4 {0,0,100,100,100}
//a=1,b=3 {0,100,200,200,100}
//a=1,b=2 {0,200,300,200,100}

//Output: 300