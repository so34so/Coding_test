import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] map = new int[1001][1001];
		
		for(int i=1;i<=N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			
			for(int j=y;j<y+h;j++) {
				for(int k=x;k<x+w;k++) {
					map[j][k] = i;
				}
			}
		}
		
		for(int i=1; i<=N;i++) {
			int count=0;
			for(int j=0;j<1001;j++) {
				for(int k=0; k<1001;k++) {
					if(map[j][k] == i)count++;
				}
			}
			System.out.println(count);
		}
		
	}
}