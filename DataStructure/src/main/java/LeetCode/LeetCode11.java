package LeetCode;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-04 12:13
 */
/*
给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。在坐标内画 n 条垂直线，垂直线 i 的
两个端点分别为 (i, ai) 和 (i, 0) 。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。

说明：你不能倾斜容器。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/container-with-most-water
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode11 {
    //双指针法
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int res = 0;
        while(i<j){
            res = height[i]<height[j]?
                    Math.max(res,(j-i)*height[i++]):
                    Math.max(res,(j-i)*height[j--]);
        }
        return res;
    }


    //暴力解法，时间复杂度为O(n^2),实际运行超出时间限制
    public int maxArea1(int[] height) {
        int len = height.length;
        int vol = 0;
        int temp_vol = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                temp_vol = (j-i)*Math.min(height[i],height[j]);
                vol = temp_vol>vol?temp_vol:vol;
            }
        }

        return vol;
    }
}
