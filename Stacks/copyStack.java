package Stacks;

// import java.util.Scanner;
import java.util.Stack;

public class copyStack {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    Stack<Integer> st = new Stack<>();

    // int n;
    // System.out.print("Enter the elements you want in stack: ");
    // n = sc.nextInt();

    System.out.println("Enter the elements now: ");
    for (int i = 1; i <= 5; i++){
      // int x = sc.nextInt();
      st.push(i);
    }
    System.out.println(st);
    System.out.println();

    Stack<Integer> rt = new Stack<>();
    while (st.size() > 0) {
      
      rt.push(st.pop());
      
    }
    System.out.println(rt);   
  }
}
