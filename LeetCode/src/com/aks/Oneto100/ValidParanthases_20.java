package com.aks.Oneto100;

import java.util.Stack;

public class ValidParanthases_20 {

	public static void main(String[] args) {
		System.out.println(isValid("()"));

	}

	public static boolean isValid(String s) {

		Stack<Character> st = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ')' && st.pop() != '(') {
				return false;
			} else if (s.charAt(i) == ']' && st.pop() != '[') {
				return false;
			} else if (s.charAt(i) == '}' && st.pop() != '{') {
				return false;
			} else if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
				st.push(s.charAt(i));
			}
		}

		return st.size() > 0 ? false : true;
	}
}
