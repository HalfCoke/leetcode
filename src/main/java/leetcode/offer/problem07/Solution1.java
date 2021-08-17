package leetcode.problem07;

import leetcode.TreeNode;

/**
 * 递归方法，不复制数组
 */
public class Solution1 {
    public static void main(String[] args) {
        Solution1 solution = new Solution1();

        int[] preOrder = {1};
        int[] inOrder = {1};

        solution.buildTree(preOrder, inOrder);
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 && inorder.length == 0) return null;
        return build(preorder, inorder, 0, preorder.length, 0, inorder.length);
    }

    private TreeNode build(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
        if (inEnd - inStart == 1) {
            return new TreeNode(inorder[inStart]);
        }
        TreeNode rootNode = new TreeNode(preorder[preStart]);
        int index = findIndex(preorder[preStart], inorder);
        if (index != inStart) {
            rootNode.left = build(preorder, inorder, preStart + 1, preStart + (index - inStart), inStart, index);
        }
        if (index != inEnd - 1) {
            rootNode.right = build(preorder, inorder, preStart + (index - inStart) + 1, preEnd, index + 1, inEnd);
        }
        return rootNode;
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

