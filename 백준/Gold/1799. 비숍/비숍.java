import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N, map[][];
	static boolean check[][], color[][];
	static int[] dx = {-1,-1};
	static int[] dy = {1,-1};
	static int[] res = new int[2];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		color = new boolean[N][N];
		check = new boolean[N][N];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				color[i][j] = (i%2==0 && j%2==0) || (i%2!=0 && j%2!=0);
			}
		}
		set(-1,true,0);
		set(-1,false,0);
		
		System.out.println(res[0] + res[1]);
	}
	private static void set(int index, boolean black, int cnt) {
		for(int i=index+1;i<N*N;i++) {
			int x = i/N;
			int y = i%N;
			
			if(color[x][y] != black || map[x][y] == 0 || !check(x,y)) continue;
			
			check[x][y] = true;
			set(i,black,cnt+1);
			check[x][y] = false;
		}
		res[black ? 1 : 0] = Math.max(res[black ? 1 : 0], cnt);
	}
	private static boolean check(int x, int y) {
		for(int i=0;i<2;i++) {
			int nx = x;
			int ny = y;
			while(true) {
				if(nx>=0 && ny>=0 && nx<N && ny<N) {
					if(check[nx][ny])
						return false;
					nx += dx[i];
					ny += dy[i];
				}else {
					break;
				}
			}
		}
		return true;
	}
}