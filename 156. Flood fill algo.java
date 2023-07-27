public class Solution
{
    public static int[][] floodFill(int[][] image, int x, int y, int newColor)
    {
        // Write your code here
        int dir[][]=new int[][]{{-1,0},{0,-1},{1,0},{0,1}};
        int visit[][]=new int[image.length][image[0].length];
        int oldColor=image[x][y];
        recursion(dir,visit,image,x,y,newColor,oldColor);
        return image;
    }
    static void recursion(int [][] dir,int[][]visit,int [][]image,int x,int y,int newColor,int oldColor){
        if(x<0  || y<0 || y>=image[0].length || x>= image.length)return ; 
        if(visit[x][y]==1 || image[x][y]!=oldColor)return ;
        visit[x][y]=1;
        image[x][y]=newColor;
        recursion(dir,visit,image,x-1,y,newColor,oldColor);
        recursion(dir,visit,image,x,y-1,newColor,oldColor);
        recursion(dir,visit,image,x+1,y,newColor,oldColor);
        recursion(dir,visit,image,x,y+1,newColor,oldColor);
    }
}
