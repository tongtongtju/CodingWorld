package LeetCode1;

/**
 * @author 吃西瓜的通酱
 * @createTime 2022-03-30 22:05
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 三数之和为0
 */
public class LeetCode15 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> list = threeSum(nums);
        System.out.println(list.toString());
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> tempList = new ArrayList<>();
        int p1,p2,res;
        int n = nums.length;
        if(nums == null || n<3) return result;
        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i]>0) break;
            if(i>0 && nums[i]==nums[i-1]) continue;
            p1 = i+1;
            p2 = n-1;
            while (p1<p2){
                tempList.clear();
                res = nums[i]+nums[p1]+nums[p2];
                if(res == 0){
                    tempList.addAll(Arrays.asList(nums[i],nums[p1],nums[p2]));
                    result.add(Arrays.asList(nums[i],nums[p1],nums[p2]));
                    while(p1<p2 && nums[p1]==nums[p1+1]){
                        p1++;
                    }
                    while(p1<p2 && nums[p2]==nums[p2-1]) {
                        p2--;
                    }
                    System.out.println(tempList);
                    p1++;
                    p2--;
                }else if(res > 0){
                    p2--;
                }else {
                    p1++;
                }
            }



        }
        return result;

    }

}
