import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		// Write your code here.
		int res = arr.get(0), l = 0, r = 0;
        for (int i = 0; i < n; i++) {
            l =  (l == 0 ? 1 : l) * arr.get(i);
            r =  (r == 0 ? 1 : r) * arr.get(n - 1 - i);
            res = Math.max(res, Math.max(l, r));
        }
        return res;
	}
}
