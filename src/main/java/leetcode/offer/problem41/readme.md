## 剑指 Offer 41. 数据流中的中位数

leetcode链接：[https://leetcode-cn.com/problems/shu-ju-liu-zhong-de-zhong-wei-shu-lcof/](https://leetcode-cn.com/problems/shu-ju-liu-zhong-de-zhong-wei-shu-lcof/)

### 题目描述

如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。

例如，

`[2,3,4]`  的中位数是 3

`[2,3]` 的中位数是 (2 + 3) / 2 = 2.5

设计一个支持以下两种操作的数据结构：

- void addNum(int num) - 从数据流中添加一个整数到数据结构中。
- double findMedian() - 返回目前所有元素的中位数。

**示例 1：**

```
输入：
["MedianFinder","addNum","addNum","findMedian","addNum","findMedian"]
[[],[1],[2],[],[3],[]]
输出：[null,null,null,1.50000,null,2.00000]
```

**示例 2：**

```
输入：
["MedianFinder","addNum","findMedian","addNum","findMedian"]
[[],[2],[],[3],[]]
输出：[null,null,2.00000,null,2.50000]
```

**限制：**

- 最多会对 addNum、findMedia 进行 50000 次调用。

注意：本题与主站 295 题相同：https://leetcode-cn.com/problems/find-median-from-data-stream/

### 解法

使用大顶堆和小顶堆

### 代码

```java

import java.util.PriorityQueue;
import java.util.Queue;

public class MedianFinder {
    Queue<Integer> A, B;

    /**
     * initialize your data structure here.
     */
    public MedianFinder() {
        A = new PriorityQueue<>(); // 小顶堆
        B = new PriorityQueue<>((o1, o2) -> o2 - o1); // 大顶堆
    }

    public void addNum(int num) {
        int n = A.size();
        int m = B.size();
        if (n == m) {
            A.add(num);
            B.add(A.poll());
        } else {
            B.add(num);
            A.add(B.poll());
        }
    }

    public double findMedian() {
        int n = A.size();
        int m = B.size();
        if (n == m) {
            return (double) (A.peek() + B.peek()) / 2;
        } else {
            return (double) B.peek();
        }
    }
}

```
