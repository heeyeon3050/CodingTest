import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int[] t = new int[n+1];
		int[] p = new int[n+1];

		for(int i=1; i<=n; i++){
			st = new StringTokenizer(br.readLine());
			t[i] = Integer.parseInt(st.nextToken());
			p[i] = Integer.parseInt(st.nextToken());
		}

		int[] dp = new int[n+2];
		for(int i=1; i<=n; i++){
			if (i+t[i] <= n+1) // 일 했을 경우
				dp[i+t[i]] = Math.max(dp[i+t[i]], dp[i]+p[i]);
			//오늘 일한 값을 다음 날로 누적 (일 안했을 경우)
			dp[i+1] = Math.max(dp[i+1], dp[i]);
		}

		System.out.println(dp[n+1]);
	}
}