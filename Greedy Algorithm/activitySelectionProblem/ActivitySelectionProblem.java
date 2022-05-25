/**
  You are given n activities with their start and finish times. Select the maximum number of 
  activities that can be performed by a single person, assuming that a person can only work 
  on a single activity at a time.
  
  	int s[] =  {1, 3, 0, 5, 8, 5}; 
    int f[] =  {2, 4, 6, 7, 9, 9}; 
    
    Following activities are selected
	0 1 3 4
  
  
 */
package activitySelectionProblem;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class ActivitySelectionProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of activities: ");
		int n=sc.nextInt();
		int start[]=new int[n];
		int finish[]=new int[n];
		
		System.out.println("Enter starting and finishing times of each activity : ");
		for(int i=0;i<n;i++)
		{
			System.out.println("Activity "+(i+1)+" : ");
			System.out.print("Start Time: ");
			start[i]=sc.nextInt();
			System.out.print("Finish Time: ");
			finish[i]=sc.nextInt();
		}
		
		System.out.println("Starting and finishing times: ");
		for(int i=0;i<n;i++)
		{
			System.out.println("("+start[i]+" , "+finish[i]+")");
		}
		
		activitySelection(start,finish,n);
		sc.close();
	}

	private static void activitySelection(int[] start, int[] finish, int n) {
		
		sortBasedOnFinishTime(start,finish,n);
		
		System.out.println("Following activities are selected: ");
		int i=0;
		System.out.println(start[i]+" "+finish[i]);
		for(int j=1;j<n;j++)
		{
			if(start[j]>=finish[i])
			{
				System.out.println(start[j]+" "+finish[j]);
				i=j;
			}
		}
		
		
	}

	private static void sortBasedOnFinishTime(int[] start, int[] finish, int n) {
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(finish[j]>finish[j+1])
				{
					int temp=finish[j];
					finish[j]=finish[j+1];
					finish[j+1]=temp;
					
					temp=start[j];
					start[j]=start[j+1];
					start[j+1]=temp;
				}
			}
		}
		
	}

}
