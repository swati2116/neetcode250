package LinkedList;

public class RemoveNodeFromEndofLinkedList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		int size = 0;
		ListNode sizecount = head;
		ListNode headremove = head;
		//calculate size of linkedlist
		while (sizecount != null) {
			size++;
			sizecount = sizecount.next;
		}
		// node is the index which needs to be removed from linkedlist
		int node = size - n;
		int move = 0;
		// if there is only one element then return null which wil ne achieved by head.next
		if (node == 0) {
			return head.next;
		}
		// removing the required index keeping pointer just before index to be removed
		while (headremove != null) {
			if (move == node - 1) {
				ListNode deleteNode = headremove.next;
				headremove.next = headremove.next.next;
				deleteNode = null;
				return head;
			}
			headremove = headremove.next;
			move++;
		}
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode ls = new ListNode(1, new ListNode());
		ListNode ls1 = new ListNode(2, new ListNode());
		ls.next = ls1;
		ListNode ls2 = new ListNode(3, new ListNode());
		ls1.next = ls2;
		ListNode ls3 = new ListNode(4, new ListNode());
		ls2.next = ls3;
		ls3.next = null;
		// ListNode ls4 = new ListNode(4, new ListNode());
		// ls3.next = ls4;

		// ListNode ls5 = new ListNode(5, new ListNode());
		// ls4.next = ls5;

		// ListNode ls6 = new ListNode(6, new ListNode());
		// ls5.next = ls6;
		// ls6.next = null;

		RemoveNodeFromEndofLinkedList rnel = new RemoveNodeFromEndofLinkedList();
		rnel.removeNthFromEnd(ls, 2);
	}

}

//-------------------------------------------------------------------------//
/*
 * You are given the beginning of a linked list head, and an integer n.
 * 
 * Remove the nth node from the end of the list and return the beginning of the
 * list.
 * 
 * Example 1:
 * 
 * Input: head = [1,2,3,4], n = 2
 * 
 * Output: [1,2,4] Example 2:
 * 
 * Input: head = [5], n = 1
 * 
 * Output: [] Example 3:
 * 
 * Input: head = [1,2], n = 2
 * 
 * Output: [2]
 */
		
//----------------------------------------------------------------------------//