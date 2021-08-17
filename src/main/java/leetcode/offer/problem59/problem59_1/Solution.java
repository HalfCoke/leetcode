package leetcode.offer.problem59.problem59_1;

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
