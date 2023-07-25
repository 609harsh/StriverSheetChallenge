public class Solution {
	static int f(int[] price,int n,int idx,Integer dp[][]){
		if(n==0)return 0;
		if(n<0)return Integer.MIN_VALUE;
		if(idx>=price.length)return Integer.MIN_VALUE;
		if(dp[n][idx]!=null)return dp[n][idx];
		dp[n][idx]=Math.max(price[idx]+f(price,n-idx-1,idx,dp),f(price,n,idx+1,dp));
		return dp[n][idx];
	}
	public static int cutRod(int price[], int n) {
		// Write your code here.
		Integer dp[][]=new Integer[n+1][n];
		return f(price,n,0,dp);
	}
}
