## 剑指 Offer 32 - I. 从上到下打印二叉树

leetcode链接：[https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/](https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/)

### 题目描述

从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印。

**例如:**

给定二叉树: `[3,9,20,null,null,15,7]`,

```
    3
   / \
  9  20
    /  \
   15   7
```

**返回：**

```
[3,9,20,15,7]
```

**提示：**

- `节点总数 <= 1000`

### 解法

层序遍历

### 代码

```java
package leetcode.problem32.problem32_1;

import leetcode.problem32.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        List<Integer> res = new ArrayList<>();
        List<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.remove(0);
            res.add(cur.val);
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
        return res.stream().mapToInt(value -> value).toArray();
    }
}

```

## 剑指 Offer 32 - II. 从上到下打印二叉树 II

leetcode链接：[https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/](https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/)

### 题目描述

从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。

**例如:**

给定二叉树: `[3,9,20,null,null,15,7]`,

```
    3
   / \
  9  20
    /  \
   15   7
```

返回其层次遍历结果：

```
[
  [3],
  [9,20],
  [15,7]
]
```

**提示：**

- `节点总数 <= 1000`

### 解法

层序遍历保存中间结果

### 代码

```java
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

```

## 剑指 Offer 32 - III. 从上到下打印二叉树 III

leetcode链接：[https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/](https://leetcode-cn.com/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/)

### 题目描述

请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。

**例如:**

给定二叉树: `[3,9,20,null,null,15,7]`,

```
    3
   / \
  9  20
    /  \
   15   7
```

返回其层次遍历结果：

```
[
  [3],
  [20,9],
  [15,7]
]
```

**提示：**

- `节点总数 <= 1000`

### 解法

注意切换数据写入和读取的顺序

### 代码

```java
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

```
