package LinkedList;

public class CopyLinkedListwithRandomPointer {
    public Node copyRandomList(Node head) {
    //create a new node and insert it in the middle of the Node
    Node curr=head;
    System.out.println("debugging till new node creation");
     while(curr!=null)
     {
        Node newNode= new Node(curr.val);
        newNode.next=curr.next;
        curr.next=newNode;
        curr=newNode.next;
     }
     
     //Copy the Random pointer
     curr=head;
     System.out.println("debugging till copying");
     while(curr!=null)
     {
        if(curr.random!=null)
        {
            curr.next.random=curr.random.next;
            curr=curr.next.next;
        }
     }
     
     // separate the two list and return the new copied list
     curr=head;
     Node newHead= head.next;
     Node newCurr=newHead;
     System.out.println("debugging till separation");
     while(curr!=null)
     {
        curr.next= newCurr.next;
        curr= curr.next;
        if(curr!=null)
        {
        newCurr.next= curr.next;
        newCurr=newCurr.next;
        }
     }
     return newHead;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyLinkedListwithRandomPointer cl= new CopyLinkedListwithRandomPointer();
		Node ls = new Node(0);
		Node ls1 = new Node(1);
		ls.next = ls1;
		ls.random=
	   // Node ls2 = new Node(2);
	//	ls1.next = ls2;
	//	Node ls3 = new Node(3);
	//	ls2.next = ls3;
		// ls3.next = null;
		cl.copyRandomList(null);
	}

}

//------------------------------------------------------------------------

/*
 * You are given the head of a linked list of length n. Unlike a singly linked
 * list, each node contains an additional pointer random, which may point to any
 * node in the list, or null.
 * 
 * Create a deep copy of the list.
 * 
 * The deep copy should consist of exactly n new nodes, each including:
 * 
 * The original value val of the copied node A next pointer to the new node
 * corresponding to the next pointer of the original node A random pointer to
 * the new node corresponding to the random pointer of the original node Note:
 * None of the pointers in the new list should point to nodes in the original
 * list.
 * 
 * Return the head of the copied linked list.
 * 
 * In the examples, the linked list is represented as a list of n nodes. Each
 * node is represented as a pair of [val, random_index] where random_index is
 * the index of the node (0-indexed) that the random pointer points to, or null
 * if it does not point to any node.
 * 
 * Example 1:
 * 
 * 
 * 
 * Input: head = [[3,null],[7,3],[4,0],[5,1]]
 * 
 * Output: [[3,null],[7,3],[4,0],[5,1]] Example 2:
 * 
 * 
 * 
 * Input: head = [[1,null],[2,2],[3,2]]
 * 
 * Output: [[1,null],[2,2],[3,2]] Constraints:
 */
	//----------------------------------------//
