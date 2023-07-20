import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static int[] nextGreater(int[] arr, int n) {	
		//Write Your code here
		int a[]=new int[n];
		a[n-1]=-1;
		int max=arr[n-1];
		ArrayDeque<Integer> st=new ArrayDeque<>();
		st.push(max);
		for(int i=n-2;i>=0;i--){
			while(st.size()!=0 && st.peek()<=arr[i]){
				st.pop();
			}
			a[i]=st.size()==0?-1:st.peek();
			st.push(arr[i]);
		}
		return a;
		
	}

}
