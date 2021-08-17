package leetcode.problem41;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        Assert.assertEquals(1.5, medianFinder.findMedian(), 0.0000001);
        medianFinder.addNum(3);
        Assert.assertEquals(2.0, medianFinder.findMedian(), 0.0000001);
    }

}
