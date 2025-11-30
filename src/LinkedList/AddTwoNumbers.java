package LinkedList;

public class AddTwoNumbers {
	public ListNodeLFU addTwoNumbers(ListNodeLFU l1, ListNodeLFU l2) {
		ListNodeLFU result = new ListNodeLFU(0);
		ListNodeLFU ptr = result;
		int carry = 0; // initialize carry
		while (l1 != null || l2 != null) {
			int sum = 0 + carry; //initialize sum value;
			if (l1 != null) {
				sum = sum + l1.val;  // Adding number from l1 to sum
				l1 = l1.next;
			}
			if (l2 != null) {
				sum = sum + l2.val; // Adding number from l2 to sum
				l2 = l2.next;
			}

			carry = sum / 10; //if sum is 18 then single digit sum contains 1 
			sum = sum % 10;    // for sum 18 carry should be 1
			ptr.next = new ListNodeLFU(sum);
			ptr = ptr.next;
		}
		if (carry == 1) {
			ptr.next = new ListNodeLFU(1);

		}
		return result.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
