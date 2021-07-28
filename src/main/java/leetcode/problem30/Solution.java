package leetcode.problem30;

import org.junit.Assert;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        Assert.assertEquals(-3, minStack.min());

        minStack.pop();
        Assert.assertEquals(0, minStack.top());
        Assert.assertEquals(-2, minStack.min());
    }
}

class MinStack {

    Stack<Integer> dataStore;
    Stack<Integer> minStore;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        dataStore = new Stack<>();
        minStore = new Stack<>();
    }

    public void push(int x) {
        dataStore.push(x);
        if (minStore.empty() || x <= minStore.peek()) {
            minStore.push(x);
        }
    }

    public void pop() {
        int x = dataStore.pop();
        if (x == minStore.peek()) {
            minStore.pop();
        }
    }

    public int top() {
        return dataStore.peek();
    }

    public int min() {
        return minStore.peek();
    }
}