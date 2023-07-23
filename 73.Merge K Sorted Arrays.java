import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.concurrent.PriorityBlockingQueue;

public class Solution 
{
	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> kArrays, int k)
	{
		ArrayList<Integer> list=new ArrayList<>();
		Queue<int[]> q=new PriorityQueue<>((a,b)->a[0]-b[0]);
		int n=kArrays.size();
		for(int i=0;i<n;i++){
			q.add(new int[]{kArrays.get(i).get(0),i,1});
		}
		while(q.size()!=0){
			int num[]=q.poll();
			list.add(num[0]);
			if(num[2]<kArrays.get(num[1]).size())
			q.add(new int[]{kArrays.get(num[1]).get(num[2]),num[1],num[2]+1});
		}
		return list;
		// Write your code here.
	}
}
