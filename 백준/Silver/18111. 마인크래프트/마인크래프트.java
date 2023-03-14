import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int map[][] = new int[N][M];
		int min = 256;
		int max = 0;
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j]>max) max = map[i][j];
				if(map[i][j]<min) min = map[i][j];
			}
		}
		
		int time = Integer.MAX_VALUE;
		int high = 0;
		
		for(int i=min;i<=max;i++) {
			int count = 0;
			int block = B;
			for(int j=0;j<N;j++) {
				for(int k=0;k<M;k++) {
					if(i<map[j][k]) {
						count += ((map[j][k]-i) * 2);
						block += (map[j][k]-i);
					}else {
						count += (i-map[j][k]);
						block -= (i-map[j][k]);
					}
				}
			}
			if(block<0) break;
			if(time >= count) {
				time = count;
				high = i;
			}
		}
		System.out.println(time + " " + high);
	}
}