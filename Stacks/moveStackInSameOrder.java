package Stacks;

import java.util.Stack;

public class moveStackInSameOrder {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    for (int i = 1; i<=5; i++){
      st.push(i);
    }
    System.out.println("This is st stack : " + st);
    System.out.println();

    Stack<Integer> gt = new Stack<>();
    while (st.size() > 0) {
      gt.push(st.pop());
    }

    Stack<Integer> rt = new Stack<>();
    while (gt.size() > 0) {
      rt.push(gt.pop());
    }
    System.out.println("This is rt stack : " + rt);
    System.out.println();
    System.out.println(st.isEmpty());
  }
}
