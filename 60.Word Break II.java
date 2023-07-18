import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static ArrayList<String> wordBreak(String s, ArrayList<String> wordDict) {
		ArrayList<String> ans=new ArrayList<String>();
        char c[]=s.toCharArray();
        int dp[]=new int[c.length];
        Set<String> set=new HashSet<>(wordDict);
        dp[0]=1;
        recursion(ans,set,s,c.length,0,1,"");
        return ans;
	}
	static void recursion(ArrayList<String> ans,Set<String> set,String string,int n,int s,int e,String str){
      if(s>=n){
        ans.add(str.trim());
        return ;
      }
      for(int i=e;i<=n;i++){
        if(set.contains(string.substring(s,i))){
          recursion(ans,set,string,n,i,i+1,str+string.substring(s,i)+" ");
        }
      }
    }
}
