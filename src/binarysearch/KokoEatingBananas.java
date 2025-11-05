package binarysearch;

import java.util.Arrays;
import java.util.Comparator;

public class KokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {
    int minspeed=1;
    int maxspeed=Arrays.stream(piles).max().getAsInt();
    int res=0;
    while(minspeed<=maxspeed)
    {
    	 int mid=minspeed +(maxspeed-minspeed)/2;
    	 int totaltimetoeatbanana=0;
    	 for(int pile:piles)
    	 {
    		 totaltimetoeatbanana= (int)Math.ceil((double)pile/mid)+totaltimetoeatbanana;
    	 }
    	 if(totaltimetoeatbanana<=h)
    	 {
    		res= mid;
    		maxspeed=mid-1;
    	 }
    	 else
    	 {
    		 minspeed= mid+1;
    	 }
    }
     return res;  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KokoEatingBananas keb= new KokoEatingBananas();
		int res=keb.minEatingSpeed(new int[] {1,4,3,2}, 9);
		System.out.println(res);
	}

}

//---------------------------------------//
/*
 * You are given an integer array piles where piles[i] is the number of bananas
 * in the ith pile. You are also given an integer h, which represents the number
 * of hours you have to eat all the bananas.
 * 
 * You may decide your bananas-per-hour eating rate of k. Each hour, you may
 * choose a pile of bananas and eats k bananas from that pile. If the pile has
 * less than k bananas, you may finish eating the pile but you can not eat from
 * another pile in the same hour.
 * 
 * Return the minimum integer k such that you can eat all the bananas within h
 * hours.
 * 
 * Example 1:
 * 
 * Input: piles = [1,4,3,2], h = 9
 * 
 * Output: 2 Explanation: With an eating rate of 2, you can eat the bananas in 6
 * hours. With an eating rate of 1, you would need 10 hours to eat all the
 * bananas (which exceeds h=9), thus the minimum eating rate is 2.
 * 
 * Example 2:
 * 
 * Input: piles = [25,10,23,4], h = 4
 * 
 * Output: 25
 */

//--------------------youtube link-----------------------//
// https://www.youtube.com/watch?v=JGYXNpZaW2U
