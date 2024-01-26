/*  This is how the print function of stack works behind the scene */
package Stacks;
import java.util.*;

public class DisplayStack {
  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    for (int i=1; i <= 5; i++){
      st.push(i);
    }
    System.out.println("Printing using in-built method : " + st);
    System.out.println();

    Stack<Integer> temp = new Stack<>();
    while (st.size() > 0) {
      temp.push(st.pop());
    }
    while (temp.size() > 0) {
      int x = temp.pop();
      System.out.print(x + " ");
      st.push(x);  
    }
    
  }
}
