package cp3stacksandtrees;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 */

/**
 * @author Simon@itechs
 *
 */
public class HanoiStack {

	/**
	 * @param args
	 */
	static ArrayList<Stack<Integer>> rob = new ArrayList<Stack<Integer>>();
	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i < 3; i++){
			Stack<Integer> s = new Stack<Integer>();
			rob.add(s);
		}
		
		for (int i = n; i >= 1; i--){
			rob.get(0).push(i);
		}
		move(0, 2, 1, n);
		while (!rob.get(2).isEmpty()){
			System.out.println(rob.get(2).pop());
		}
	}
	
	static void move(int from, int to, int via, int n){
		if (n == 1){
			rob.get(to).push(rob.get(from).pop());
			System.out.printf("%c -> %c\n", (char)('A' + from), (char)('A' + to));
		} else {
			move(from, via, to, n - 1);
			move(from, to, via, 1);
			move(via, to, from, n - 1);
		}
	}

}
