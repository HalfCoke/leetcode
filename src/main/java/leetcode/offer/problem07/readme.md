## 剑指 Offer 07. 重建二叉树

leetcode链接：[https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/](https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/)

### 题目描述

输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。

例如，给出

```
前序遍历 preorder = [3,9,20,15,7]
中序遍历 inorder = [9,3,15,20,7]
```

返回如下的二叉树：

```
    3
   / \
  9  20
    /  \
   15   7
```

**限制：**

- `0 <= 节点个数 <= 5000`

### 解法

直接递归求解

下面代码中寻找索引的部分可以使用hashmap优化

### 代码

```java
public class Solution {
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
```
