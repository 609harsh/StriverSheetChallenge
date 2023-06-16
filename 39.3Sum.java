//Coding Ninjas

import java.util.* ;
import java.io.*; 
public class Solution {

	public static ArrayList<ArrayList<Integer>> findTriplets(int[] nums, int n, int K)  {
		Set<String> set  = new HashSet<>();
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();

        if(nums.length==0){
			return new ArrayList<ArrayList<Integer>>();
		} 
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            int j =i+1;
           int  k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==K ){
					if(!set.contains(nums[i]+" "+nums[j]+" "+nums[k]))
					{
						set.add(nums[i]+" "+nums[j]+" "+nums[k]);
						ArrayList<Integer> res=new ArrayList<Integer>();
						res.add(nums[i]);
						res.add(nums[j]);
						res.add(nums[k]);
						list.add(res);
					}
					j++;
					k--;
				}
                else if (sum>K) k--;
                else if (sum<K) j++;
            }

        }
        
		
		return list;

		// for(int i=0;i<n;i++){
		// 	if(map.containsKey(target-arr[i]) && !map.get(target-arr[i]).contains(i)){
		// 		ArrayList<Integer> =new ArrayList<>();
				
		// 	}
		// }

	}
}
