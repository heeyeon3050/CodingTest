import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      StringTokenizer st;
		  StringBuilder sb = new StringBuilder();
	      int N = Integer.parseInt(br.readLine());
	      int num[][] = new int[N][2];
	      
	      for(int i=0; i<N; i++) {
	    	  st = new StringTokenizer(br.readLine());
	    	  num[i][0] = Integer.parseInt(st.nextToken());
	    	  num[i][1] = Integer.parseInt(st.nextToken());
	      }
	      
	      Arrays.sort(num, new Comparator<int[]>(){
	    	  @Override
	    	  public int compare(int[] o1, int[] o2) {
	    		  if(o1[1]==o2[1])
	    			  return o1[0] - o2[0];
	    		  return Integer.compare(o1[1], o2[1]);
	    	  }
	      });
	      
	      for(int i=0; i<N; i++) {
	    	  sb.append(num[i][0]).append(" ").append(num[i][1]).append("\n");
	      }
	      
	      System.out.println(sb);
	}
}