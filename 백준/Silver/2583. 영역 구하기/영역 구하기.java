import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static int M,N,K,map[][],count;
	public static StringBuilder sb;
	public static int[] dx = {0,0,1,-1};
	public static int[] dy = {1,-1,0,0};
	public static List<Integer> list;
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	M = Integer.parseInt(st.nextToken());
    	N = Integer.parseInt(st.nextToken());
    	K = Integer.parseInt(st.nextToken());
    	
    	map = new int[M][N];
    	for(int i=0;i<K;i++) {
    		sb = new StringBuilder();
    		st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		int c = Integer.parseInt(st.nextToken());
    		int d = Integer.parseInt(st.nextToken());
    		for(int j=b;j<d;j++) {
    			for(int k=a;k<c;k++) {
    				map[j][k] = 1;
    			}
    		}
    	}
    	
    	list = new ArrayList<Integer>();
    	for(int i=0;i<M;i++) {
    		for(int j=0;j<N;j++) {
    			if(map[i][j]==0) {
    				count=0;
    				dfs(i,j);
    				list.add(count);
    			}
    		}
    	}
    	
    	System.out.println(list.size());
    	Collections.sort(list);
    	for (int a : list) {
			System.out.print(a +" ");
		}
    	
    }
    public static void dfs(int x,int y) {
    	map[x][y] = 1;
    	count++;
    	for(int i=0;i<4;i++) {
    		int nx = x+dx[i];
    		int ny = y+dy[i];
    		
    		if(nx>=0 && ny>=0 && nx<M&&ny<N) {
    			if(map[nx][ny]==0) {
    				dfs(nx,ny);
    			}
    		}
    		
    		
    	}
    }
}