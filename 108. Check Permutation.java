import java.util.* ;
import java.io.*; 
public class Solution {
    public static boolean areAnagram(String str1, String str2){
        // Write your code here.
        int a[]=new int[26];
        int b[]=new int[26];
        char c1[]=str1.toCharArray();
        char c2[]=str2.toCharArray();
        for(char c:c1)a[c-'a']++;
        for(char c:c2){
            
            b[c-'a']++;
        }
        int sum=0;
        for(int i=0;i<26;i++){
            if(a[i]!=b[i])return false;
        }
        
        return true;
    }
}
