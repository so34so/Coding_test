import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
 
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] map = new int[19][19];
		int[] dx = {0,1,1,-1};
		int[] dy = {1,0,1,1};
		for(int i=0;i<19;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<19;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		for(int j=0;j<19;j++) {
			for(int i=0;i<19;i++) {
				if(map[i][j] == 1 || map[i][j]==2) {
					for(int k=0;k<4;k++) {
						int nx = i;
						int ny = j;
						int cnt = 1;
						while(true) {
							nx +=dx[k];
							ny +=dy[k];
							if(nx>=0 && ny>=0 && nx<19 && ny<19) {
								if(map[i][j]==map[nx][ny])cnt++;
								else break;
							}else break;
						}
						nx = i;
						ny = j;
						while(true) {
							nx -=dx[k];
							ny -=dy[k];
							if(nx>=0 && ny>=0 && nx<19 && ny<19) {
								if(map[i][j]==map[nx][ny])cnt++;
								else break;
							}else break;
						}
						
						if(cnt==5) {
							System.out.println(map[i][j]);
							System.out.println((i+1) + " " + (j +1));
							return;
						}
					}
				}
			}
		}
		System.out.println(0);
	}
}