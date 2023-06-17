//Coding Ninjas

import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    static int merge(ArrayList<Integer> arr,int s,int mid,int e){
        int count=0;
        int j=mid+1;
        for(int i=s;i<=mid;i++){
            while(j<=e && arr.get(i)>(2*(long)(arr.get(j)))){
                j++;
            }
            count+=j-(mid+1);
        }
        ArrayList<Integer> list=new ArrayList<>();
        int left=s,right=mid+1;
        while(left<=mid && right<=e){
            if(arr.get(left)<=arr.get(right))list.add(arr.get(left++));
            else list.add(arr.get(right++));
        }
        while(left<=mid){
            list.add(arr.get(left++));
        }
        while(right<=s){
            list.add(arr.get(right++));
        }
        for(int i=s,k=0;i<=e && k<list.size();i++,k++)arr.set(i,list.get(k));
        return count;
    }
    static int mergeSort(ArrayList<Integer> arr,int s,int e){
        if(s>=e)return 0;
        int mid=(s+e)/2;
        int inv=mergeSort(arr,s,mid);
        inv+=mergeSort(arr,mid+1,e);
        inv+=merge(arr,s,mid,e);
        return inv;
    }
    public static int reversePairs(ArrayList<Integer> arr) 
    {
        return mergeSort(arr,0,arr.size()-1);

    }
}
