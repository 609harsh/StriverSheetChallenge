import java.util.*;
public class Solution{
    static class Stack {
        // Define the data members.
        Deque<Integer> q;

        public Stack() {
            this.q=new ArrayDeque<Integer>();
            // Implement the Constructor.
        }

        /*----------------- Public Functions of Stack -----------------*/

        public int getSize() {
            return this.q.size();
            // Implement the getSize() function.
        }

        public boolean isEmpty() {
            return this.q.size()==0;
            // Implement the isEmpty() function.
        }

        public void push(int x) {
            this.q.add(x);
            // Implement the push(element) function.
        }

        public int pop() {
            if(isEmpty())return -1;
            return this.q.removeLast();
            // Implement the pop() function.
        }

        public int top() {
            if(isEmpty())return -1;
            return this.q.peekLast();
            // Implement the top() function.
        }
    }
}
