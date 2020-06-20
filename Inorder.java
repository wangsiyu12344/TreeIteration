package treeiteration;

import java.util.Stack;

/**
 * 迭代的二叉树中序遍历
 */
public class Inorder {
    public void inOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = root;
        while(node != null || !stack.isEmpty()){
            while(node != null){
                stack.push(node);
                node = node.left;
            }
            //此时node == null
            if(!stack.isEmpty()){
                node = stack.pop();
                System.out.println(node.val);
                node = node.right;
            }
        }

    }
}
