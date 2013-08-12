package cp3stacksandtrees;

import java.util.Stack;

public class SortStack {
	public static void main(String[] args){
		Stack<Integer> s = new Stack<Integer>();
		int[] num = {6, 23, 1, 45, 2, 32, 56, 45, 98, 7};
		for (int i = 0; i < num.length; i++) s.push(num[i]);
		s = sortStack(s);
		while (!s.isEmpty()){
			System.out.println(s.pop());
		}
	}
	
	//ascending
	public static Stack<Integer> sortStack(Stack<Integer> stack){
		Stack<Integer> tmp = new Stack<Integer>();
		while (!stack.isEmpty()){
			int cur = stack.pop();
			while (!tmp.isEmpty() && tmp.peek() > cur) stack.push(tmp.pop());
			tmp.push(cur);
		}
		return tmp;
	}
}
