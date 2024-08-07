import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());

		int[] arr = new int[n+1];

		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int min = Integer.MAX_VALUE;
		int start = 0;
		int end = 0;
		int total = 0;

		while(start <= n && end <= n){
			if(total >= s && min > end - start)
				min = end - start;
			if(total < s)
				total += arr[end++];
			else
				total -= arr[start++];
		}

		if(min == Integer.MAX_VALUE)
			System.out.println(0);
		else
			System.out.println(min);
	}
}