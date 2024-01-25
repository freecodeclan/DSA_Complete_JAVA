/*  You are given an array 'arr' sorted in non-decreasing order and a number 'x'.

You must return the index of lower bound of 'x'.

CodingNinja - https://www.codingninjas.com/studio/problems/lower-bound_8165382?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf */

package BinarySearch.LowerBound;


class bruteForceApproach {
  public static int lowerBound(int[]arr, int target ){

    //-Linear Search 
    int n = arr.length;
    for (int i=0; i < n; i++){
      if (arr[i] >= target){
        return i;
      }
    }
    return n;
  }
public static void main(String[] args) {
  int [] arr = {3,5,8,15,19};
  int x = 9;

  int ans = lowerBound(arr, x);
  System.out.println("The lower bound of given x is : " + ans);
} 
}