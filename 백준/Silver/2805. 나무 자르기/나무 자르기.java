import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int k = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[k];
		int min = 0;
		int max = 0;
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<k;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		
		while(min<max) {
			int mid = (min+max)/2;
			long sum =0;
			for(int treeHeight : arr) {
				if(treeHeight-mid>0) {
					sum +=(treeHeight-mid);
				}
			}
			if(sum<n) {
				max = mid;
			}else {
				min = mid+1;
			}
		}
		
		System.out.println(min-1);
	}
}