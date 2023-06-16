//coding Ninjas

import java.io.*;
import java.util.* ;

public class Solution {
  public static String fourSum(int[] arr, int target, int n) {
    HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(map.containsKey(arr[i]+arr[j])){
          map.get(arr[i]+arr[j]).add(i);
          map.get(arr[i]+arr[j]).add(j);
        }
        else{
          map.put(arr[i]+arr[j],new HashSet<Integer>());
          map.get(arr[i]+arr[j]).add(i);
          map.get(arr[i]+arr[j]).add(j); 
        }
      }
    }
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        int sum=arr[i]+arr[j];
        if(map.containsKey(target-sum) && !map.get(target-sum).contains(i) && !map.get(target-sum).contains(j))return "Yes";
      }
    }
    return "No";
  }
}
