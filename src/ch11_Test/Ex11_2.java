package ch11_Test;

import java.util.*;

public class Ex11_2 {
	public static void main(String[] args) {
		Stack st = new Stack();
		Queue q = new LinkedList();
		
		System.out.println(st.empty());
		st.push(1);
		st.push(2);
		st.push(3);
		
		System.out.println(st);
		System.out.println(st.empty());

		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		System.out.println(q);
		q.offer(1);
		q.offer(2);
		q.offer(3);
		
		System.out.println(q);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		System.out.println(q);
	}
}
