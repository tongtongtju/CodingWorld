package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-03 17:00
 */
//将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
public class LeetCode06 {
    public static void main(String[] args) {
        LeetCode06 leetCode06 = new LeetCode06();
        String convert = leetCode06.convert("AB",1);
        System.out.println(convert);
    }
    public String convert(String s, int numRows) {
        if(numRows<2) return s;
        char[] charArray = s.toCharArray();
        ArrayList<StringBuilder> list = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        int i = 0, flag = -1;
        for(char c: charArray){
            list.get(i).append(c);
            if(i == 0 || i == (numRows-1)){flag = -flag;}
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder sb : list) {
            res.append(sb);
        }

        return res.toString();
    }

}
