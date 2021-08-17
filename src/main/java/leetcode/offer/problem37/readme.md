## 剑指 Offer 37. 序列化二叉树

leetcode链接：[https://leetcode-cn.com/problems/xu-lie-hua-er-cha-shu-lcof/](https://leetcode-cn.com/problems/xu-lie-hua-er-cha-shu-lcof/)

### 题目描述

你需要设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。

提示：输入输出格式与 LeetCode 目前使用的方式一致，详情请参阅[LeetCode序列化二叉树的格式](https://leetcode-cn.com/faq/#binary-tree)
你并非必须采取这种方式，你也可以采用其他的方法解决这个问题

**示例:**

```
你可以将以下二叉树：

    1
   / \
  2   3
     / \
    4   5

序列化为 "[1,2,3,null,null,4,5]"
```

注意：本题与主站 297 题相同：https://leetcode-cn.com/problems/serialize-and-deserialize-binary-tree/

### 解法

### 代码

```java

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        System.out.println(solution.serialize(root));
        TreeNode node = solution.deserialize(solution.serialize(root));
        System.out.println(node);


        root = new TreeNode(1);
        root.left = new TreeNode(2);
        System.out.println(solution.serialize(root));
        node = solution.deserialize("[5,2,3,null,null,2,4,3,1]");
        System.out.println(node);

        node = solution.deserialize("[1,null,2]");
        System.out.println(node);

        node = solution.deserialize("[1,2,null,3,null,4,null,5]");
        System.out.println(node);
    }


    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) return "[]";
        StringBuilder res = new StringBuilder("[");
        Queue<TreeNode> queue = new LinkedList<>() {{
            add(root);
        }};
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                res.append(node.val + ",");
                queue.add(node.left);
                queue.add(node.right);
            } else res.append("null,");
        }
        res.deleteCharAt(res.length() - 1);
        res.append("]");
        return res.toString();
    }

    // Decodes your encoded data to tree.

    public TreeNode deserialize(String data) {
        if (data.equals("[]")) return null;
        String[] vals = data.substring(1, data.length() - 1).split(",");
        TreeNode root = new TreeNode(Integer.parseInt(vals[0]));
        Queue<TreeNode> queue = new LinkedList<>() {{
            add(root);
        }};
        int i = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (i < vals.length && !vals[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.left);
            }
            i++;
            if (i < vals.length && !vals[i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(vals[i]));
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }
}

```
