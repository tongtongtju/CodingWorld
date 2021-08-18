package LeetCode;

import java.security.cert.TrustAnchor;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-02 15:00
 */
/*
给你一个字符串 s，找到 s 中最长的回文子串。
动态规划
 */
public class LeetCode05 {
    public static void main(String[] args) {
        String s = "cbbd";
        LeetCode05 leetCode05 = new LeetCode05();
        String s1 = leetCode05.longestPalindrome02(s);
        System.out.println(s1);
    }
    //动态规划
    public String longestPalindrome02(String s) {
        int len = s.length();
        if(len<2){return s;}
        char[] charArray = s.toCharArray();

        int start = 0;
        int maxLen = 1;
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        for (int j = 1; j < len; j++) {
            for (int i = 0; i < j; i++) {
                if(charArray[i] != charArray[j]) {
                    dp[i][j]=false;
                }else{
                    if(j-i<3){
                        dp[i][j]=true;
                    }else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                if(dp[i][j]&&j-i+1>maxLen){
                    start=i;
                    maxLen=j-i+1;
                }
            }

        }
        return s.substring(start,start+maxLen);


    }
    //暴力匹配

    //Manacher 算法
    //中心扩散法
    public String longestPalindrome01(String s) {
        //特判
        int len = s.length();
        if(len<2){
            return s;
        }

        int maxLen = 1;
        String maxStr = s.substring(0,1);
        for (int i = 0; i < len-1; i++) {
            String oddStr = centerSpread(s,i,i);
            String evenStr = centerSpread(s,i,i+1);
            String maxLenStr = (oddStr.length()>evenStr.length()?oddStr:evenStr);
            if(maxLen < maxLenStr.length()){
                maxStr = maxLenStr;
                maxLen = maxStr.length();
            }
        }
        return maxStr;
    }
    public String centerSpread(String s,int left,int right){
        int len = s.length();
        int i = left;
        int j = right;
        while (i>=0 && j<len){
            if(s.charAt(i)==s.charAt(j)){
                i--;
                j++;
            }else{
                break;
            }
        }

        return s.substring(i+1,j);

    }

}

