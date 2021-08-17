package leetcode.offer.problem41;

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
