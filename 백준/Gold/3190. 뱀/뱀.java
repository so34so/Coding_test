import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	
	static int N,K,L, map[][];
	static int[] dx = {0,1,0,-1};
	static int[] dy = {1,0,-1,0};
	static HashMap<Integer, String> hash = new HashMap<>();
	static List<int[]> snake = new ArrayList<>();
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		K = Integer.parseInt(br.readLine());
		map = new int[N][N];
		
		for(int i=0;i<K;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken())-1;
			int y = Integer.parseInt(st.nextToken())-1;
			map[x][y] = 1;
		}
		L = Integer.parseInt(br.readLine());
		for(int i=0;i<L;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			String b = st.nextToken();
			hash.put(a, b);
		}
		solve();
	}
	
	private static void solve() {
		int cx = 0, cy = 0;
		int count = 0;
		int d = 0;
		snake.add(new int[]{0,0});
		
		while(true) {
			count++;
			int nx = cx + dx[d];
			int ny = cy + dy[d];
			
			if(Finish(nx,ny)) {
				break;
			}
			if(map[nx][ny]==1) {
				map[nx][ny]=0;
				snake.add(new int[] {nx,ny});
			}else {
				snake.add(new int[] {nx,ny});
				snake.remove(0);
			}
			
			if(hash.containsKey(count)) {
				if(hash.get(count).equals("D")) {
					d+=1;
					if(d==4) {
						d=0;
					}
				}else {
					d-=1;
					if(d==-1) {
						d=3;
					}
				}
			}
			cx = nx;
			cy = ny;
		}
		System.out.println(count);
	}
	
	private static boolean Finish(int nx, int ny) {
		if(nx<0 || ny<0 || nx>=N || ny>=N) {
			return true;
		}
		for(int i=0;i<snake.size();i++) {
			int[] t = snake.get(i);
			if(nx == t[0] && ny == t[1]) {
				return true;
			}
		}
		return false;
	}
}