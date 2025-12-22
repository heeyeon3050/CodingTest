import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String str = br.readLine();

		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				sb.append(str.charAt(i));
			} else if (str.charAt(i) == '(') {
				stack.push(str.charAt(i));
			} else if (str.charAt(i) == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.pop();
			} else {
				while (!stack.isEmpty() && priority(stack.peek()) >= priority(str.charAt(i)) && stack.peek() != '(') {
					sb.append(stack.pop());
				}
				stack.push(str.charAt(i));
			}
		}

		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}

		System.out.println(sb);
	}

	static int priority(char c) {
		if (c == '+' || c == '-') return 1;
		if (c == '*' || c == '/') return 2;
		return 0;
	}
}