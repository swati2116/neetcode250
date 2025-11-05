package binarysearch;

public class CapacitytoShipPackagesWithinDDays {

	public int shipWithinDays(int[] weights, int days) {
		int min_cap = 0, max_cap = 0;
		for (int weight : weights) {
			min_cap = Math.max(min_cap, weight);
			max_cap = max_cap + weight;
		}
		while (min_cap <= max_cap) {
			int mid = min_cap + (max_cap - min_cap) / 2;
			int sum = 0, day = 1;
			for (int weight : weights) {

				if (sum + weight > mid) {
					day++;
					sum = 0;
				}
				sum = sum + weight;
			}
			if (day > days) {
				min_cap = mid + 1;
			} else {
				max_cap = mid-1;
			}
		}
		return min_cap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CapacitytoShipPackagesWithinDDays cspd = new CapacitytoShipPackagesWithinDDays();
		int res = cspd.shipWithinDays(new int[] { 2, 4, 6, 1, 3, 10 }, 4);
		System.out.println(res);

	}

}

//---------------------------------------------------------------//

/*
 * A conveyor belt has packages that must be shipped from one port to another
 * within days days.
 * 
 * The ith package on the conveyor belt has a weight of weights[i]. Each day, we
 * load the ship with packages on the conveyor belt (in the order given by
 * weights). It is not allowed to load weight more than the maximum weight
 * capacity of the ship.
 * 
 * Return the least weight capacity of the ship that will result in all the
 * packages on the conveyor belt being shipped within days days.
 * 
 * Example 1:
 * 
 * Input: weights = [2,4,6,1,3,10], days = 4
 * 
 * Output: 10 Explanation: 1st day: [2] 2nd day: [4,6] 3rd day: [1,3] 4th day:
 * [10]
 * 
 * Example 2:
 * 
 * Input: weights = [1,2,3,4,5], days = 5
 * 
 * Output: 5 Explanation: 1st day: [1] 2nd day: [2] 3rd day: [3] 4th day: [4]
 * 5th day: [5]
 * 
 * Example 3:
 * 
 * Input: weights = [1,5,4,4,2,3], days = 3
 * 
 * Output: 8 Explanation: 1st day = [1,5] 2nd day = [4,4] 3rd day = [2,3]
 */
//------------------youtube link-------------------------//
// https://www.youtube.com/watch?v=f2qf4u_O2QE