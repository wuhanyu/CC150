package cp4treesandgraphs;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversal {
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		System.out.println(new InorderTraversal().inorderTraversal(root));
	}
	
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if (root != null) stack.push(root);
        while (!stack.isEmpty()){
            TreeNode e = stack.peek();
            if (e.left != null){
            	stack.push(e.left);
                e.left = null;         
            } else {
                result.add(e.val);
                stack.pop();
                if (e.right != null){
                	stack.push(e.right);
                    e.right = null;
                }
            }
        }
        return result;
    }
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
