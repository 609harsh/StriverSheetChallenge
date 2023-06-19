//coding Ninjas

import java.util.* ;
import java.io.*; 
public class Solution
{
public static int findMinimumCoins(int amount)
    {
        // Write your code here.
        int coins[]={1,2,5,10,20,50,100,500,1000};
        int start=8;
        int count=0;
        while(start>=0){
            while(amount>=coins[start]){
                amount-=coins[start];
                count++;
            }
            start--;
        }
        return count;
    }
}
