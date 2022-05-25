package QuickSort;

import java.util.Scanner;

public class QuickSort1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter length: ");
		int n=sc.nextInt();
		int array[]=new int[n];
		System.out.println("Enter elmenents into array :");
		for(int i=0;i<n;i++)
		{
			//System.out.print("Element "+(i+1)+" : ");
			array[i]=sc.nextInt();
		}
		
		System.out.println("Array Before sorting :");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		int first=0;
		int last=array.length-1;
		quickSort(array,first,last);
		
		System.out.println("\nArray After sorting :");
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}

	}

	private static void quickSort(int[] array, int first, int last) {
		
		if(first<=last)
		{
			int location=partion(array,first,last);
			quickSort(array,first,location-1);
			quickSort(array,location+1,last);
		}
		
		
	}

	private static int partion(int[] array, int first, int last) {
	
		int pivot=array[first];
		int up=first+1;
		int down=last;
		
		while(up<=down)
		{
			while(array[up]<=pivot)
				up++;
			while(array[down]>pivot)
				down--;
			
			if(up<down) {
				int temp=array[up];
				array[up]=array[down];
				array[down]=temp;
			}
		}
		int temp=array[down];
		array[down]=array[first];
		array[first]=temp;
		return down;
		
	}

}
