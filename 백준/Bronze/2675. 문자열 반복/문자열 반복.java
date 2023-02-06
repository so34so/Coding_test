import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int N = Integer.parseInt(st.nextToken());
			char[] ctr = st.nextToken().toCharArray();
			for(int j=0;j<ctr.length;j++) {
				for(int k=0;k<N;k++) {
					System.out.print(ctr[j]);
				}
			}
			System.out.println();
		}
	}
}