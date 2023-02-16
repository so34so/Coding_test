import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int [][] A= new int[N][M];
		for(int i = 0; i<N;i++) {
			st =new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int min = Integer.MAX_VALUE;
		int[][]rcs = new int[K][3];
		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			rcs[i][0] = Integer.parseInt(st.nextToken());
			rcs[i][1] = Integer.parseInt(st.nextToken());
			rcs[i][2] = Integer.parseInt(st.nextToken());
		}
		
		int []np = new int[K];
		for (int i = 0; i < K; i++) {
			np[i] = i;
		}
		int [][]arr = new int[N][M];
		for(int i = 0;i<N;i++) {
			for(int j = 0; j<M;j++) {
				arr[i][j] = A[i][j];
			}
		}
		while(true) {
			for (int n : np) {
				int r = rcs[n][0]-1,c=rcs[n][1]-1,s = rcs[n][2];
				while(s>0) {
					int a = A[r-s][c-s];
					for(int i = r-s; i+1<=r+s;i++) {
						A[i][c-s] = A[i+1][c-s];
					}
					for(int i = c-s;i+1<=c+s;i++) {
						A[r+s][i] = A[r+s][i+1];
					}
					for(int i = r+s;i-1>=r-s;i--) {
						A[i][c+s] = A[i-1][c+s];
					}
					for(int i = c+s; i-1>=c-s;i--) {
						A[r-s][i] = A[r-s][i-1];
					}
					A[r-s][c-s+1] = a;
					if(--s==0)break;
				}
			}
			for(int i = 0; i<N;i++) {
				int t = 0; 
				for (int j = 0; j < M; j++) {
					t+=A[i][j];
				}
				min = t<min?t:min;
			}
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					A[i][j] = arr[i][j];
				}
			}
			int f = K-2;
			for (; f>=0  ; f--) {
				if(np[f]<np[f+1])break;
			}
			if(f==-1)break;
			int l = K-1;
			for(;l>f;l--) {
				if(np[f]<np[l])break;
			}
			int t = np[f];
			np[f]= np[l];
			np[l] = t;
			++f;
			for(int i = K-1;i>f;i--,f++) {
				t = np[i];
				np[i]= np[f];
				np[f] = t;
			}
		}
		System.out.println(min);
	}
}