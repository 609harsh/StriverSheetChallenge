import java.util.* ;
import java.io.*; 
public class Solution {
    static boolean f(int idx,int n,int k,int[]arr,Integer[][] dp){
        if(k==0)return true;
        if(k<0 || idx>=n)return false;
        if(dp[idx][k]!=null)return dp[idx][k]==0?false:true;
        boolean val=f(idx+1,n,k-arr[idx],arr,dp)||f(idx+1,n,k,arr,dp);
        dp[idx][k]=val?1:0;
        return val;
    }
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.

        Integer [][]dp=new Integer[n+1][k+1];
        return f(0,n,k,arr,dp);

    }
}
