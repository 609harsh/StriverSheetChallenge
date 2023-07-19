public class Solution {
    public static double median(int[] a, int[] b) {
    	int n1=a.length,n2=b.length;
        int n=n1+n2;
        if(n%2==1){
            return solve(a,b,n/2,0,n1-1,0,n2-1)*1.0;
        }
        else{
            return ((solve(a,b,n/2-1,0,n1-1,0,n2-1)+solve(a,b,n/2,0,n1-1,0,n2-1))*1.0)/2;
        }
        
    }
    public int solve(int a[],int b[],int k,int aStart,int aEnd,int bStart,int bEnd){
        if(aStart>aEnd)return b[k-aStart];
        if(bStart>bEnd)return a[k-bStart];

        int aIndex=(aStart+aEnd)/2,bIndex=(bStart+bEnd)/2;
        int aValue=a[aIndex],bValue=[bIndex];

        if(aIndex+bIndex<k){
            if(aValue>bValue){
                return solve(a,b,k,aStart,aEnd,bIndex+1,bEnd);
            }
            else{
                return solve(a,b,k,aIndex+1,aEnd,bStart,bEnd);
            }
        }
        else{
            if(aValue>bValue){
                return solve(a,b,k,aStart,aIndex-1,bStart,bEnd);
            }
            else{
                return solve(a,b,k,aStart,aEnd,bStart,bIndex-1);
            }
        }

    }
}
