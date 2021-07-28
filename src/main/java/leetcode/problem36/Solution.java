package leetcode.problem36;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        Node node = new Node(4);
        node.right = new Node(5);
        node.left = new Node(2);
        node.left.left = new Node(1);
        node.left.right = new Node(3);
        solution.treeToDoublyList(node);

    }

    public Node treeToDoublyList(Node root) {
        if (root == null) return null;
        List<Node> midOrder = middleOrder(root);

        for (int i = 0; i < midOrder.size(); i++) {
            midOrder.get(i).right = midOrder.get((i + 1) % midOrder.size());
            midOrder.get(i).left = midOrder.get(((i - 1) + midOrder.size()) % midOrder.size());
        }
        return midOrder.get(0);
    }

    private List<Node> middleOrder(Node root) {
        Stack<Node> nodeStack = new Stack<>();
        ArrayList<Node> nodes = new ArrayList<>();

        nodeStack.push(root);
        while (!nodeStack.isEmpty()) {
            Node peek = nodeStack.peek();
            if (peek.left != null) {
                nodeStack.push(peek.left);
                peek.left = null;
                continue;
            }

            nodes.add(nodeStack.pop());

            if (peek.right != null) {
                nodeStack.push(peek.right);
                peek.right = null;
            }
        }
        return nodes;
    }
}
