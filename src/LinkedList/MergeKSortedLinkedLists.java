package LinkedList;

import java.util.PriorityQueue;

public class MergeKSortedLinkedLists {
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0)
			return null;

		//create the priority queue object where ((a, b) -> a.val - b.val); is the comparator it will store the value based on descending order
		PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);
		for (ListNode list : lists) {
			if (list != null) {
				minHeap.offer(list);
			}
		}
     //   minHeap has the value as 1,1,3
		ListNode res = new ListNode(0);
		ListNode cur = res;
		while (!minHeap.isEmpty()) {
			ListNode node = minHeap.poll();
			cur.next = node;
			cur = cur.next;

			node = node.next;
			if (node != null) {
				minHeap.offer(node);
			}
		}
		return res.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Input: lists = [[1,2,4],[1,3,5],[3,6]]

		//		Output: [1,1,2,3,3,4,5,6]

	}

}
