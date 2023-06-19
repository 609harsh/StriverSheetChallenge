//Coding Ninjas

import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Pair class:

        class Pair
        {
        	int weight;
	        int value;
	        Pair(int weight, int value)
	        {
		        this.weight = weight;
		        this.value = value;
	        }
	        
        }
        
*****************************************************************/


public class Solution {
    public static double maximumValue(Pair[] items, int n, int w) {
			Arrays.sort(items,(a,b)->a.weight*b.value-b.weight*a.value);
			int curr=0;
			int i=0;
			double val=1.0*0;
		    while(w>0 && i<items.length){
				if(w>items[i].weight){
					val+=1.0*items[i].value;
					w-=items[i].weight;
				}
				else {
					double x=(items[i].value*w*1.0)/items[i].weight;
					val+=x;
					w=0;
				}
				i++;
			}
			return val;
    }
}
