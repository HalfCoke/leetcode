package leetcode.offer.problem54;

import leetcode.TreeNode;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(5);
        root.right = new TreeNode(6);
        root.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);
        solution.kthLargest(root, 3);
    }

    int k = 0;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        return preOrder(root).val;
    }

    private TreeNode preOrder(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode res;
        res = preOrder(root.right);
        if (res != null) return res;
        this.k--;
        if (this.k == 0) {
            return root;
        }
        return preOrder(root.left);
    }
}
