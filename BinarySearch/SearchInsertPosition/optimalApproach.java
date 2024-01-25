/*  Search Insert Position
You are given a sorted array 'arr' of distinct values and a target value 'm'.

You need to search for the index of the target value in the array.

codingNinja -- https://www.codingninjas.com/studio/problems/algorithm-to-find-best-insert-position-in-sorted-array_839813?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM

leetCode (35) -- https://leetcode.com/problems/search-insert-position/description/
 */

public class optimalApproach {
  
  public static int searchInsert(int[] nums, int m){
    int low = 0;
    int high = nums.length-1;
    int ans = nums.length;

    while (low <= high){
      int mid = low + (high - low) / 2;
      if (nums[mid] >= m){
        ans = mid;
        high = mid - 1;
      }
      else{
        low = mid + 1;
      }
    }
    return ans;
  } 
  public static void main(String[] args) {
    
    int[] arr = {1,3,5,6};
    int m = 4;
    int finalAns = searchInsert(arr, m);

    System.out.println("The index value would be " + finalAns);

  }
}
