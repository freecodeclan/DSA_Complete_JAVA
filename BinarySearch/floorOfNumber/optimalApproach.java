/*  You're given a sorted array 'a' of 'n' integers and an integer 'x'.

Find the floor and ceiling of 'x' in 'a[0..n-1]'.

Note:

Floor of 'x' is the largest element in the array which is smaller than or equal to 'x'.
Ceiling of 'x' is the smallest element in the array greater than or equal to 'x'. 

codingNinja --- https://www.codingninjas.com/studio/problems/ceiling-in-a-sorted-array_1825401?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
*/
package BinarySearch.floorOfNumber;

public class optimalApproach {

  static int findFloor(int[] arr, int n, int target){
    int s = 0;
    int e = n-1;

    while (s <= e) {
      int mid = s + (e - s);
      if (arr[mid] == target){
        return arr[mid];
      }
      else if (target < arr[mid]){
        e = mid - 1;
      }
      else{
        s = mid + 1;
      }
    }
    if (e >= 0) {
      return arr[e];
    }
    else return -1;
  }
  public static void main(String[] args) {
    int[] a = {3,4,7,8,8,10};
    int n = 6;
    int x = 6;

    int floor = findFloor(a, n, x);
    System.out.println(floor);
  }
}
