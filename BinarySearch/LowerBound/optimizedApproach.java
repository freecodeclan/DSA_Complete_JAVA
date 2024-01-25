package BinarySearch.LowerBound;

public class optimizedApproach {

  public static int lowerBound(int[] nums, int target){

    //-- Binary Search
    int n = nums.length;
    int start = 0;
    int end = n-1;
    int ans = n;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] >= target){
        ans = mid;
        end = mid - 1;
      }
      else {
        start = mid + 1;
      } 
    }
    return ans;
  }
  public static void main(String[] args) {
    int[] nums = {1,2,2,3,3,5};
    int x = 2; 
    int lb = lowerBound(nums, x);

    System.out.println("The lower bound of given x is "+ lb);
  }
}
