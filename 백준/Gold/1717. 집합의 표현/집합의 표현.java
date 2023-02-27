import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int N,M;
	static int[] parents;

	public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	N = Integer.parseInt(st.nextToken());
    	M = Integer.parseInt(st.nextToken());
    	parents = new int[N+1];
    	make();
    	
    	for(int i=0;i<M;i++) {
    		st = new StringTokenizer(br.readLine());
    		int num = Integer.parseInt(st.nextToken());
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		
    		int f1 = find(a);
    		int f2 = find(b);
    		
    		if(num==0 && f1 != f2)union(f1,f2);
    		else if(num==1 && f1 != f2)System.out.println("NO"); 
    		else if(num==1 && f1 == f2)System.out.println("YES"); 
    	}
    }
	
	static void make() {
		for (int i = 0; i <= N; i++) {
			parents[i] = i;
		}
	}
	static int find(int a) {
		if(parents[a]==a) return a;
		return parents[a] = find(parents[a]);
	}
	
	static void union(int a, int b) {
		parents[a] = b;
	}
}