import java.util.*;
import java.io.*;

public class Solution{
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.
        ArrayDeque<Integer> st=new ArrayDeque<>();
        ArrayList<Integer> a=new ArrayList<>();
        
        a.add(0,-1);
        st.push(arr.get(n-1));
        for(int i=n-2;i>=0;i--){
            while(st.size()!=0 && st.peek()>=arr.get(i)){
                st.pop();
            }
            a.add(0,st.size()==0?-1:st.peek());
            st.push(arr.get(i));
        }
        return a;
    }
}
