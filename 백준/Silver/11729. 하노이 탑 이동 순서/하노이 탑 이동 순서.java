import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static StringBuilder sb = new StringBuilder();
	                       // 원반수        시작기둥         임시기둥       끝기둥
	public static void hanoi(int cnt, int from, int temp, int to) {
		if(cnt==0)return;
		
		//시작기둥에서 맨 아래 원반만 빼고, 나머지는 가운데 기둥으로 이동
		hanoi(cnt-1,from,to,temp);
		sb.append(from + " "+to+"\n");
		
		//임시기둥에 옮겨진 모든 원반들을 마지막기둥으로 이동
		hanoi(cnt-1, temp,from,to);
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int cnt=sc.nextInt();
		sb.append((int)(Math.pow(2, cnt)-1)).append("\n");
		hanoi(cnt, 1,2,3);
		System.out.println(sb.toString());
	}
}