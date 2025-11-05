package stack;

import java.util.Arrays;

public class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        int [][] cars= new int[position.length][2];
        for(int i=0; i<position.length; i++)
        {
           cars[i][0]=position[i];
           cars[i][1]=((target-position[i])*1)/speed[i];
        }
        Arrays.sort(cars,(a,b)->Integer.compare(a[0],b[0]));
        int fleets=0;
        for(int j=position.length-1; j>=1; j--)
        {
           if(cars[j][1]>=cars[j-1][1])
           {
               cars[j][0]=cars[j-1][0];
               cars[j][1]=cars[j-1][1];
           }
           else {
           
               fleets++;
           }
        }
        return fleets+1;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarFleet cf= new CarFleet();
		int res=cf.carFleet(10, new int[]{6,8}, new int[]{3,2});
		System.out.println(res);
	}

}
//Input: target = 10, position = [4,1,0,7], speed = [2,2,1,1]



