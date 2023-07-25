public class Solution {
    static class Pair {
        BinaryTreeNode root;
        int val;
        Pair(BinaryTreeNode root,int val){
            this.root=root;
            this.val=val;
        }
    }

    public static ArrayList<Integer> bottomView(BinaryTreeNode root) {
        // Write your code here.  
        ArrayList<Integer> list=new ArrayList<>();
        Queue<Pair> q=new LinkedList<>();
        Map<Integer,Integer> map=new TreeMap<>();
        if(root==null)return list;
        q.offer(new Pair(root,0));
        // map.put(0,root.val);

        while(q.size()!=0){
            Pair p=q.poll();
            BinaryTreeNode node=p.root;
            map.put(p.val,node.val);
            if(node.left!=null)q.offer(new Pair(node.left,p.val-1));
            if(node.right!=null)q.offer(new Pair(node.right,p.val+1));
        }
        for(int i:map.keySet())list.add(map.get(i));
        return list;
    }
}
