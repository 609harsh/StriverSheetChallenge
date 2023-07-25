public class Solution {
    static int f(int i,int j,char c1[],char c2[],Integer dp[][]){

        if(i<0)return j+1;
        if(j<0)return i+1;
        if(dp[i][j]!=null)return dp[i][j];
        if(c1[i]==c2[j])return dp[i][j]=f(i-1,j-1,c1,c2,dp);
        return dp[i][j]=1+Math.min(f(i-1,j,c1,c2,dp),Math.min(f(i,j-1,c1,c2,dp),f(i-1,j-1,c1,c2,dp)));
    }
    public static int editDistance(String str1, String str2) {
        //Your code goes here
        char c1[]=str1.toCharArray();
        char c2[]=str2.toCharArray();
        int n=c1.length;
        int m=c2.length;
        Integer dp[][]=new Integer[n][m];
        return f(n-1,m-1,c1,c2,dp);
    }
}
