//Coding Ninjas

import java.util.*;

public class Solution {
    public static int calculateMinPatforms(int at[], int dt[], int n) {
        // Write your code here.
        int time[][]=new int[at.length][2];
        for(int i=0;i<at.length;i++){
            time[i][0]=at[i];
            time[i][1]=dt[i];
        }
        // Arrays.sort(time,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        Arrays.sort(at);
        Arrays.sort(dt);
        // Queue<Integer> q=new PriorityQueue<>();

        int size=0;
        int i=1,j=0;
        size++;
        int max=0;
        while(i<n && j<n){
            if(at[i]<=dt[j]){
                size++;
                i++;
            }
            else{
                size--;
                j++;
            }
            max=Math.max(max,size);
            
        }
        max=Math.max(max,size);
        // size=Math.max(size,q.size());
        return max;
    }
}


// 1043
// 1672
// 2076
// 2137
// 2144
// 2234
// 2275
// 1900
