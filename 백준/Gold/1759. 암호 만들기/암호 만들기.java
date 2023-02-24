import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static int L,C,sec[];
	public static char word[];
	public static boolean check[];
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	L = Integer.parseInt(st.nextToken());
    	C = Integer.parseInt(st.nextToken());
    	word = new char[C];
    	check = new boolean[C];
    	st = new StringTokenizer(br.readLine());
    	for(int i=0;i<C;i++) {
    		word[i] = st.nextToken().charAt(0);
    	}
    	Arrays.sort(word);
    	dfs(0,0);
    	
    }
    
    public static void dfs(int start, int cnt) {
    	if(cnt==L) {
    		int v =0;
    		int cc = 0;
    		StringBuilder sb = new StringBuilder();
    		for(int i=0;i<C;i++) {
    			if(check[i]) {
    				sb.append(word[i]);
    				if(word[i]=='a' || word[i]=='e'|| word[i]=='i'|| word[i]=='o'|| word[i]=='u') {
    					v++;
    				}else {
    					cc++;
    				}
    			}
    		}
    		if(v>=1 && cc>=2) System.out.println(sb);
    	}
    	
    	
    	for(int i=start;i<C;i++) {
    			check[i] = true;
				dfs(i+1,cnt+1);
    			check[i] = false;
    	}
    }
}