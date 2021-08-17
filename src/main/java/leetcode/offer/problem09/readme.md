## 剑指 Offer 09. 用两个栈实现队列

leetcode链接：[https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/](https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/)

### 题目描述

用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 `appendTail` 和 `deleteHead` ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，`deleteHead`  操作返回 -1 )

**示例 1：**

```
输入：
["CQueue","appendTail","deleteHead","deleteHead"]
[[],[3],[],[]]
输出：[null,null,3,-1]
```

**示例 2：**

```
输入：
["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
[[],[],[5],[2],[],[]]
输出：[null,-1,null,null,5,2]
```

**提示：**

- `1 <= values <= 10000`
- `最多会对 appendTail、deleteHead 进行 10000 次调用`

### 解法

有两个栈，one和two

append的时候向one中push数据，如果two为空，则把数据转移过去

deleteHead的时候，如果two为空，则先转移数据，在pop

### 代码

```java
import java.util.Stack;

public class CQueue {
    private Stack<Integer> one;
    private Stack<Integer> two;

    public CQueue() {
        one = new Stack<>();
        two = new Stack<>();
    }

    public void appendTail(int value) {
        one.push(value);
        if (two.empty()) {
            move();
        }
    }

    public int deleteHead() {
        if (two.empty()) {
            move();
        }
        return two.empty() ? -1 : two.pop();
    }

    private void move() {
        while (!one.empty()) {
            two.push(one.pop());
        }
    }
}

```
