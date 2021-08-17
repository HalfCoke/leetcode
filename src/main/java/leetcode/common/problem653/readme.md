## 题目名称

### 题目描述

给定一个二叉搜索树 root 和一个目标结果 k，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。

### 解法
中序遍历，再双指针
### 代码

```java

package leetcode.common.problem653;

import leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<Integer> res = new ArrayList<>();

    public boolean findTarget(TreeNode root, int k) {
        midOrder(root);
        if (res.size() == 0) return false;
        int first = 0, last = res.size() - 1;
        while (first < last) {
            if (res.get(first) + res.get(last) > k) {
                last--;
            } else if (res.get(first) + res.get(last) < k) {
                first++;
            } else {
                return true;
            }
        }
        return false;

    }

    private void midOrder(TreeNode root) {
        if (root == null) return;
        if (root.left != null) midOrder(root.left);
        res.add(root.val);
        if (root.right != null) midOrder(root.right);
    }

}

```
