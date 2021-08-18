package LeetCode;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-04 12:45
 */
/*
编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。
 */
public class LeetCode14 {
    //另一种方法（横向扫描）
    public String longestCommonPrefix1(String[] strs) {
        if(strs.length == 0)
            return "";
        String ans = strs[0];
        for(int i =1;i<strs.length;i++) {
            int j=0;
            for(;j<ans.length() && j < strs[i].length();j++) {
                if(ans.charAt(j) != strs[i].charAt(j))
                    break;
            }
            ans = ans.substring(0, j);
            if(ans.equals(""))
                return ans;
        }
        return ans;
    }
    //纵向扫描
    public String longestCommonPrefix(String[] strs) {
        //数组为空直接返回
        if(strs.length==0){return "";}
        int len = strs[0].length();
        boolean flag = true;
        char[] charArray = strs[0].toCharArray();
        StringBuilder sb = new StringBuilder();
        //先判断出字符串最小长度值len
        for (int i = 0; i < strs.length; i++) {
            if (len>strs[i].length()) len = strs[i].length();
        }
        //若最短字符串为空，返回"";
        if (len == 0){return "";}
        //遍历0~len
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < strs.length; j++) {
                if(charArray[i] != strs[j].charAt(i)){
                    flag = false;
                }
            }
            if(flag==true) {
                sb.append(charArray[i]);
            }else{break;}
        }
        return sb.toString();
    }
}
