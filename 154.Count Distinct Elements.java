import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<Integer> countDistinctElements(ArrayList<Integer> arr, int k) {

		// Write your code here
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		ArrayList<Integer> list=new ArrayList<>();
		int i=0,j=0;
		for(j=0;j<arr.size();j++){
			if(j-i<k){
				map.put(arr.get(j),map.getOrDefault(arr.get(j),0)+1);
			}
			else{
				list.add(map.size());
				map.put(arr.get(i),map.getOrDefault(arr.get(i),0)-1);
				if(map.get(arr.get(i))<=0)map.remove(arr.get(i));
				i++;
				map.put(arr.get(j),map.getOrDefault(arr.get(j),0)+1);
			}	
		}
		list.add(map.size());
		return list;
	}
}
