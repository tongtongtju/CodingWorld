package LeetCode1;

/**
 * @author 吃西瓜的通酱
 * @createTime 2022-04-12 21:52
 * https://leetcode-cn.com/problems/number-of-lines-to-write-string/
 */
public class LeetCode806 {
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
