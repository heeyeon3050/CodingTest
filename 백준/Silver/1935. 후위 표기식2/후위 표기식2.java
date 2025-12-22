import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		double arr[] = new double[n];

		String str = br.readLine();

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Stack<Double> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				stack.push(arr[str.charAt(i) - 'A']);
			} else {
				double a = stack.pop();
				double b = stack.pop();

				switch (str.charAt(i)) {
					case '*':
						stack.push(b * a);
						break;
					case '+':
						stack.push(b + a);
						break;
					case '-':
						stack.push(b - a);
						break;
					case '/':
						stack.push(b / a);
						break;
				}
			}
		}

		System.out.println(String.format("%.2f", stack.pop()));
	}
}