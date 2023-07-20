import java.util.* ;
import java.io.*; 
public class Solution {
    public static Boolean wordBreak(String[] arr, int n, String target) {
        int l=target.length();
        Set<String> set=new HashSet<>();
        for(int i=0;i<n;i++)set.add(arr[i]);
        int dp[]=new int[l+1];
        dp[0]=1;
        for(int i=1;i<=l;i++){
            for(int j=0;j<i;j++){
                if(dp[j]==1 && set.contains(target.substring(j,i))){
                    dp[i]=1;
                    break;
                }

            }
        }
        return dp[l]==1?true:false;
    }
}
