
import java.util.*;

public class Solution
{
	public static int getMedian(ArrayList<ArrayList<Integer>> matrix)
	{
		
		PriorityQueue<int[]> q=new PriorityQueue<int[]>((a,b)->a[0]-b[0]);
		int n=matrix.size();
		int m=matrix.get(0).size();
		int count=0;
		for(int i=0;i<n;i++){
			q.add(new int[]{matrix.get(i).get(0),i,0});
			// count++;
		}
		int len=(matrix.size()*matrix.get(0).size())/2;
		// System.out.println(q);
		int val=0;
		int num[];
		while(count<=len){
			count++;
			num=q.poll();
			val=num[0];
			if(num[0]==-1)continue;
			else if(num[2]+1<m)
			q.add(new int[]{matrix.get(num[1]).get(num[2]+1),num[1],num[2]+1});
			else q.add(new int[]{Integer.MAX_VALUE,-1,-1});
			
		}
		return val;
		
	}
}
