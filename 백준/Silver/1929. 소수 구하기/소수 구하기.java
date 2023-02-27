import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static boolean[] check;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		check = new boolean[N+1];
		check[0] = check[1] = true;
		
		for(int i=2;i<Math.sqrt(N+1);i++) {
			for(int j=i*i;j<N+1;j+=i) {
				check[j] = true;
			}
		}

		for(int i=M;i<N+1;i++) {
			if(!check[i]) {
				System.out.println(i);
			}
		}
	}
}