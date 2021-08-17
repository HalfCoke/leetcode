package leetcode.problem55.problem55_2;

import leetcode.problem55.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {

    }

    Map<TreeNode, Integer> depthMap = new HashMap<>();

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (depthMap.containsKey(root)) return depthMap.get(root);
        int res = Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        depthMap.put(root, res);
        return res;
    }
}
