//coding Ninjas
import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<String> findPermutations(String s) {
        List<String> list=new ArrayList<String>();
        Set<Integer> set=new HashSet<>();
        char c[]=s.toCharArray();
        permutations(list,c,0,c.length,"",set);

        return list;
    }
    static void permutations(List<String> list,char c[],int idx,int n,String s,Set<Integer> set){
        if(s.length()==n){
            list.add(new String(s));
            return;
        }
        for(int i=0;i<n;i++){
            if(!set.contains(i)){
                set.add(i);
                permutations(list, c, i, n, s+c[i],set);
                set.remove(i);
            }
        }
    }
}
