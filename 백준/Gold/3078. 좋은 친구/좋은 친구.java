import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		Queue<Integer>[] queue = new Queue[21];
		for (int i = 0; i < 21; i++) {
			queue[i] = new LinkedList<>();
		}

		long count = 0;
		for (int i = 0; i < n; i++) {
			int length = br.readLine().trim().length();

			if(queue[length].isEmpty()){
				queue[length].offer(i);
			} else {
				while(!queue[length].isEmpty() && i - queue[length].peek() > k){ // 지금 들어온 사람과 좋은 친구가 아닌 경우
					queue[length].poll();
				}

				count += queue[length].size();
				queue[length].offer(i);
			}
		}

		System.out.println(count);
	}
}