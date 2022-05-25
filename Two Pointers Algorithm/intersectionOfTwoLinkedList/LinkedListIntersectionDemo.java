/**
 * 
 */
package intersectionOfTwoLinkedList;

/**
 * @author apiiit-rkv
 *
 */
public class LinkedListIntersectionDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		LinkedListIntersection list1=new LinkedListIntersection();
		list1.insert(3);
		list1.insert(6);
		list1.insert(9);
		list1.insert(15);
		list1.insert(30);
		list1.traverse();
		
		System.out.println();
		LinkedListIntersection list2=new LinkedListIntersection();
		list2.insert(10);
		list2.head.next=list1.head.next.next.next;
		list2.traverse();
		
		System.out.println("\nIntersection Node : "+list1.intersectionNode1(list1.head, list2.head));
		
		
		System.out.println("\nIntersection node : "+list1.intersectionNode3(list1.head,list2.head));
		
		System.out.println("\nIntersection node : "+list1.intersectionNode2(list1.head, list2.head));
		

	}

}
