public class Solution {
    static HashMap<Integer, graphNode> map = new HashMap<>();
    public static graphNode cloneGraph(graphNode node) {
        // Write your code here.
        return clone(node);

    }
    static graphNode clone(graphNode node) {
        if (node == null) return null;
        
        if (map.containsKey(node.data)) 
            return map.get(node.data);
        
        graphNode newNode = new graphNode(node.data, new ArrayList<graphNode>());
        map.put(newNode.data, newNode);
        for (graphNode neighbor : node.neighbours) 
            newNode.neighbours.add(clone(neighbor));
        return newNode;
    }
}
