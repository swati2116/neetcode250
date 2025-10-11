package arrayandhashing;

public class SortanArrayUsingMergeSort {

	public static void mergeSort(int[] nums, int left, int right)
	{
		if(left<right)
		{
			int mid= (left+right)/2;
			mergeSort(nums,left,mid);
			mergeSort(nums,mid+1,right);
			merge(nums, left, mid,right);
		}
	}
	public static void merge(int[] arr, int left, int mid, int right)
	{
		int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; ++i)
            leftArr[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            rightArr[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {3,5,2,9,7,1,4,6};
        mergeSort(nums,0,nums.length-1);
        for(int i : nums)
        {
        	System.out.println(i);
        }
	}

}
