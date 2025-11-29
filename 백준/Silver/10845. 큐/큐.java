import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		Queue<Integer> queue = new ArrayDeque<>();

		int firstNum = 0;
		for(int i=0; i<n; i++){
			st = new StringTokenizer(br.readLine());

			switch (st.nextToken()){
				case "push":
					firstNum = Integer.parseInt(st.nextToken());
					queue.offer(firstNum);
					break;
				case  "pop":
					if(!queue.isEmpty())
						sb.append(queue.poll()).append("\n");
					else
						sb.append(-1).append("\n");
					break;
				case "size":
					sb.append(queue.size()).append("\n");
					break;
				case "empty":
					if(queue.isEmpty())
						sb.append(1).append("\n");
					else
						sb.append(0).append("\n");
					break;
				case "front":
					if(!queue.isEmpty())
						sb.append(queue.peek()).append("\n");
					else
						sb.append(-1).append("\n");
					break;
				case "back":
					if(!queue.isEmpty())
						sb.append(firstNum).append("\n");
					else
						sb.append(-1).append("\n");
					break;
			}
		}

		System.out.println(sb);
	}
}