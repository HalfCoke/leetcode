## 剑指 Offer 45. 把数组排成最小的数

leetcode链接：[https://leetcode-cn.com/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/](https://leetcode-cn.com/problems/ba-shu-zu-pai-cheng-zui-xiao-de-shu-lcof/)

### 题目描述

输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。

**示例 1:**

```
输入: [10,2]
输出: "102"
```

**示例 2:**

```
输入: [3,30,34,5,9]
输出: "3033459"
```

**提示:**

- `0 < nums.length <= 100`

**说明:**

- 输出结果可能非常大，所以你需要返回一个字符串而不是整数。
- 拼接起来的数字可能会有前导 0，最后结果不需要去掉前导 0。

### 解法

自定义排序

### 代码

```java

import org.junit.Assert;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Assert.assertEquals("102", solution.minNumber(new int[]{10, 2}));
        Assert.assertEquals("3033459", solution.minNumber(new int[]{3, 30, 34, 5, 9}));
        Assert.assertEquals("12112", solution.minNumber(new int[]{12, 121}));
        Assert.assertEquals("1399439856075703697382478249389609",
                solution.minNumber(new int[]{824, 938, 1399, 5607, 6973, 5703, 9609, 4398, 8247}));
        Assert.assertEquals("10481090114311471380141714951518154817631922000206021321622281231323622362246526972732745282297030213084316332983399346235163567357536363650366436993836384639053932428344534704479848124980520854225460552956825712578459095972603862216241626563066327651165546636698674467586806685670327100720573217423747175367605784679828070810781081838353839889378939902690949149385944894569533968598279890",
                solution.minNumber(new int[]{4704, 6306, 9385, 7536, 3462, 4798, 5422, 5529, 8070, 6241, 9094, 7846, 663, 6221, 216, 6758, 8353, 3650, 3836, 8183, 3516, 5909, 6744, 1548, 5712, 2281, 3664, 7100, 6698, 7321, 4980, 8937, 3163, 5784, 3298, 9890, 1090, 7605, 1380, 1147, 1495, 3699, 9448, 5208, 9456, 3846, 3567, 6856, 2000, 3575, 7205, 2697, 5972, 7471, 1763, 1143, 1417, 6038, 2313, 6554, 9026, 8107, 9827, 7982, 9685, 3905, 8939, 1048, 282, 7423, 6327, 2970, 4453, 5460, 3399, 9533, 914, 3932, 192, 3084, 6806, 273, 4283, 2060, 5682, 2, 2362, 4812, 7032, 810, 2465, 6511, 213, 2362, 3021, 2745, 3636, 6265, 1518, 8398}));
    }

    public String minNumber(int[] nums) {
        return Arrays.stream(nums).mapToObj(String::valueOf)
                .sorted((o1, o2) -> (o1 + o2).compareTo(o2 + o1)).collect(Collectors.joining());
    }
}

```
