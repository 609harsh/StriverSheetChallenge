//Coding Ninjas

import java.util.* ;
import java.io.*; 
public class Solution {
    static Set<String> set;
    static ArrayList<ArrayList<Integer>> list;
    static ArrayList<Integer> list2;
    static void uniqueSubsets(int[] arr,int n,int idx,String s){
        if(idx>=n){
            return ;
        }
        list2.add(arr[idx]);
        if(!set.contains(s+arr[idx])){
                set.add(s+arr[idx]);
                list.add(new ArrayList<>(list2));
            }
        uniqueSubsets(arr, n,idx+1,s+arr[idx]);
        list2.remove(list2.size()-1);
        uniqueSubsets(arr, n,idx+1,s);
        if(!set.contains(s)){
                set.add(s);
                list.add(new ArrayList<>(list2));
            }
        
    }
    public static ArrayList<ArrayList<Integer>> uniqueSubsets(int n, int arr[]) {
        Arrays.sort(arr);
        set=new HashSet<>();
        list=new ArrayList<>();
        list2=new ArrayList<>();
        uniqueSubsets(arr,n,0,"");
        // System.out.println(list);
        return list;
    }

}
