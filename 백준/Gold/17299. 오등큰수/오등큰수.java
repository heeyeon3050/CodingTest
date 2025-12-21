import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		int f[] = new int[1000001];
		int ngf[] = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			f[arr[i]]++;
		}

		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && f[arr[i]] > f[arr[stack.peek()]]) {
				ngf[stack.pop()] = arr[i];
			}
			stack.push(i);
		}

		while (!stack.isEmpty())
			ngf[stack.pop()] = -1;

		for (int i = 0; i < n; i++) {
			sb.append(ngf[i] + " ");
		}

		System.out.println(sb);
	}
}