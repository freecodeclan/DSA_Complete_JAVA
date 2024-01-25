/* You are given a sorted array ‘arr’ containing ‘n’ integers and an integer ‘x’.

Implement the ‘upperBound’ function to find the index of the upper bound of 'x' in the array.

codingNinja -- https://www.codingninjas.com/studio/problems/implement-upper-bound_8165383?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=PROBLEM
*/

package BinarySearch.UpperBound;

class bruteApproachLS {

  public static int UpperBound(int[] nums, int target){

    for (int i = 0; i < nums.length; i++){
      if (nums[i] > target){
        return i;
      }
    }
    return nums.length;
  }

  public static void main(String[] args) {

    int[] arr = {2,3,6,8,8,11,11,12};
    int x = 8;

    int ans = UpperBound(arr,x);
    System.out.println("The upper bound of given x is " + ans);
  }
}