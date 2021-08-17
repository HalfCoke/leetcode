package leetcode.offer.problem32.problem32_2;

import leetcode.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new LinkedList<>();

        List<List<Integer>> res = new LinkedList<>();
        List<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            List<TreeNode> temp = new LinkedList<>();
            List<Integer> tempRes = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.remove(0);
                tempRes.add(node.val);
                if (node.left != null) {
                    temp.add(node.left);
                }
                if (node.right != null) {
                    temp.add(node.right);
                }
            }
            res.add(tempRes);
            queue = temp;
        }
        return res;
    }
}
