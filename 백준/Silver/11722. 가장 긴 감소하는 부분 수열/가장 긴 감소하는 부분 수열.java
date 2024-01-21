import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int A = Integer.parseInt(br.readLine());
		int arr[] = new int[A+1];
		int dp[] = new int[A+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=A; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		
		int max = -1;
		for(int i=1; i<=A; i++) {
			dp[i] = 1;
			for(int j=1; j<i; j++) {
				if(arr[i]<arr[j] && dp[i]<=dp[j])
					dp[i] = dp[j]+1;
			}
			max = Math.max(max, dp[i]);
		}
		
		System.out.println(max);
	}
}