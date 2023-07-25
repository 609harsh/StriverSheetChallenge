import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static int maxIncreasingDumbbellsSum(ArrayList<Integer> rack, int n) {
        // Write your code here.
        int dp[]=new int[rack.size()];
        for(int i=0;i<n;i++){
            dp[i]=rack.get(i);
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(rack.get(i)>rack.get(j)){
                    dp[i]=Math.max(dp[i],dp[j]+rack.get(i));
                }
            }
        }
        int max=0;
        for(int i:dp)max=Math.max(max,i);
        return max;
    }
}

