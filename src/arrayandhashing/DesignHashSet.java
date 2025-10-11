package arrayandhashing;

public class DesignHashSet {
	int[] hashset = new int[16];
	int capacity = 0;

	public DesignHashSet() {

	}

	public void add(int key) {
		if (capacity < 16) {
			if (!contains(key)) {
				hashset[capacity] = key;
				capacity++;
			}
		}
	}

	public void remove(int key) {
		int index = 0;
		if (hashset.length == 0) {
			System.out.println("hashset is empty elements can't be removed");
		} else {
			for (int i = 0; i < hashset.length; i++) {
				if (hashset[i] == key) {
					index = i;
					for (int j = i; j < hashset.length - 1; j++) {
						hashset[j] = hashset[j + 1];
					}
					capacity--;
				}
			}
		}
	}

	public boolean contains(int key) {
		boolean flag = false;
		for (int no : hashset) {
			if (no == key) {
				flag = true;
				break;
			}

		}
		return flag;
	}

	public void display() {
		for (int i = 0; i < hashset.length; i++) {
			System.out.println(hashset[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesignHashSet dhs = new DesignHashSet();
		dhs.add(1); // set = [1]
		dhs.add(2); // set = [1, 2]
		boolean check = dhs.contains(1); // return True
		System.out.println(check);

		boolean check1 = dhs.contains(3); // return False, (not found)
		System.out.println(check1);
		dhs.add(2); // set = [1, 2]
		boolean check2 = dhs.contains(2); // return True
		System.out.println(check2);
		dhs.remove(2); // set = [1]
		dhs.contains(2); // return False, (already removed)
		dhs.display();
	}

}
//**********************************************//
/*
 * Design a HashSet without using any built-in hash table libraries.
 * 
 * Implement MyHashSet class:
 * 
 * void add(key) Inserts the value key into the HashSet. bool contains(key)
 * Returns whether the value key exists in the HashSet or not. void remove(key)
 * Removes the value key in the HashSet. If key does not exist in the HashSet,
 * do nothing.
 * 
 * 
 * Example 1:
 * 
 * Input ["MyHashSet", "add", "add", "contains", "contains", "add", "contains",
 * "remove", "contains"] [[], [1], [2], [1], [3], [2], [2], [2], [2]] Output
 * [null, null, null, true, false, null, true, null, false]
 * 
 * Explanation MyHashSet myHashSet = new MyHashSet(); myHashSet.add(1); // set =
 * [1] myHashSet.add(2); // set = [1, 2] myHashSet.contains(1); // return True
 * myHashSet.contains(3); // return False, (not found) myHashSet.add(2); // set
 * = [1, 2] myHashSet.contains(2); // return True myHashSet.remove(2); // set =
 * [1] myHashSet.contains(2); // return False, (already removed)
 */ 
//**********************************************************************//
