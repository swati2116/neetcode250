package LinkedList;

public class ReorderLinkedList {
	public void reorderList(ListNode head) {
		ListNode slow = head;
		ListNode fast = head.next;
		// finding the midpoint, here slow will stop at midpoint
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode mid = slow;
		ListNode current = mid.next;
		mid.next = null;
		ListNode prev = null;
	
		// reverse the element from midpoint to the end of list
		// here two head will be there one will be "Head" another will be "next to the
		// mid" element
		while (current != null) {
			ListNode front = current.next;
			current.next = prev;
			prev = current;
			current = front;
		}

		ListNode forward = head;
		ListNode backward = prev;

		// mering one by one element from start and midpoint

		while (backward != null) {

			ListNode forwardnext = forward.next;
			forward.next = backward;
			ListNode backwardnext = backward.next;
			backward.next = forwardnext;
			forward = forwardnext;
			backward = backwardnext;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode ls = new ListNode(0, new ListNode());
		ListNode ls1 = new ListNode(1, new ListNode());
		ls.next = ls1;
		ListNode ls2 = new ListNode(2, new ListNode());
		ls1.next = ls2;
		ListNode ls3 = new ListNode(3, new ListNode());
		ls2.next = ls3;
		// ls3.next = null;
		ListNode ls4 = new ListNode(4, new ListNode());
		ls3.next = ls4;

		ListNode ls5 = new ListNode(5, new ListNode());
		ls4.next = ls5;

		ListNode ls6 = new ListNode(6, new ListNode());
		ls5.next = ls6;
		ls6.next = null;

		ReorderLinkedList rll = new ReorderLinkedList();
		rll.reorderList(ls);
	}

}

//-------------------------------------------------------------------//

/*
 * You are given the head of a singly linked-list.
 * 
 * The positions of a linked list of length = 7 for example, can intially be
 * represented as:
 * 
 * [0, 1, 2, 3, 4, 5, 6]
 * 
 * Reorder the nodes of the linked list to be in the following order:
 * 
 * [0, 6, 1, 5, 2, 4, 3]
 * 
 * Notice that in the general case for a list of length = n the nodes are
 * reordered to be in the following order:
 * 
 * [0, n-1, 1, n-2, 2, n-3, ...]
 * 
 * You may not modify the values in the list's nodes, but instead you must
 * reorder the nodes themselves.
 * 
 * Example 1:
 * 
 * Input: head = [2,4,6,8]
 * 
 * Output: [2,8,4,6] Example 2:
 * 
 * Input: head = [2,4,6,8,10]
 * 
 * Output: [2,10,4,8,6]
 */
		
//------------------------------------------------------------------------//

