package com.abelkin;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);

	    byte t = in.nextByte();

	    for (byte i = 0; i < t; i++) {
	        String expression = in.next();
            Stack<Character> stack = new Stack<>();
            StringBuilder out = new StringBuilder();
            for (int k = 0; k < expression.length(); k++) {
                switch (expression.charAt(k)) {
                    case '+':
                    case '-':
                        while (!stack.empty() && (stack.peek() == '*' || stack.peek() == '/') || stack.peek() == '^') {
                            out.append(stack.pop());
                        }
                        stack.push(expression.charAt(k));
                        break;
                    case '*':
                    case '/':
                        stack.push(expression.charAt(k));
                        break;
                    case '^':
                        stack.push(expression.charAt(k));
                        break;
                    case '(':
                        stack.push(expression.charAt(k));
                        break;
                    case ')':
                        while (!stack.empty() && stack.peek() != '(') {
                            out.append(stack.pop());
                        }
                        stack.pop();
                        break;
                    default:
                        out.append(expression.charAt(k));
                        break;
                }
            }
            System.out.println(out.toString());

        }
    }
}
