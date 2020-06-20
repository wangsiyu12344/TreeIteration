package treeiteration;

import java.util.Stack;

/**
 * 迭代的二叉树前序遍历
 */
public class Preorder {
    public void preOrder(TreeNode root){
        //创建一个栈已保存已遍历的节点
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(node != null || !stack.isEmpty()){
            while(node != null){
                //打印该节点的值
                System.out.println(node.val);
                stack.push(node);
                node = node.left;
            }
            //当第一次退出循环时表示已到最左的叶子节点的左节点(node == null)
            if(!stack.isEmpty()){
                node = stack.pop();
                node = node.right;
            }

        }

    }
}
