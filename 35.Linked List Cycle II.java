//Coding Ninjas

import java.util.*;
public class Solution {
    public static Node firstNode(Node head) {
        // Write your code here.
        Set<Node> set=new HashSet<>();
        while(head!=null && !set.contains(head)){
            set.add(head);
            head=head.next;
        }
        return head;
    }
}
