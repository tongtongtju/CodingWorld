package LeetCode1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 吃西瓜的通酱
 * @createTime 2022-03-30 22:06
 */
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] result = new int[2];
        result[0] = 1;
        result[1] = 0;
        for (char i : s.toCharArray()) {
            result[1] += widths[(i-'a')];
            if (result[1] > 100){
                result[0]++;
                result[1] = widths[(i-'a')];
            }
        }
        return result;

    }
}