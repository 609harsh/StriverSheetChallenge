public class Solution {
 
	public static TreeNode<Integer> preOrderTree(int[] preOrder) {
 		return createTree(preOrder,0,preOrder.length-1);
	}
    
    public static TreeNode createTree(int[] preOrder, int preStart, int preEnd){
        if(preStart > preEnd)
                return null;
        
        TreeNode node = new TreeNode(preOrder[preStart]);
        int i = preStart + 1;
        int count = 0;
        while(i<preOrder.length && preOrder[i] < preOrder[preStart]){
            count++;
            i++;
        }

        node.left = createTree(preOrder, preStart + 1, preStart + count);
        node.right = createTree(preOrder, preStart + count + 1,preEnd);
        
        return node;
    }

}
