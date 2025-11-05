package stack;

import java.util.Stack;

public class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack= new Stack<>();
        for(int a: asteroids)
        {
          while(!stack.isEmpty() && a<0 && stack.peek()>0) 
          {
        	  int diff=a+ stack.peek();
        	  //if diff is less than 0 means stack top value is smaller
        	  if(diff<0)
        	  {
        		  stack.pop();
        	  }
        	  // if diff is greater than 0 means asteroid  value is bigger
        	  else if(diff>0)
        	  {
        		  a=0;
        	  }
        	  // here both the value asteroid and stack is same
        	  else
        	  {
        		  a=0;
        		  stack.pop();
        	  }
          }
          if(a!=0)
          {
        	  stack.push(a);
          }
               
        }
    return stack.stream().mapToInt(i->i).toArray();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AsteroidCollision ac= new AsteroidCollision();
		int [] res=ac.asteroidCollision(new int[] {3,2,-4});
		for(int a: res)
		{
		System.out.print(a);
		}
	}

}

//-------------------------------------------------------//

/*
 * You are given an array asteroids of integers representing asteroids in a row.
 * The indices of the asteriod in the array represent their relative position in
 * space.
 * 
 * For each asteroid, the absolute value represents its size, and the sign
 * represents its direction (positive meaning right, negative meaning left).
 * Each asteroid moves at the same speed.
 * 
 * Find out the state of the asteroids after all collisions. If two asteroids
 * meet, the smaller one will explode. If both are the same size, both will
 * explode. Two asteroids moving in the same direction will never meet.
 * 
 * Example 1:
 * 
 * Input: asteroids = [2,4,-4,-1]
 * 
 * Output: [2] Example 2:
 * 
 * Input: asteroids = [5,5]
 * 
 * Output: [5,5] Example 3:
 * 
 * Input: asteroids = [7,-3,9]
 * 
 * Output: [7,9]
 */
		
//-------------------------------------------------------//