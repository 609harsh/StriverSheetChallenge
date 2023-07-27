import java.util.* ;
import java.io.*; 

public class Solution {
    

    static class MinStack {
        class Node{
            int val;
            int min;
            Node next;
             Node(int val, int min, Node next) {
                this.val = val;
                this.min = min;
                this.next = next;
            }
        }
        Node head;
        

        // Constructo
        MinStack() {
            // Write your code here.
            // this.st=new ArrayDeque<>();
        }

        // Function to add another element equal to num at the top of stack.
        void push(int num) {
            // Write your code here.
            if(this.head==null)this.head=new Node(num,num,null);
            else {
                this.head=new Node(num,Math.min(num,this.head.min),this.head);
            }
        }

        // Function to remove the top element of the stack.
        int pop() {
            if(this.head==null)return -1;
            int num=this.head.val;
            this.head=this.head.next;
            // Write your code here.
            return num;
        }

        // Function to return the top element of stack if it is present. Otherwise
        // return -1.
        int top() {
            return this.head==null?-1:this.head.val;
            // Write your code here.
        }

        // Function to return minimum element of stack if it is present. Otherwise
        // return -1.
        int getMin() {
            return this.head==null?-1:this.head.min;
            // Write your code here.
        }
    }
}
