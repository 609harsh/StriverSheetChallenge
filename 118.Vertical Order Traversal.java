public class Solution 
{
    static class Pair{
        TreeNode<Integer> first;
        int second;
        Pair(TreeNode<Integer> node,int val){
            this.first=node;
            this.second=val;
        }
    }
    public static ArrayList<Integer> verticalOrderTraversal(TreeNode<Integer> root) 
    {
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,ArrayList<Integer>> map=new TreeMap<>();
        q.offer(new Pair(root,0));
        while(!q.isEmpty()){
            Pair p=q.poll();
            TreeNode<Integer> node=p.first;
            int index=p.second;
            if(!map.containsKey(index)){
                map.put(index,new ArrayList<>());
            }
            map.get(index).add(node.data);
            if(node.left!=null)q.offer(new Pair(node.left,index-1));
            if(node.right!=null)q.offer(new Pair(node.right,index+1));
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:map.keySet()){
            for(int val:map.get(i)){
                list.add(val);
            }
        }
        return list;
        //    Write your code here.

    }
}
