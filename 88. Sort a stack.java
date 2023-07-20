import java.util.* ;
import java.io.*; 
public class Solution {

	public static void sortStack(Stack<Integer> s) {
		if (s.empty())
            return;
 
        // Remove the top element of the stack
        int x = s.pop();
 
        // Sort the remaining elements in the stack using
        // recursion
        sortStack(s);
 
        // Create two auxiliary stacks
        Stack<Integer> tempStack = new Stack<>();
 
        // Move all elements that are greater than x from
        // the main stack to the tempStack
        while (!s.empty() && s.peek() > x) {
            tempStack.push(s.pop());
        }
 
        // Push x back into the main stack
        s.push(x);
 
        // Move all elements from tempStack back to the main
        // stack
        while (!tempStack.empty()) {
            s.push(tempStack.pop());
        }
	}

}
