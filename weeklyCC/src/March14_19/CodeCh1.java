package March14_19;

import java.util.LinkedList;

/*
 * 
 * 1) Given two singly linked lists that intersect at some point, find the intersecting node. 
 * 	  Assume the lists are non-cyclical. 
 *    For example, given A = 3 ➔ 7 ➔ 8 ➔ 10 and B = 99 ➔ 1 ➔ 8 ➔ 10, 
 *    return the node with value 8. In this example, assume nodes 
 *    with the same value are the exact same node objects.
 *    Do this in 0( m + n) time (where m and n are the lengths of the lists) 
 *    and constant space.
 */

public class CodeCh1 {
	public static void main(String[] args) {
		LinkedList<Integer> A = new LinkedList<>(); 
		LinkedList<Integer> B = new LinkedList<>(); 
		A.add(3);
		A.add(7);
		A.add(8);
		A.add(10);
		B.add(99); 
		B.add(1); 
		B.add(8); 
		B.add(10); 
		
		for(int eachLink : A) {
			if(B.contains(eachLink)) {
				System.out.println(eachLink + " is the common value of the same node objects");
				return; 
			}
		}
		
	}

}
