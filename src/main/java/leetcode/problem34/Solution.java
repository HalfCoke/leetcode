package leetcode.problem34;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

    }

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> res = new LinkedList<>();
        recall(root, target, new ArrayList<>(), res);
        return res;
    }

    private void recall(TreeNode root, int target, List<Integer> path, List<List<Integer>> res) {
        if (root == null) return;
        path.add(root.val);
        if (root.left == null && root.right == null && path.stream().mapToInt(Integer::intValue).sum() == target) {
            res.add(new LinkedList<>(path));
        }
        recall(root.left, target, path, res);
        recall(root.right, target, path, res);
        path.remove(path.size() - 1);
    }
}
