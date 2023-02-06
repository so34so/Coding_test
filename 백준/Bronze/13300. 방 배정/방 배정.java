import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int student = Integer.parseInt(st.nextToken());
		int full = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[7][2];
		for(int i=0;i<student;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int s = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[y][s]++;
		}
		
		int room = 0;
		for(int i=1; i<7;i++) {
			for(int j=0;j<2;j++) {
				if(arr[i][j] >= full) {
					room = room +(arr[i][j]/full);
					if(arr[i][j] % full >=1) {
						room++;
					}
					continue;
				}
				if(arr[i][j] == 0) {
					continue;
				}else {
					room++;
				}
			}
		}
		System.out.println(room);
	}
}