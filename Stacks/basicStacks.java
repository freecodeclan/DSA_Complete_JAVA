package Stacks;

import java.util.Stack;
import java.util.*;

public class basicStacks {
  public static void main(String[] args) {
    
    //--Declaratrion of Stack
    Stack<Integer> st = new Stack<>();
    st.push(34);
    st.push(44);
    st.push(24);
    st.push(54);
    st.push(22);

    System.out.println(st);
    System.out.println();


    Collections.sort(st); //-- We can use Collection utility class in java to sort Stack
    System.out.println(st);

   

    System.out.println("The size of stack is " + st.size());
    System.out.println();

    System.out.println("The peek element in stack is " + st.peek()); //- .peek() method used to return largest element in stack


    
  }
}
