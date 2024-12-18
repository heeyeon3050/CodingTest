import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int[][] dc = new int[n][2];

		for(int i=0; i<n; i++){
			st = new StringTokenizer(br.readLine());
			dc[i][0] = Integer.parseInt(st.nextToken());
			dc[i][1] = Integer.parseInt(st.nextToken());
		}
		
		int cnt = 0;
		for(int i=0; i<n; i++){
			boolean flag = true;
			for(int j=0; j<n; j++){
				if(i == j)
					continue;

				if(dc[i][0] > dc[j][0]) {
					if (dc[i][1] >= dc[j][1]) {
						flag = false;
						break;
					}
				}

				if(dc[i][1] > dc[j][1]){
					if(dc[i][0] >= dc[j][0]){
						flag = false;
						break;
					}
				}
			}
			if (flag)
				cnt++;
		}

		System.out.println(cnt);
	}
}