package ch11;

import java.util.*;

public class Ex11_3_Practice {
	public static void main(String[] args) {
		
		Stack st = new Stack();
		String expression = "(3+5)*2)";
		
		System.out.println(expression);
		
		try {
			for(int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if(ch == '(') {
					st.push(ch);
				} else if (ch == ')') {
					st.pop();
				}
			}	
			if(st.isEmpty()) {
				System.out.println("괄호가 일치함.");
			} else {
				System.out.println("괄호가 일치하지 않음");
			}
		} catch(EmptyStackException e) {
			System.out.println("예외 발생");
		}
	}
}
