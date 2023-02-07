import java.util.Scanner;

public class Main {
	static int K, res;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		K = sc.nextInt();

		int maxW = -1; //큰 밭의 가로길이
		int maxH = -1; //큰 밭의 세로길이
		int indexW = -1; // 큰 밭의 가로 인덱스
		int indexH = -1; // 큰 밭의 세로 인덱스
		int smallH = 0; //작은 밭의 세로 길이
		int smallW = 0; //작은 밭의 가로 길이
		///---------입력 시작
		int[][] garden = new int[6][2];
		for (int i = 0; i < 6; i++) {
			garden[i][0] = sc.nextInt();//i번째 0번 인덱스 : 방향
			garden[i][1] = sc.nextInt(); // 길이

			// 동쪽 or 서쪽 ==> 가로변의 길이.
			//큰 밭의 가로변 길이 찾기
			if (garden[i][0] == 1 || garden[i][0] == 2) { 
				if (garden[i][1] > maxW) {
					maxW = garden[i][1];
					indexW = i;
				}
			}

			// 북쪽 or 남쪽 ==> 세로변의 길이.
			//큰 밭의 세로변 길이 찾기
			if (garden[i][0] == 3 || garden[i][0] == 4) {
				if (garden[i][1] > maxH) {
					maxH = garden[i][1];
					indexH = i;
				}
			}
		}
		// 큰 밭 크기 구하기
		int big = maxW * maxH;
		
		// @TODO : 작은 밭의 크기를 구해보자
		
		for(int i = 0; i<6; i++) {
			//작은 밭의 가로변 찾기
			//가로(동/서쪽) 변을 만나면? 양옆의 세로면 길이 살피기
			// 양옆의 세로길이의 합 = 큰밭의 세로길이 --> 성립하면 현재 i가 작은 밭의 가로변 길이
			if((garden[i][0]==1||garden[i][0]==2) && garden[indexH][1]== garden[(i+5)%6][1]+garden[(i+1)%6][1]) {
				smallW = garden[i][1];
			}else if((garden[i][0]==3||garden[i][0]==4) && garden[indexW][1]== garden[(i+5)%6][1]+garden[(i+1)%6][1]) {
				smallH = garden[i][1];
			}
			
		}
		

		//작은 밭 크기 구하기
		int small = smallH * smallW;

		res = (big - small) * K;
		System.out.println(res);

	}
}