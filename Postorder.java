package treeiteration;

import java.util.Stack;

/**
 * 迭代的二叉树后续遍历
 */
public class Postorder {
    public void postOrder(TreeNode root){
        TreeNode node = root;
        TreeNode lastVisit = root;
        Stack<TreeNode> stack = new Stack<>();
        while(node != null || !stack.isEmpty()){
            while(node != null){
                stack.push(node);
                node = node.left;

            }
            //node== null时
            node = stack.peek();
            //node的右子树是否为空或访问过
            if(node.right == null || node.right == lastVisit){
                node = stack.pop();
                System.out.println(node.val);
                lastVisit = node;
                node = null;

            }else{
                //否则继续遍历右子树
                node = node.right;
            }
        }
    }
}
