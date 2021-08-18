package LeetCode;

import org.junit.Test;

import java.util.HashMap;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-02 10:38
 */
/*
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，
并返回它们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
你可以按任意顺序返回答案。
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/two-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode01 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
    public static int[] twoSum1(int[] nums, int target) {
        //哈希表
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hashMap.containsKey(target-nums[i])){
                return new int[]{i,hashMap.get(target-nums[i])};
            }
            hashMap.put(nums[i],i);
        }
        return new int[0];
    }


    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4};
        int[] ints1 = LeetCode01.twoSum(ints, 3);
        System.out.println(ints1[1]);
    }

}


