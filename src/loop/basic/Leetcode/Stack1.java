package loop.basic.Leetcode;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {

		System.out.println(isValid("["));
		System.out.println(isValid("{{[()}]}"));
		System.out.println(isValid("[{[{}]()}]"));
		System.out.println(isValid("]"));
		System.out.println(isValid("{[]}}"));
		System.out.println(isValid("{[]}}"));
		System.out.println(isValid("(])"));


		/*
		 * // String st = "{{[()}]}"; String st1 = "[{[{}]()}]";
		 * Stack<Character> s = new Stack<>(); char ch[] = st1.toCharArray();
		 * for (int i = 0; i < ch.length; i++) { if (ch[i] == '{' || ch[i] ==
		 * '[' || ch[i] == '(') { s.push(ch[i]);
		 * 
		 * } else if (s.peek() == '(' && ch[i] == ')' || s.peek() == '[' &&
		 * ch[i] == ']' || s.peek() == '{' && ch[i] == '}') { s.pop();
		 * 
		 * } } if (s.empty()) { System.out.println("braket is correct"); } else
		 * { System.out.println("braket is not correct"); }
		 * 
		 */}

	public static boolean isValid(String s) {
		Stack<Character> s1 = new Stack<>();
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			

			 if (ch[i] == '{' || ch[i] == '[' || ch[i] == '(') {
				s1.push(ch[i]);

			}else if(s1.empty()&& ch[i]==']'||s1.empty()&& ch[i]=='}'||s1.empty()&& ch[i]==')'){
				return false;
			}
			 else if (s1.peek() == '(' && ch[i] == ')' || s1.peek() == '[' && ch[i] == ']'
					|| s1.peek() == '{' && ch[i] == '}') {
				s1.pop();

			}
			 else{
				 return false;
			 }
		}

		return s1.empty();

	}

}
