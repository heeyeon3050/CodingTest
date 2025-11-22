import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		String str = br.readLine();
		Stack<Character> lStack = new Stack<>();
		Stack<Character> rStack = new Stack<>();

		int length = str.length();
		for(int i=0; i<length; i++){
			lStack.push(str.charAt(i));
		}

		int m = Integer.parseInt(br.readLine());

		for(int i=0; i<m; i++){
			str = br.readLine();
			char []arr = str.toCharArray();
			switch (arr[0]){
				case 'L':
					if(!lStack.isEmpty())
						rStack.push(lStack.pop());
					break;
				case 'D':
					if(!rStack.isEmpty())
						lStack.push((rStack.pop()));
					break;
				case 'B':
					if(!lStack.empty())
						lStack.pop();
					break;
				case 'P':
					lStack.push(Character.valueOf(arr[2]));
					break;
			}
		}

		for (Character c : lStack) {
			sb.append(c);
		}

		while(!rStack.empty()){
			sb.append(rStack.pop());
		}

		System.out.println(sb);
	}
}