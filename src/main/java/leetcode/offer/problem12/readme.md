## 剑指 Offer 12. 矩阵中的路径

leetcode链接：[https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/](https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/)

### 题目描述

给定一个`m x n`二维字符网格`board`和一个字符串单词`word` 。如果`word`存在于网格中，返回 true ；否则，返回 false 。

单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。

例如，在下面的 3×4 的矩阵中包含单词 "ABCCED"（单词中的字母已标出）。

![](https://assets.leetcode.com/uploads/2020/11/04/word2.jpg)

但矩阵中不包含字符串“abfb”的路径，因为字符串的第一个字符 b 占据了矩阵中的第一行第二个格子之后，路径不能再次进入这个格子。

**示例 1：**

```
输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
输出：true
```

**示例 2：**

```
输入：board = [["a","b"],["c","d"]], word = "abcd"
输出：false
```

**提示：**

- `1 <= board.length <= 200`
- `1 <= board[i].length <= 200`

### 解法

回溯法

#### 补充：回溯法与深度优先搜索区别

DFS只要将所有的点均访问到了即可，是一种无序的搜索

回溯法需要重置状态。每走一步如果不符合约束条件，则需要回到上一步的状态下重新尝试。

参考：

[【Algorithm】回溯法与深度优先遍历的异同](https://blog.csdn.net/weixin_34259559/article/details/85683286?utm_medium=distribute.pc_relevant.none-task-blog-2%7Edefault%7EsearchFromBaidu%7Edefault-17.pc_relevant_baidujshouduan&depth_1-utm_source=distribute.pc_relevant.none-task-blog-2%7Edefault%7EsearchFromBaidu%7Edefault-17.pc_relevant_baidujshouduan)

### 代码

```java
import org.junit.Assert;

import java.util.Objects;

public class Solution {

    final int[][] offset = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};

    public static void main(String[] args) {
        Solution solution = new Solution();

        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        Assert.assertTrue(solution.exist(board, "ABCCED"));

        char[][] board1 = {{'a', 'b'}, {'c', 'd'}};
        Assert.assertFalse(solution.exist(board1, "abcd"));
    }

    public boolean exist(char[][] board, String word) {
        if (board.length != 0 && (board.length * board[0].length < word.length())) return false;
        int[][] accessed = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (Objects.equals(board[i][j], word.charAt(0))) {
                    if (findPathWithPoint(board, i, j, word, accessed)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean findPathWithPoint(char[][] board, int x, int y, String subWord, int[][] accessed) {
        accessed[x][y] = 1;
        if (Objects.equals(board[x][y], subWord.charAt(0))) {
            if (subWord.length() == 1) return true;
            for (int i = 0; i < offset.length; i++) {
                int a = Math.max(0, x + offset[i][0]);
                int b = Math.max(0, y + offset[i][1]);
                a = Math.min(a, board.length - 1);
                b = Math.min(b, board[0].length - 1);
                if (accessed[a][b] == 0
                        && findPathWithPoint(board, a, b, subWord.substring(1), accessed)) {
                    return true;
                }
            }
        }
        accessed[x][y] = 0;
        return false;
    }
}
```
