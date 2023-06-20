//Coding Ninjas

import java.util.*;

public class Solution 
{
    static ArrayList<ArrayList<Integer>> list;
    static ArrayList<Integer> list2;
    static void uniqueSubsets(ArrayList<Integer> arr,int idx,int sum,int k,int n){
        
        if(idx>=n && sum==k){
            list.add(new ArrayList<>(list2));
            return ;
        }
        if(idx>=n)return ;
        // if(idx>=n)return ;
        
        uniqueSubsets(arr,  idx+1, sum, k,n);
        list2.add(arr.get(idx));
        uniqueSubsets(arr,  idx+1, sum+arr.get(idx), k,n);
        list2.remove(list2.size()-1);
        
    }
    public static ArrayList<ArrayList<Integer>> findSubsetsThatSumToK(ArrayList<Integer> arr, int n, int k) 
	{
        // Write your code here.
        // Collections.sort(arr);
        list=new ArrayList<>();
        list2=new ArrayList<>();
        uniqueSubsets(arr,0,0,k,n);
        return list;
    }
}
