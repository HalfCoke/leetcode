package leetcode.offer.problem35;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {

    }

    public Node copyRandomList(Node head) {
        if (head == null) return null;
        HashMap<Node, Node> nodeMap = new HashMap<>();
        Node cur = head;
        Node pre = null;
        while (cur != null) {
            Node newNode = new Node(cur.val);
            nodeMap.put(cur, newNode);

            if (pre != null) {
                Node node = nodeMap.get(pre);
                node.next = newNode;
            }
            pre = cur;
            cur = cur.next;
        }

        cur = head;
        while (cur != null) {
            if (cur.random != null) {
                Node node = nodeMap.get(cur);
                node.random = nodeMap.get(cur.random);
            }
            cur = cur.next;
        }
        return nodeMap.get(head);
    }
}
