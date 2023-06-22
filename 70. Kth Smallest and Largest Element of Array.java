//Coding Ninjas
import java.util.*;


public class Solution {
	public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
		//Write your code here
		Collections.sort(arr);
		int lar=k-1;
		int small=n-k;
		ArrayList<Integer> list=new ArrayList<>();
		list.add(arr.get(lar));
		list.add(arr.get(small));
		return list;
	}
}
