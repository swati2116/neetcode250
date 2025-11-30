package LinkedList;

public class ReverseNodesinKGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode dummy = new ListNode(0);
		ListNode temp = dummy;
		ListNode dummycurrent = head;
		while (head != null) {
			ListNode knode = getKNode(head, k);
			if (knode == null) {
				break;
			}
			head = knode.next;
			ListNode prev = null;

			ListNode curr = dummycurrent;
			while (curr != head) {
				ListNode front = curr.next;
				curr.next = prev;
				prev = curr;
				curr = front;
			}
			temp.next = prev;
			temp = dummycurrent;
			dummycurrent = head;

		}
		dummycurrent = head;
		temp.next = head;

		return dummy.next;

	}

	public ListNode getKNode(ListNode startNode, int k) {
		while (k > 1 && startNode != null) {

			startNode = startNode.next;
			k--;

		}
		return startNode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNodesinKGroup rng = new ReverseNodesinKGroup();

		ListNode ls = new ListNode(1, new ListNode());
		ListNode ls1 = new ListNode(2, new ListNode());
		ls.next = ls1;
		ListNode ls2 = new ListNode(3, new ListNode());
		ls1.next = ls2;
		ListNode ls3 = new ListNode(4, new ListNode());
		ls2.next = ls3;
		ListNode ls4 = new ListNode(5, new ListNode());
		ls3.next = ls4;
		ListNode ls5 = new ListNode(6, new ListNode());
		ls4.next = ls5;
		ls5.next = null;
		rng.reverseKGroup(ls, 3);

	}

}
