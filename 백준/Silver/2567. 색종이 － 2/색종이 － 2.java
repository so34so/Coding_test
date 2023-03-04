import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[][] map = new int[100][100];
		int[] dx = {0,0,1,-1};
		int[] dy = {1,-1,0,0};
		int cnt = 0;
		for(int tc = 0; tc<T;tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			for(int i=a;i<a+10;i++) {
				for(int j=b;j<b+10;j++) {
					map[i][j] = 1;
				}
			}
		}
		for(int i=0;i<100;i++) {
			for(int j=0;j<100;j++) {
				if(map[i][j]==1) {
					for(int k=0;k<4;k++) {
						int nx = i+dx[k];
						int ny = j+dy[k];
						if(nx>=0 && ny>=0 && nx<100 && ny<100 && map[nx][ny]==0) {
							cnt++;
						}else if(nx<0 || ny<0 || nx>100 || ny>100) {
							cnt++;
						}
					}
				}
			}
		}
		System.out.println(cnt);
		
	}
}