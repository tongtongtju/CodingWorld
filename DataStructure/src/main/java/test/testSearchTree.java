package test;

/**
 * @author 吃西瓜的通酱
 * @createTime 2021-07-28 0:22
 */
public class testSearchTree {
    public static void main(String[] args) {
        Node pre = null;
        Node cur = new Node();
        pre.left = cur;
    }
}
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
