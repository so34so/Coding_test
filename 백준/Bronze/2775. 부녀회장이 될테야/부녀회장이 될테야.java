import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static boolean[] check;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] apt = new int[15][15];
		for(int i=0;i<15;i++) {
			apt[i][1] = 1;
			apt[0][i] = i;
		}
		for(int i=1;i<15;i++) {
			for(int j=2;j<15;j++) {
				apt[i][j] = apt[i][j-1] + apt[i-1][j];
			}
		}
		int T = Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			System.out.println(apt[a][b]);
		}
		
	}
}