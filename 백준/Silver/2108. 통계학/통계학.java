import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	static int n, arr[];
	static double sum;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		sum = 0;
		for(int i=0;i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum+=arr[i];
		}
		Arrays.sort(arr);
		asum(sum);
		middle();
		maxnum();
		maxsize();
		
	}
	private static void asum(double a) {
		System.out.println(Math.round(a/n));
	}
	private static void middle() {
		int mid = arr.length/2;
		System.out.println(arr[mid]);
	}
	private static void maxnum() {
		int[] plus = new int[8001];
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			plus[arr[i]+4000]++;
			max = Math.max(plus[arr[i]+4000], max);
		}
		ArrayList<Integer> max_idx = new ArrayList<>();
		for(int i=0;i<=8000;i++) {
			if(max==plus[i]) {
				max_idx.add(i-4000);
			}
		}
		System.out.println(max_idx.size()>1?max_idx.get(1):max_idx.get(0));
	}
	private static void maxsize() {
		int result = arr[arr.length-1]-arr[0];
		System.out.println(result);
	}
}