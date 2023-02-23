import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		list.add(-1);
		for(int i=1;i<=N;i++) {
			list.add(i-Integer.parseInt(st.nextToken()), i);
		}
		for(int i=1;i<=N;i++) {
			System.out.print(list.get(i)+" ");
		}
	}
}