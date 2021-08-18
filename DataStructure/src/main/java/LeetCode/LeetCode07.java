package LeetCode;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-03 19:23
 */
/*
给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。

如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。

假设环境不允许存储 64 位整数（有符号或无符号）。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reverse-integer
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode07 {
    public static void main(String[] args) {
        LeetCode07 leetCode07 = new LeetCode07();
        int reverse = leetCode07.reverse(2147483647);
        System.out.println(reverse);
//        int ans = 2147483647;
//        System.out.println(ans * 10 / 10); // -1 超出int范围会输出-1

    }
    //判断反转后的数是否超过最大值
    public int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    //不转为字符串求解
    public int reverse1(int x) {
        int ans = 0;
        while (x != 0) {
            if ((ans * 10) / 10 != ans) { //这里非常巧妙！！
                ans = 0;
                break;
            }
            ans = ans * 10 + x % 10;
            x = x / 10;
        }
        return ans;

    }
    //转为字符串求解
    public int reverse(int x) {
        String xString = String.valueOf(x);

        try {
            if(x<0){
                String string = xString.substring(1);
                StringBuilder reverse = new StringBuilder(string).reverse();
                return -Integer.parseInt(String.valueOf(reverse));
            }else{
                String string = xString;
                StringBuilder reverse = new StringBuilder(string).reverse();
                return Integer.parseInt(String.valueOf(reverse));
            }
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
