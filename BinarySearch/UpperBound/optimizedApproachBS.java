package BinarySearch.UpperBound;

public class optimizedApproachBS {

  public static int upperBound(int[] nums, int x){
    int start = 0;
    int end = nums.length-1;
    int ans = nums.length;

    while (start<=end) {
      int mid = start + (end - start) / 2;
      if (nums[mid] > x){
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
    int[] arr = {2,3,6,8,8,11,11,12};
    int target = 2;
    int uB = upperBound(arr, target);

    System.out.println("The upper bound of given x is " + uB);
  }
}
