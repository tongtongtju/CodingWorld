package LeetCode1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-06 23:02
 */
/*
给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 */
public class LeetCode144 {
    //迭代
    public List<Integer> preorderTraversal(TreeNode root){

        return null;
    }


    //递归
    public List<Integer> preorderTraversal1(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        preOrder(root,arrayList);
        return arrayList;
    }
    public static void preOrder(TreeNode head, List res){
        if (head == null){
            return;
        }
        res.add(head.val);
        preOrder(head.left,res);
        preOrder(head.right,res);
    }
}
