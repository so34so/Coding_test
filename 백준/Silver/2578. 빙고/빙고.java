import java.util.Scanner;

public class Main {
	static int[][] map;
	static int count;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		map = new int[5][5];
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		for(int a=1;a<=25;a++) {
			int num = sc.nextInt();
			for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if(map[i][j]==num)map[i][j] = 0;
				}
			}
			
			rcheck();
			ccheck();
			leftcheck();
			rightcheck();
			
			if(count>=3) {
				System.out.println(a);
				break;
			}
			count = 0;
		}
		
	}
	public static void rcheck() {
		for(int i=0;i<5;i++) {
			int zero = 0;
			for(int j=0;j<5;j++) {
				if(map[i][j]==0)zero++;
			}
			if(zero==5)count++;
		}
	}
	public static void ccheck() {
		for(int i=0;i<5;i++) {
			int zero = 0;
			for(int j=0;j<5;j++) {
				if(map[j][i]==0)zero++;
			}
			if(zero==5)count++;
		}
	}
	public static void leftcheck() {
		int zero = 0;
		for(int i=0;i<5;i++) {
				if(map[i][i]==0)zero++;
		}
		if(zero==5)count++;
	}
	public static void rightcheck() {
		int zero = 0;
		for(int i=0;i<5;i++) {
				if(map[i][4-i]==0)zero++;
		}
		if(zero==5)count++;
	}
}