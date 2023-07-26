import java.util.* ;
import java.io.*; 
public class Solution {

	static int kthLargest(ArrayList<Integer> arr, int size, int K) {
		// Write your code here.
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<size;i++){
			if(i<K)pq.add(arr.get(i));
			else if(pq.peek()<arr.get(i)){
				pq.poll();
				pq.add(arr.get(i));
			}
		}
		return pq.peek();

	}
}
