// dp
// dp 와 비용 배열을 만든다.
// dp1은 cost1의 값으로 둔다 이전에 더한 값이 없기 때문에
// 두번째 숫자부터 시작해서 우선 자신의 값을 dp 에 저장한다.
// 첫번째부터 i이전까지 비교하며 기준 값 이 더 큰 경우 증가 수열이므로 dp 갱신한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N+1];
        int[] cost = new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1;i<=N;i++){
            cost[i] = Integer.parseInt(st.nextToken());
        }

        dp[1] = cost[1];

        for(int i=2;i<=N;i++){
            dp[i] = cost[i];
            for(int j=1;j<i;j++){
                if(cost[i]>cost[j]){
                    dp[i] = Math.max(dp[j]+cost[i],dp[i]);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=1;i<=N;i++){
            if(dp[i]>max){
                max = dp[i];
            }
        }
        System.out.println(max);
    }

}