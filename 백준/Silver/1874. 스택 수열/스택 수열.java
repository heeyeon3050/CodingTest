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
		int[] arr = new int[n];

		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		int j=0;

		for(int i=1; i<=n; i++){
			stack.push(i);
			sb.append("+").append("\n");

			while(!stack.isEmpty() && stack.peek() == arr[j]){
				stack.pop();
				j++;
				sb.append("-").append("\n");
			}
		}

		if(j == n)
			System.out.println(sb);
		else
			System.out.println("NO");
	}
}