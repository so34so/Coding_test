import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int N,M,result;
	static boolean check[];
	static ArrayList<Integer>[] list;
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	
    	check = new boolean[N];
    	list = new ArrayList[N];
    	for(int i=0;i<N;i++) {
    		list[i] = new ArrayList<Integer>();
    	}
    	for(int i=0;i<M;i++) {
    		st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
    	}
    	result = 0;
    	for(int i=0;i<N;i++) {
    		if(result == 0) {
    			dfs(i,1);
    		}
    	}
    	System.out.println(result);
    	
    }
    public static void dfs(int start,int cnt) {
    	if(cnt==5) {
    		result = 1;
    		return;
    	}
    	check[start] = true;
    	for(int i : list[start]) {
    		int next = i;
			if(!check[next]) {
				dfs(next,cnt+1);
    		}
    	}
    	check[start] = false;
    }
}