/*  Insert An Element At Its Bottom In A Given Stack
 
You are given a stack/deque of integers 'MY-STACK' and an integer ‘X’. Your task is to insert ‘X’ to the bottom of ‘MY-STACK’ and return the updated stack/deque.

Note : If ‘MY_STACK’ = [7, 1, 4, 5], then the first element represents the element at the bottom of the stack and the last element represents the element at the top of the stack.

codingNinja -- https://www.codingninjas.com/studio/problems/insert-an-element-at-its-bottom-in-a-given-stack_1171166?leftPanelTabValue=PROBLEM
  */
package Stacks;

import java.util.Stack;

public class InsertAnElementInBottom {

  // Function to insert an element at the bottom of the stack
  public static Stack<Integer> pushAtBottom(Stack<Integer> myStack, int x){

    // Temporary stack to hold elements while pushing to the bottom
    Stack<Integer> temp = new Stack<>();
    while (myStack.size() > 0) {  //--// Push all elements from myStack to temp
      temp.push(myStack.pop());
    }
    myStack.push(x);    //-- // Push the new element at the bottom of myStack
    while (temp.size() > 0) {
      myStack.push(temp.pop()); //--// Pop elements from temp and push them back to myStack
    }
    return myStack; //--    // Return the modified stack

  }

  public static void main(String[] args) {

    int element = 2;    //--// Element to be inserted at the bottom
    Stack<Integer> mStack = new Stack<>();
    mStack.push(7);
    mStack.push(1);
    mStack.push(4);
    mStack.push(5);

    Stack<Integer> newStack = pushAtBottom(mStack, element);
    System.out.println(newStack);
    
  }
}
