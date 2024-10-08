import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		Queue<Integer> left = new PriorityQueue<>(((o1, o2) -> Integer.compare(o2, o1)));
		Queue<Integer> right = new PriorityQueue<>();

		for(int i=0; i<n; i++){
			int num = Integer.parseInt(br.readLine());

			if(left.size() == right.size())
				left.offer(num);
			else
				right.offer(num);

			if(!left.isEmpty() && !right.isEmpty()){
				if(left.peek() > right.peek()){
					int temp = left.poll();
					left.offer(right.poll());
					right.offer(temp);
				}
			}

			sb.append(left.peek()).append("\n");
		}

		System.out.println(sb);
	}
}