package LeetCode1;

import java.util.HashMap;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-04-16 0:08
 */
/*
从前序与中序遍历序列构造二叉树
根据一棵树的前序遍历与中序遍历构造二叉树。

注意:
你可以假设树中没有重复的元素。

例如，给出

前序遍历 preorder = [3,9,20,15,7]
中序遍历 inorder = [9,3,15,20,7]
返回如下的二叉树：

    3
   / \
  9  20
    /  \
   15   7

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal
剑指 Offer 07. 重建二叉树
https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LeetCode105 {
    int[] preOrder;
    HashMap<Integer, Integer> dic = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preOrder = preorder;
        for (int i = 0; i < preorder.length; i++) {
            dic.put(inorder[i],i);
        }
        TreeNode node = recur(0,0,preorder.length-1);
        return node;

    }
    //root为前序遍历索引, left和right为中序遍历索引
    public TreeNode recur(int root, int left, int right){
        if(left>right){return null;}
        TreeNode node = new TreeNode(preOrder[root]);
        int i = dic.get(preOrder[root]);
        node.left = recur(root+1,left,i-1);
        node.right = recur(root+1+i-left, i+1, right);
        return node;
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    
}

