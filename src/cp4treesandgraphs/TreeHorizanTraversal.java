/**
 * 
 */
package cp4treesandgraphs;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @author Simon
 * @problem Given a binary search tree, design an algorithm which create a
 *          linked list of all the nodes at each depth (eg, if you have a tree
 *          with depth D, you'll hava D Linked list
 * 
 * @note implemented as LeetCode http://leetcode.com/onlinejudge#question_102
 *       Minor change has been made
 */
public class TreeHorizanTraversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	ArrayList<LinkedList<TreeNode>> findLevelLinkList(TreeNode root){
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		if (root == null)
			return result;
		ArrayList<TreeNode> q = new ArrayList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			LinkedList<TreeNode> list = new LinkedList<TreeNode>();
			ArrayList<TreeNode> nextlevel = new ArrayList<TreeNode>();
			for (int i = 0; i < q.size(); i++) {
				TreeNode e = q.get(i);
				list.add(e);
				if (e.left != null)
					nextlevel.add(e.left);
				if (e.right != null)
					nextlevel.add(e.right);
			}
			q = nextlevel;
			result.add(list);
		}
		return result;		
	}

	//leet code
	public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (root == null)
			return result;
		ArrayList<TreeNode> q = new ArrayList<TreeNode>();
		q.add(root);
		while (!q.isEmpty()) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			ArrayList<TreeNode> nextlevel = new ArrayList<TreeNode>();
			for (int i = 0; i < q.size(); i++) {
				TreeNode e = q.get(i);
				list.add(e.val);
				if (e.left != null)
					nextlevel.add(e.left);
				if (e.right != null)
					nextlevel.add(e.right);
			}
			q = nextlevel;
			result.add(list);
		}
		return result;
	}

}
