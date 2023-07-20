import java.util.ArrayDeque;

public class Solution{
    static class Queue {
        // Define the data members(if any) here.
        ArrayDeque<Integer> st1=new ArrayDeque<>();
        ArrayDeque<Integer> st2=new ArrayDeque<>();
        Queue() {
            // Initialize your data structure here.

        }

        void enQueue(int val) {
            // Implement the enqueue() function.
            st1.push(val);
        }

        int deQueue() {
            // Implement the dequeue() function.
            // if(isEmpty())return -1;
            int val=peek();
            return val==-1?-1:st2.pop();
        }

        int peek() {
            // if(isEmpty())return -1;
            // Implement the peek() function here.
            if(st2.size()==0){
                while(st1.size()!=0){
                    st2.push(st1.pop());
                }
            }
            if(st2.size()==0)return -1;
            return st2.peek();
            
        }

        boolean isEmpty() {
            return st2.size()==0 && st1.size()==0;
            // Implement the isEmpty() function here.
        }
    }
}
