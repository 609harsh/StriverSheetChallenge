import java.util.*;

public class Solution {
    public static boolean isValidParenthesis(String s) {
        Deque<Character> st=new ArrayDeque<>();
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(st.size()==0 && (c[i]=='['||c[i]=='{' || c[i]=='('))st.push(c[i]);
            else if(c[i]=='['||c[i]=='{' || c[i]=='('){
                st.push(c[i]);
            }
            else if(st.size()>=1 && ((c[i]==']'&&st.peek()=='[') || (c[i]==')'&&st.peek()=='(') || (c[i]=='}'&&st.peek()=='{')))
            st.pop();
            else return false;
        }
        return true;
    }
}
