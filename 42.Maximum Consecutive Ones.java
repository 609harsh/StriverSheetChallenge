//Coding Ninjas

import java.util.ArrayList;

public class Solution {
	public static int longestSubSeg(ArrayList<Integer> arr , int n, int k) {
		// Write your code here.
		int i=0,j=0;
        while(j<n){
            if(arr.get(j)==0)k--;
            if(k<0 && arr.get(i++)==0)k++;
            j++;
        }
        return j-i;
	}
}
