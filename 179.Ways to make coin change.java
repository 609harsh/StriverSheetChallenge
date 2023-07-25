import java.util.*;
public class Solution {
	static long f(int idx,int value,int[] den,Map<String,Long> map){
		if(value<0)return 0;
		if(value==0)return 1;
		if(idx>=den.length)return 0;
		if(map.containsKey(idx+" "+value))return map.get(idx+" "+value);
		map.put(idx+" "+value,f(idx,value-den[idx],den,map)+f(idx+1,value,den,map));
		return map.get(idx+" "+value);
	}
	public static long countWaysToMakeChange(int den[], int value){
        //write your code here
		Map<String,Long> map=new HashMap<>();
		return f(0,value,den,map);			

	}
}


// f(i,sum-i)+f(i+1,sum);
