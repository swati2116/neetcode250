package LinkedList;

public class ReverseLinkedList {
	public ListNodeLFU reverseList(ListNodeLFU head) {
		ListNodeLFU current = head;
		ListNodeLFU prev = null;
		while (current != null) {
			ListNodeLFU front = current.next;
			current.next = prev;
			prev = current;
			current = front;
		}
		return prev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//-------------------------------------------------------------------------//
/*
 * Given the beginning of a singly linked list head, reverse the list, and
 * return the new beginning of the list.
 * 
 * Example 1:
 * 
 * Input: head = [0,1,2,3]
 * 
 * Output: [3,2,1,0] Example 2:
 * 
 * Input: head = []
 * 
 * Output: []
 */
//--------------------------------------------------------------//		
