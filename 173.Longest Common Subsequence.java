public class Solution {

	public static int lcs(String s, String t) {
		//Your code goes here
		char c1[]=s.toCharArray();
		char c2[]=t.toCharArray();
		int dp[][]=new int[c1.length+1][c2.length+1];
		for(int i=1;i<=c1.length;i++){
			for(int j=1;j<=c2.length;j++){
				dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
				if(c1[i-1]==c2[j-1]){
					dp[i][j]=1+dp[i-1][j-1];
				}
			}
		}
		return dp[c1.length][c2.length];
    }

}
