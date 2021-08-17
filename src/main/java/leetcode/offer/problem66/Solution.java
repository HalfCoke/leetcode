package leetcode.offer.problem66;

import org.junit.Assert;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertArrayEquals(new int[]{120, 60, 40, 30, 24}, solution.constructArr1(new int[]{1, 2, 3, 4, 5}));

    }

    public int[] constructArr(int[] a) {
        if (a.length <= 1) return a;
        int[] first = new int[a.length];
        int[] last = new int[a.length];
        first[0] = a[0];
        last[a.length - 1] = a[a.length - 1];
        for (int i = 1; i < a.length; i++) {
            first[i] = first[i - 1] * a[i];
        }
        for (int i = a.length - 2; i >= 0; i--) {
            last[i] = last[i + 1] * a[i];
        }
        int[] res = new int[a.length];
        res[0] = last[1];
        res[res.length - 1] = first[res.length - 2];
        for (int i = 1; i < res.length - 1; i++) {
            res[i] = first[i - 1] * last[i + 1];
        }
        return res;
    }

    public int[] constructArr1(int[] a) {
        if (a.length <= 1) return a;
        int[] res = new int[a.length];
        res[0] = 1;
        for (int i = 1; i < a.length; i++) {
            res[i] = res[i - 1] * a[i - 1];
        }
        int temp = 1;
        for (int i = a.length - 2; i >= 0; i--) {
            temp *= a[i + 1];
            res[i] *= temp;
        }
        return res;
    }
}
