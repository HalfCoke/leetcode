## 103. 二叉树的锯齿形层序遍历

leetcode链接：[https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/](https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/)

### 题目描述

### 解法

### 代码

```java
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new LinkedList<>();
        List<TreeNode> level = new LinkedList<>();
        List<TreeNode> temp = new LinkedList<>();
        List<List<Integer>> res = new LinkedList<>();
        int flag = 1;
        level.add(root);
        while (!level.isEmpty()) {
            List<TreeNode> t = temp;
            temp = level;
            level = t;
            List<Integer> resTemp = new LinkedList<>();
            while (!temp.isEmpty()) {
                TreeNode node = temp.remove(0);
                resTemp.add(node.val);
                if (node.left != null) level.add(node.left);
                if (node.right != null) level.add(node.right);
            }
            if (flag == -1) {
                Collections.reverse(resTemp);
            }
            res.add(resTemp);
            flag *= -1;
        }
        return res;
    }
}
```