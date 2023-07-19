//Coding Ninjas
public class Solution{
    static class Stack {
        int size;
        int curr;
        int a[];
        Stack(int capacity) {
            this.size=capacity;
            this.curr=0;
            a=new int[capacity];
            // Write your code here.
        }
        public void push(int num) {
            if(this.curr==this.size)return;
            a[this.curr]=num;
            this.curr+=1;
            // Write your code here.
        }
        public int pop() {
            // Write your code here.
            if(this.curr<=0)return -1;
            int num=a[this.curr-1];
            this.curr-=1;
            return num;
        }
        public int top() {
            if(this.curr<=0)return -1;
            return a[this.curr-1];
            // Write your code here.
        }
        public int isEmpty() {
            return this.curr==0?1:0;
            // Write your code here.
        }
        public int isFull() {
            return this.curr==this.size?1:0;
            // Write your code here.
        }
    }
}
