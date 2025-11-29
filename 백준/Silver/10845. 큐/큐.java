import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		Deque<Integer> deque = new ArrayDeque<>();

		for(int i=0; i<n; i++){
			st = new StringTokenizer(br.readLine());

			switch (st.nextToken()){
				case "push":
					deque.offer(Integer.parseInt(st.nextToken()));
					break;
				case  "pop":
					if(!deque.isEmpty())
						sb.append(deque.poll()).append("\n");
					else
						sb.append(-1).append("\n");
					break;
				case "size":
					sb.append(deque.size()).append("\n");
					break;
				case "empty":
					if(deque.isEmpty())
						sb.append(1).append("\n");
					else
						sb.append(0).append("\n");
					break;
				case "front":
					if(!deque.isEmpty())
						sb.append(deque.peek()).append("\n");
					else
						sb.append(-1).append("\n");
					break;
				case "back":
					if(!deque.isEmpty())
						sb.append(deque.peekLast()).append("\n");
					else
						sb.append(-1).append("\n");
					break;
			}
		}

		System.out.println(sb);
	}
}