import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		Stack<Integer> stack = new Stack<>();

		int n = Integer.parseInt(br.readLine());
		int cur = 1;

		for(int i=0; i<n; i++){
			int num = Integer.parseInt(br.readLine());

			while(cur <= num){
				stack.push(cur++);
				sb.append("+\n");
			}

			if(!stack.isEmpty() && stack.peek() == num){
				stack.pop();
				sb.append("-\n");
			} else{
				System.out.println("NO");
				return;
			}
		}

		System.out.println(sb);
	}
}