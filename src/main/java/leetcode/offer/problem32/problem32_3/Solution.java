package leetcode.offer.problem32.problem32_3;

import leetcode.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new LinkedList<>();

        Deque<TreeNode> queue = new ArrayDeque<>();
        Deque<TreeNode> level = new ArrayDeque<>();
        Deque<TreeNode> exchange;

        List<List<Integer>> res = new LinkedList<>();
        int levelNum = 0;
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> tmp = new LinkedList<>();
            exchange = level;
            level = queue;
            queue = exchange;
            if (levelNum % 2 == 0) {
                while (!level.isEmpty()) {
                    TreeNode cur = level.pollFirst();
                    tmp.add(cur.val);
                    if (cur.left != null) queue.add(cur.left);
                    if (cur.right != null) queue.add(cur.right);
                }
            } else {
                while (!level.isEmpty()) {
                    TreeNode cur = level.pollLast();
                    tmp.add(cur.val);
                    if (cur.right != null) queue.addFirst(cur.right);
                    if (cur.left != null) queue.addFirst(cur.left);
                }
            }
            levelNum++;
            res.add(tmp);
        }
        return res;
    }
}
