## 1137. 第 N 个泰波那契数

### 题目描述

### 解法

矩阵快速幂

### 代码

```java

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals(4, solution.tribonacci(4));
        Assert.assertEquals(1389537, solution.tribonacci(25));
    }


    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        int[][] resMatrix = quickMulti(n - 2);
        return resMatrix[1][2] + resMatrix[2][2];
    }

    private int[][] quickMulti(int n) {
        int[][] matrix = {
                {0, 0, 1},
                {1, 0, 1},
                {0, 1, 1}
        };
        if (n == 1) return matrix;

        int[][] res = null;

        while (n != 0) {
            if (n % 2 != 0) {
                if (res == null) res = matrix;
                else res = multiMatrix(res, matrix);
                n -= 1;
            }
            matrix = multiMatrix(matrix, matrix);
            n /= 2;
        }
        return res;
    }


    private int[][] multiMatrix(int[][] a, int[][] b) {

        int[][] res = new int[a.length][a[0].length];

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                int ai = 0;
                int bi = 0;
                while (ai < a[0].length && bi < b.length) {
                    res[i][j] += a[i][ai] * b[bi][j];
                    ai++;
                    bi++;
                }
            }
        }
        return res;
    }
}

```
