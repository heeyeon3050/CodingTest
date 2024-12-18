import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int MOD = 1000000000;

		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[][] dp = new int[n+1][k+1];

		for(int i=1; i<=k; i++){
			dp[0][i] = 1;
		}

		for(int i=1; i<=n; i++){
			for(int j=1; j<=k; j++){
				dp[i][j] = (dp[i-1][j] + dp[i][j-1]) % MOD;
			}
		}

		System.out.println(dp[n][k]);
	}
}