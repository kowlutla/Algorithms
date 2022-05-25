package activitySelectionProblem;

import java.util.ArrayList;
import java.util.Collections;


class Activity
{
	int start;
	int finish;
	
	public Activity(int start,int finish)
	{
		this.start=start;
		this.finish=finish;
	}
	
	public String toString()
	{
		return "("+start+","+finish+")";
	}
}

public class ActivitySelectionProblemLIst {
	
	public static void main(String[] args) {
		
		ArrayList<Activity>list=new ArrayList<Activity>();
		
		list.add(new Activity(1,2));
		list.add(new Activity(0,6));
		list.add(new Activity(5,9));
		list.add(new Activity(3,4));
		list.add(new Activity(5,7));
		list.add(new Activity(5,9));
		
		activitySelection(list);
		
	}

	private static void activitySelection(ArrayList<Activity> list) {
		
		Collections.sort(list, (act1,act2)->{
			if(act1.finish>act2.finish)
			{
				return 1;
			}
			else
			{
				return -1;
			}
		});
		
		System.out.println(list.get(0));
		int i=0;
		for(int j=1;j<list.size();j++)
		{
			if(list.get(j).start>=list.get(i).finish)
			{
				i=j;
				System.out.println(list.get(j));
			}
		}
	}

}
