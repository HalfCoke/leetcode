package leetcode.problem17;

import org.junit.Assert;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, solution.printNumbers(1));

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, solution.wrapStringNumbers(solution.printStringNumbers(1)));
        System.out.println(String.join("\n",solution.printStringNumbers(5)));
    }

    public int[] printNumbers(int n) {
        int pow = (int) Math.pow(10, n);
        int[] res = new int[pow - 1];
        for (int i = 1; i < pow; i++) {
            res[i - 1] = i;
        }
        return res;
    }

    // 扩展方法，支持大数
    List<String> numbersRes;
    char[] nums = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    public int[] wrapStringNumbers(String[] strings) {
        return Arrays.stream(strings).mapToInt(Integer::parseInt).toArray();
    }

    public String[] printStringNumbers(int n) {
        numbersRes = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            buildNumbers(i, new StringBuilder());
        }
        return numbersRes.toArray(new String[0]);
    }

    private void buildNumbers(int cur, StringBuilder stringBuilder) {
        if (stringBuilder.length() == cur) {
            numbersRes.add(stringBuilder.toString());
            return;
        }
        for (char num : nums) {
            if (Objects.equals(num, '0') && stringBuilder.length() == 0) {
                continue;
            }
            stringBuilder.append(num);
            buildNumbers(cur, stringBuilder);
            stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length());
        }
    }
}
