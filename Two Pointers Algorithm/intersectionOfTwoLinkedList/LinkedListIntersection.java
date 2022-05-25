package intersectionOfTwoLinkedList;

public class LinkedListIntersection {
	
	class Node
	{
		int data;
		Node next;
		 public Node(int data)
		 {
			 this.data=data;
			 this.next=null;
		 }
	}
	
	
	Node head;
	public Node insert(int data)
	{
		Node node=new Node(data);
		if(head==null)
		{
			head=node;
			return head;
		}
		else
		{
			Node current=head;
			while(current.next!=null)
			{
				current=current.next;
			}
			
			current.next=node;
			return head;
		}
	}
	
	
	public void traverse()
	{
		if(head==null)
		{
			System.out.println("No elements in linkedlist");
			return;
		}
		else
		{
			Node current=head;
			while(current!=null)
			{
				System.out.print(current.data+" ");
				current=current.next;
			}
		}
	}


	public int intersectionNode2(Node head1, Node head2) {
		
		Node current=head1;
		while(current!=null)
		{
			current.data=current.data*-1;
			current=current.next;
		}
		
		current=head2;
		
		while(current!=null)
		{
			if(current.data<0)
			{
				return -1*current.data;
			}
			current=current.next;
		}
		return -1;
	}


	public int intersectionNode1(Node head1, Node head2) {
		

		Node current1=head1;
		Node current2=head2;
		
		while(current1!=null && current2!=null && current1!=current2)
		{
			current1=current1.next;
			current2=current2.next;
			
			
			if(current1==current2)
			{
				return current1.data;
			}
			if(current1==null)
			{
				current1=head2;
			}
			if(current2==null)
			{
				current2=head1;
			}
		}
		return current1.data;
	
	}


	public int intersectionNode3(Node head1, Node head2) {
		
		int c1=getCount(head1);
		int c2=getCount(head2);
		int d;
		if(c1>c2)
		{
			d=c1-c2;
			return getIntersectionNode3(d,head1,head2);
		}
		else
		{
			d=c2-c1;
			return getIntersectionNode3(d,head2,head1);
		}
		
	}


	private int getIntersectionNode3(int d, Node head1, Node head2) {
		
		Node current1=head1;
		Node current2=head2;
		for(int i=1;i<=d;i++)
		{
			current1=current1.next;
		}
		
		while(current1!=null )
		{
			if(current1==current2)
			{
				return current1.data;
			}
			current1=current1.next;
			current2=current2.next;
		}
		return -1;
	}


	private int getCount(Node head) {
		
		int count=0;
		Node current=head;
		while(current!=null)
		{
			count++;
			current=current.next;
		}
		return count;
	}




	

}
