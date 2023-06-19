//Coding Ninjas
import java.util.* ;
import java.io.*; 
public class Solution {
    public static List<Integer> maximumMeetings(int[] start, int[] end) {        
        int time[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++){
            time[i][0]=start[i];
            time[i][1]=end[i];
            time[i][2]=i;
        }
        Arrays.sort(time,(a,b)->a[1]==b[1]?a[2]-b[2]:a[1]-b[1]);
        List<Integer> list=new ArrayList<>();
        list.add(time[0][2]+1);
        int max=time[0][1];
        for(int i=1;i<time.length;i++){
            if(time[i][0]>max){
                list.add(time[i][2]+1);
                max=time[i][1];
            }
        }
        return list;
    }
}



// 0 1 3 5 5 8
// 6 2 4 7 9 9

// 0 1 7 4 8
// 2 5 9 9 10
