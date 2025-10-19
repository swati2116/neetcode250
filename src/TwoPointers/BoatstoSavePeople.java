package TwoPointers;

import java.util.Arrays;

public class BoatstoSavePeople {
	public int numRescueBoats(int[] people, int limit) {
		int l = 0, r = people.length - 1, boats = 0;
		Arrays.sort(people);
		while (l <= r) {
			if (people[l] + people[r] <= limit) {
				l++; // increasing the pointer for smallest weight people
			}
			r--; // if weight of heaviest people is equal to limit or greater need to select the
					// less weight people.
			boats++;
		}
		return boats;
	}
//1 2 2 3 3
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoatstoSavePeople bsp = new BoatstoSavePeople();
		int boats = bsp.numRescueBoats(new int[] { 1, 3, 2, 3, 2 }, 3);
		System.out.println(boats);

	}

}

//********************************************************************//
/*
 * Boats to Save People Solved You are given an integer array people where
 * people[i] is the weight of the ith person, and an infinite number of boats
 * where each boat can carry a maximum weight of limit. Each boat carries at
 * most two people at the same time, provided the sum of the weight of those
 * people is at most limit.
 * 
 * Return the minimum number of boats to carry every given person.
 * 
 * Example 1:
 * 
 * Input: people = [5,1,4,2], limit = 6
 * 
 * Output: 2 Explanation: First boat [5,1]. Second boat [4,2].
 * 
 * Example 2:
 * 
 * Input: people = [1,3,2,3,2], limit = 3
 * 
 * Output: 4
 */

//------------------youtube explanation--------------------
// https://www.youtube.com/watch?v=PCGdb-46H_w
