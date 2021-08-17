## 剑指 Offer 59 - I. 滑动窗口的最大值

leetcode链接：[https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/](https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/)

### 题目描述

给定一个数组 `nums` 和滑动窗口的大小 `k`，请找出所有滑动窗口里的最大值。

**示例:**

```
输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
输出: [3,3,5,5,6,7]
解释:

  滑动窗口的位置                最大值
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7
```

**提示：**

- 你可以假设 k 总是有效的，在输入数组不为空的情况下，`1 ≤ k ≤ 输入数组的大小`。

注意：本题与主站 239 题相同：https://leetcode-cn.com/problems/sliding-window-maximum/

### 解法

### 代码

```java
import org.junit.Assert;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, solution.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
        Assert.assertArrayEquals(new int[]{1, -1}, solution.maxSlidingWindow(new int[]{1, -1}, 1));
        Assert.assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, solution.maxSlidingWindow1(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
        Assert.assertArrayEquals(new int[]{1, -1}, solution.maxSlidingWindow1(new int[]{1, -1}, 1));
    }

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 0) return new int[0];
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        ArrayDeque<Integer> numQueue = new ArrayDeque<>(k);

        int[] res = new int[nums.length - k + 1];
        int pos = 0;

        for (int num : nums) {
            numQueue.add(num);
            maxQueue.add(num);
            while (numQueue.size() > k) {
                maxQueue.remove(numQueue.poll());
            }
            if (numQueue.size() == k) {
                res[pos++] = maxQueue.peek();
            }
        }
        return res;
    }

    public int[] maxSlidingWindow1(int[] nums, int k) {
        if (k == 0) return new int[0];
        Deque<Integer> queue = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            while (!queue.isEmpty() && queue.peekLast() < nums[i]) queue.removeLast();
            queue.add(nums[i]);
        }
        res[0] = queue.peek();
        int pos = 1;
        for (int i = k; i < nums.length; i++) {
            if (!queue.isEmpty() && queue.peek() == nums[i - k]) queue.remove();
            while (!queue.isEmpty() && queue.peekLast() < nums[i]) queue.removeLast();
            queue.add(nums[i]);
            res[pos++] = queue.peek();
        }
        return res;
    }
}

```

## 剑指 Offer 59 - II. 队列的最大值

leetcode链接：[https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/](https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof/)

### 题目描述

请定义一个队列并实现函数 `max_value` 得到队列里的最大值，要求函数`max_value`、`push_back` 和 `pop_front` 的**均摊**时间复杂度都是 O(1)。

若队列为空，`pop_front` 和 `max_value`  需要返回 -1

**示例 1:**

```
输入:
["MaxQueue","push_back","push_back","max_value","pop_front","max_value"]
[[],[1],[2],[],[],[]]
输出: [null,null,null,2,1,2]
```

**示例 2:**

```
输入:
["MaxQueue","pop_front","max_value"]
[[],[],[]]
输出: [null,-1,-1]
```

**限制：**

- `1 <= push_back,pop_front,max_value的总操作数 <= 10000`
- `1 <= value <= 10^5`

### 解法

### 代码

```java

import java.util.Deque;
import java.util.LinkedList;

public class MaxQueue {
    Deque<Integer> data, maxData;

    public MaxQueue() {
        data = new LinkedList<>();
        maxData = new LinkedList<>();
    }

    public int max_value() {
        return maxData.isEmpty() ? -1 : maxData.peek();
    }

    public void push_back(int value) {
        data.add(value);
        while (!maxData.isEmpty() && maxData.peekLast() < value) maxData.pollLast();
        maxData.add(value);
    }

    public int pop_front() {
        if (!data.isEmpty()) {
            int res = data.poll();
            if (!maxData.isEmpty() && maxData.peek() == res) maxData.poll();
            return res;
        } else {
            return -1;
        }
    }
}

```
