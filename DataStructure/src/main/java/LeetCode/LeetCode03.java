package LeetCode;

import java.util.HashSet;
import java.util.Hashtable;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-02 23:24
 */
//    给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
public class LeetCode03 {
    public static void main(String[] args) {
        LeetCode03 leetCode03 = new LeetCode03();
        int maxLen = leetCode03.lengthOfLongestSubstring("abcabcbb");
        System.out.println(maxLen);
    }
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        int maxLen = 0;
        HashSet<Character> set = new HashSet<Character>();
        char[] charArray = s.toCharArray();
        int rp = 0;        //right pointer
        for (int i = 0; i < len; i++) {
            if(i!=0){
                set.remove(charArray[i-1]);
            }
            while (rp < len && !set.contains(charArray[rp])){
                set.add(charArray[rp]);
                rp++;
            }
            maxLen = Math.max(maxLen, rp - i);

        }
        return maxLen;
    }
}
