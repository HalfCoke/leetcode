package leetcode.offer.problem05;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "We are happy.";
        Assert.assertEquals("We%20are%20happy.", solution.replaceSpace(s));
    }

    public String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }
}
