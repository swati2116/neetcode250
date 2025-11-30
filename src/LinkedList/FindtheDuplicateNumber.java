package LinkedList;

public class FindtheDuplicateNumber {
public int findDuplicate(int[] nums) {
	//start a slow and fast pointer until they meet
  int slow=0, fast=0;
  do
  {
	 slow=nums[slow]; 
	 fast= nums[nums[fast]];
  }
  while(slow!=fast);
  slow=0;
  // as soon as they meet, move both pointers at same speed until they meet again
  while(slow!=fast)
  {
	  slow=nums[slow];
	  fast=nums[fast];
	  
  }
  return slow;
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	FindtheDuplicateNumber fdn= new FindtheDuplicateNumber();
	int val=fdn.findDuplicate(new int[] {2,6,4,1,3,1,5});
	System.out.println(val);

}
}

