import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		Deque<Integer> deque = new ArrayDeque<>();

		for(int i=1; i<=n; i++){
			deque.offer(i);
		}

		sb.append("<");
		while(deque.size() > 1){
			for(int i=0; i<k-1; i++){
				deque.offer(deque.poll());
			}
			sb.append(deque.poll()).append(", ");
		}

		sb.append(deque.poll()).append(">");

		System.out.println(sb);
	}
}