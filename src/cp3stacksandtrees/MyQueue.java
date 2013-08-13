/**
 * 
 */
package cp3stacksandtrees;

import java.util.Stack;

/**
 * @author Simon
 * @problem implement a MyQueue class which implements a queue using two stacks.
 */
public class MyQueue<T> {
	Stack<T> s1, s2;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyQueue<Integer> q = new MyQueue<Integer>();
		for (int i = 0; i < 10; i++){
			q.add(i);
		}
		System.out.println(q.size());
		q.remove();
		q.remove();
		q.add(13);
		q.add(12);
		while (!q.isEmpty()){
			System.out.println(q.peek());
			System.out.println(q.remove());
		}
	}
	
	public MyQueue() {
		s1 = new Stack<T>();
		s2 = new Stack<T>();
	}
	
	public int size(){
		return s1.size() + s2.size();
	}
	
	public boolean isEmpty(){
		return s1.isEmpty() && s2.isEmpty();
	}
	
	public void add(T value){
		s1.add(value);
	}
	
	public T peek(){
		if (!s2.isEmpty()) return s2.peek();
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		return s2.peek();
	}
	
	public T remove(){
		if (!s2.isEmpty()) return s2.pop();
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		return s2.pop();
	}
}
