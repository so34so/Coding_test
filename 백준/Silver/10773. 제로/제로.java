import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum =0;
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<N;i++) {
			int num = Integer.parseInt(br.readLine());
			if(num==0) {
				stack.pop();
			}else {
				stack.push(num);
			}
		}
		while(!stack.isEmpty()) {
			sum+=stack.pop();
		}
		System.out.println(sum);
	}
}