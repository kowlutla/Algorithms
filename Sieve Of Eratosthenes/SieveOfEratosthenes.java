import java.util.Arrays;
import java.util.Scanner;

/**
  It is way of finding the prime numbers up to N number
 */

/**
 * @author apiiit-rkv
 *
 */
public class SieveOfEratosthenes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter last number: ");
		int n=sc.nextInt();
		
		method1(n);
		method2(n);
		sc.close();

	}

	private static void method1(int n) {
		System.out.println("Normal method: ");
		long start=System.nanoTime();
		printPrimes1(n);
		long end=System.nanoTime();
		System.out.println("Execution time: "+(end-start));
	}

	private static void printPrimes1(int n) {
		
		System.out.println("Prime numbers upto "+n+" : ");
		for(int i=2;i<=n;i++)
		{
			int count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
				System.out.print(i+" ");
		}
		System.out.println();
		
	}
	
	
	
	
	private static void method2(int n) {
		System.out.println("\nEfficient method: ");
		long start=System.nanoTime();
		printPrimes2(n);
		long end=System.nanoTime();
		System.out.println("\nExecution time: "+(end-start));
	}

	private static void printPrimes2(int n) {
		
		boolean array[]=new boolean[n+1];
		Arrays.fill(array, true);
		
		for(int i=2;i*i<=n;i++)
		{
			if(array[i]==true)
			{
				for(int j=i*i;j<=n;j=j+i)
				{
					array[j]=false;
				}
			}
		}
		
		for(int i=2;i<=n;i++)
		{
			if(array[i]==true)
			{
				System.out.print(i+" ");
			}
		}
	}
}
