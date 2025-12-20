import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		int length = str.length();
		int size = 0;
		int n = 0;
		for(int i=0; i<length; i++){
			if(str.charAt(i) == '('){
				if(i<length-1 && str.charAt(i+1) == ')'){
					n += size;
					i++;
				} else{
					size++;
				}
			} else{
				n++;
				size--;
			}
		}

		System.out.println(n);
	}
}