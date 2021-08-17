package leetcode.offer.problem55.problem55_1;

import leetcode.TreeNode;

import java.util.ArrayDeque;

public class Solution {
    public static void main(String[] args) {

    }

    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        ArrayDeque<TreeNode> level = new ArrayDeque<>();
        ArrayDeque<TreeNode> exchange = new ArrayDeque<>();

        int res = 0;
        level.add(root);
        while (!level.isEmpty()) {
            ArrayDeque<TreeNode> t = exchange;
            exchange = level;
            level = t;
            while (!exchange.isEmpty()) {
                TreeNode node = exchange.poll();
                if (node.left != null) level.add(node.left);
                if (node.right != null) level.add(node.right);
            }
            res++;
        }
        return res;
    }
}
