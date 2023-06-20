//Coding Ninjas

import java.util.* ;
import java.io.*; 
public class Solution {
    static boolean checkPalindrome(int s,int e,char[] c){
        e--;
        while(s<e){
            if(c[s]!=c[e])return false;
            s++;
            e--;
        }
        return true;
    }
    static String extractString(int s,int e,char c[]){
        String str="";
        for(int i=s;i<e;i++)str+=c[i];
        return str;
    }
    static void findAllPAlindromes(List<List<String>> list,List<String>list2,
    int idx,char[] c){
        if(idx==c.length)list.add(new ArrayList<>(list2));
        for(int i=idx+1;i<=c.length;i++){
            if(checkPalindrome(idx,i,c)){
                list2.add(extractString(idx,i,c));
                findAllPAlindromes(list,list2,i,c);
                list2.remove(list2.size()-1);
            }
        }
    }
    public static List<List<String>> partition(String s) {

        // Write your code here.
        char c[]=s.toCharArray();
        List<List<String>> list=new ArrayList<>();
        List<String> list2 =new ArrayList<>();
        if(c.length==0)
        System.out.print(list);
        
        int n=c.length;
        for(int i=1;i<=n;i++){
            if(checkPalindrome(0,i,c)){
                list2.add(extractString(0,i,c));
                findAllPAlindromes(list,list2,i,c);
                list2.remove(list2.size()-1);
            }
        }

        return list;
    }
}
