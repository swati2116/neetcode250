package LinkedList;

public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy= new ListNode(0);
        ListNode dhead=dummy;
        int check=1;
        while(head!=null)
        {
            if(check==left)
            {
                 ListNode prev=null;
                 ListNode current=head;
                 ListNode addCurrent=head;
                for(int i=0;i<right-left+1; i++)
                {
                  ListNode front=current.next;
                  current.next=prev;
                  prev=current;
                  current=front;
                  head=current;
                  check++;
                }
                
                dhead.next=prev;
                dhead=addCurrent;
            }
            else{
                ListNode lnode= new ListNode(head.val);
                dhead.next=lnode;
                dhead=dhead.next;
                head=head.next;
                check++;
            }
        }
      return dummy.next;  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseLinkedListII rll= new ReverseLinkedListII();
		ListNode ls = new ListNode(1, new ListNode());
		ListNode ls1 = new ListNode(2, new ListNode());
		ls.next = ls1;
		ListNode ls2 = new ListNode(3, new ListNode());
		ls1.next = ls2;
		ListNode ls3 = new ListNode(4, new ListNode());
		ls2.next = ls3;
		ListNode ls4 = new ListNode(5, new ListNode());
		ls3.next = ls4;
		ls4.next=null;

		ListNode dummy=rll.reverseBetween(ls, 1, 3);
		while(dummy!=null)
		{
			System.out.println(dummy.val);
			dummy=dummy.next;
		}

	}

}
