import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
 
class Solution
{
	static int[] ticket = new int[4];// 0:1일, 1: 1달, 2:3달, 3:1년
	static int[] plan = new int[12];//12개월 이용 계획을 담을 배열
    static int result;
	public static void main(String args[]) throws Exception
    {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = null;
    	StringBuilder sb = new StringBuilder();
    	
    	int T = Integer.parseInt(br.readLine());
    	for(int t=1; t<=T; t++) {
    		st = new StringTokenizer(br.readLine());
    		for(int i=0;i<4;i++) {
    			ticket[i] = Integer.parseInt(st.nextToken());
    		}
    		st = new StringTokenizer(br.readLine());
    		for(int i=0;i<12;i++) {
    			plan[i] = Integer.parseInt(st.nextToken());
    		}
    		
    		//1년 이용하기 위한 최소비용
    		result = Integer.MAX_VALUE;
    		//최소 비용을 찾기위한 재귀 호출
    		
    		swimmingPool(0,0);
    		sb.append("#").append(t).append(" ").append(result).append("\n");
    		
    	}
    	System.out.println(sb);
    }
    //누적 비용 전달
    static void swimmingPool(int month, int paied) {
    	if(month>=12) {
    		if(result>paied) {
    			result = paied;
    		}
    		return;
    	}
    	//1일 이용권 쓸때
    	swimmingPool(month+1,paied+(ticket[0]*plan[month]));
    	//1달 이용권 쓸때
    	swimmingPool(month+1,paied+ticket[1]);
    	//3달 이용권 쓸때
    	swimmingPool(month+3,paied+ticket[2]);
    	//1년 이용권 쓸때
    	swimmingPool(month+12,paied+ticket[3]);
    }
}