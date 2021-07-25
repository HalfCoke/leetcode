package leetcode.problem07;

import java.util.Arrays;

/**
 * 复制数组，递归方法
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] preOrder = {1};
        int[] inOrder = {1};

        solution.buildTree(preOrder, inOrder);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 && inorder.length == 0) return null;
        TreeNode rootNode = new TreeNode(preorder[0]);
        int rootIndex = findIndex(preorder[0], inorder);
        if (rootIndex != 0) {
            rootNode.left = build(
                    Arrays.copyOfRange(preorder, 1, rootIndex),
                    Arrays.copyOfRange(inorder, 0, rootIndex));
        }
        if (rootIndex != inorder.length - 1) {
            rootNode.right = build(
                    Arrays.copyOfRange(preorder, rootIndex + 1, preorder.length),
                    Arrays.copyOfRange(inorder, rootIndex + 1, inorder.length));
        }
        return rootNode;
    }

    private TreeNode build(int[] preorder, int[] inorder) {
        if (inorder.length == 1) {
            return new TreeNode(inorder[0]);
        }
        return buildTree(preorder, inorder);
    }

    private int findIndex(int x, int[] order) {
        for (int i = 0; i < order.length; i++) {
            if (x == order[i]) {
                return i;
            }
        }
        return -1;
    }

}

