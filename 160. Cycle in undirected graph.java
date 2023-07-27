public class Solution {
    static void union(int parent[],int x,int y){
        parent[x]=y;
    }
    static int find(int parent[],int i){
        if(parent[i]==i)return i;
        return find(parent,parent[i]);
    }
    static int isCycle(int[][] edges,int n,int m){
        int parent[]=new int[n];
        for(int i=0;i<n;i++)parent[i]=i;
        for(int i=0;i<m;i++){
            int x=find(parent,edges[i][0]-1);
            int y=find(parent,edges[i][1]-1);

            if(x==y)return 1;
            union(parent,x,y);
        }
        return 0;
    }
    public static String cycleDetection(int[][] edges, int n, int m) {
        // Write your code here.
        return isCycle(edges,n,m)==0?"No":"Yes";
    }
    
}
