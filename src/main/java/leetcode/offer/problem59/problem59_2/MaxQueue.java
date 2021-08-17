package leetcode.offer.problem59.problem59_2;

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
