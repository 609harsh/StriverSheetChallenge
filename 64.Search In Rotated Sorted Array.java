//Coding Ninjas

public class Solution {
    public static int search(int nums[], int target) {
        // Write your code here.
        int lo=0,hi=nums.length;
        while(lo<hi){
            int mid=(lo+hi)/2;
            int num=(target<nums[0] == nums[mid]<nums[0])?nums[mid]:target<nums[0]?Integer.MIN_VALUE:Integer.MAX_VALUE;
            if(num<target)lo=mid+1;
            else if(num>target)hi=mid;
            else return mid;
        }
        return -1;
    }
}
