package leetcode.problem09;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        final CQueue cQueue = new CQueue();
        cQueue.appendTail(1);
        cQueue.appendTail(2);
        cQueue.appendTail(3);
        Assert.assertEquals(1, cQueue.deleteHead());
        Assert.assertEquals(2, cQueue.deleteHead());
        Assert.assertEquals(3, cQueue.deleteHead());

        Assert.assertEquals(-1, cQueue.deleteHead());

        final CQueue1 cQueue1 = new CQueue1();
        cQueue1.appendTail(1);
        cQueue1.appendTail(2);
        cQueue1.appendTail(3);
        Assert.assertEquals(1, cQueue1.deleteHead());
        Assert.assertEquals(2, cQueue1.deleteHead());
        Assert.assertEquals(3, cQueue1.deleteHead());

        Assert.assertEquals(-1, cQueue1.deleteHead());
    }
}
