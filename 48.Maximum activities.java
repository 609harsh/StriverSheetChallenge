//Coding Ninjas

import java.util.*;
public class Solution {
    public static int maximumActivities(List<Integer> start, List<Integer> end) {
        //Write your code here
        int [][]time=new int[start.size()][3];
        for(int i=0;i<start.size();i++){
            time[i][0]=start.get(i);
            time[i][1]=end.get(i);
            time[i][2]=i;
        }
        int count=0;
        Arrays.sort(time,(a,b)->a[1]==b[1]?a[2]-b[2]:a[1]-b[1]);
        int max=time[0][1];
        count=1;
        for(int i=1;i<time.length;i++){
            if(time[i][0]>=max){
                count++;
                max=time[i][1];
            }
        }
        return count;
    }
}
