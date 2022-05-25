/**
  PROBLEM STATEMENT: 
  ------------------
  	Find the resultant String after replacing X with Y and removing Z
  	
  	Given a string str, the task is to replace all occurrences of the 
  	given X with given Y and also remove any occurrences of the given Z 
  	if present in it with no extra space 
  	
  	Input: 
  		str = “batman”, X = ‘a’, Y = ‘d’, Z = ‘b’
  	Output: ntdmd
  
  
 */
package stringReplaceRemove;

import java.util.Scanner;

/**
 * @author apiiit-rkv
 *
 */
public class StringReplaceRemove {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter string: ");
		String str=sc.nextLine();
		System.out.print("Enter X: ");
		char x=sc.nextLine().charAt(0);
		System.out.println("Enter Y: ");
		char y=sc.nextLine().charAt(0);
		System.out.print("Enter Z: ");
		char z=sc.nextLine().charAt(0);
		
		str=str.replaceAll(x+"", y+"");
		str=str.replaceAll(z+"", "");
		System.out.println(str);
		
		sc.close();
		
		
	}

}
