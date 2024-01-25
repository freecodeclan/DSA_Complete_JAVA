package Stacks;

import java.util.Stack;

public class basic2 {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    for (int i = 1; i <= 5; i++){
      st.push(i);
    }
    System.out.println(st);
    System.out.println();
    System.out.println(st.size());
  }
  
}
