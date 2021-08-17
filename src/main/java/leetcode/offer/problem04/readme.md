
## 剑指 Offer 04. 二维数组中的查找

leetcode链接：[https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/](https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof/)

### 题目描述

在一个 n \* m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

**示例:**

现有矩阵 matrix 如下：

```
[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
```

给定 target = 5，返回  `true`。

给定 target = 20，返回  `false`。

**限制：**

- `0 <= n <= 1000`

- `0 <= m <= 1000`

### 解法

直接从左上角开始查找

### 代码

```java

public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[][] matrix = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        assert solution.findNumberIn2DArray(matrix, 5);
        assert !solution.findNumberIn2DArray(matrix, 20);
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        for (int[] line : matrix) {
            for (int i : line) {
                if (target == i) {
                    return true;
                } else if (target < i) {
                    break;
                }
            }
        }
        return false;
    }
}
```