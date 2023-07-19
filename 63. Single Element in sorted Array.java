import java.util.ArrayList;
public class Solution
{
    public static int singleNonDuplicate(ArrayList<Integer> nums)
    {
        int n=nums.size();
        int l=0;
        int h=n;
        while(l<=h){
            int mid=l+(h-l)/2;
            // System.out.println(mid);
            if(mid>=1 && nums.get(mid)-nums.get(mid-1)==0 && (mid%2)==0){
                // System.out.println(mid+" 1");
                h=mid-1;
            }
            else if(mid>=1 && nums.get(mid)-nums.get(mid-1)==0 && (mid%2)==1){
                // System.out.println(mid+" 2");
                l=mid+1;
            }
            else if(mid<=n-2 && nums.get(mid)-nums.get(mid+1)==0 && ((n-mid)%2)==1){
                // System.out.println(mid+" 3");
                l=mid+1;
            }
            else if(mid<=n-2 && nums.get(mid)-nums.get(mid+1)==0 && ((n-mid)%2)==0){
                // System.out.println(mid+" "+4);
                h=mid-1;
            }
            else{
                
                // if(nums.get(mid)-nums.get(mid-1)==0)System.out.println(mid+"==mid-1 ");
                return nums.get(mid);
            }
        }
        return -1;
    }
}
