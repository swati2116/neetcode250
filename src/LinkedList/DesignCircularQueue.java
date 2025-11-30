package LinkedList;

class DesignCircularQueue {
	int space;
	ListNodeLFU left;
	ListNodeLFU right;

	public DesignCircularQueue(int k) {
		this.space = k;
		this.left = new ListNodeLFU(0);
		this.right = this.left;
	}

	public boolean enQueue(int value) {
		if (isFull()) {
			return false;
		}
		ListNodeLFU node = new ListNodeLFU(value);
		if (isEmpty()) {
			left.next = node;
			right = node;
		} else {
			right.next = node;
			right = node;
			node.next = left;
		}
		space--;
		return true;

	}

	public boolean deQueue() {
		if (isEmpty()) {
			return false;
		}
		left.next = left.next.next;
		if (left.next == left) {
			right = left;
		}
		space++;
		return true;
	}

	public int Front() {
		return isEmpty() ? -1 : left.next.val;
	}

	public int Rear() {
		return isEmpty() ? -1 : right.val;
	}

	public boolean isEmpty() {
		return left.next == null ? true : false;
	}

	public boolean isFull() {
		return space == 0;
	}
}
