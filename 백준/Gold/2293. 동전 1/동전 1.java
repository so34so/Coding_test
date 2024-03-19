// dp
// i를 금액으로 정하고 j 는 i원을 만드는데 가능한 경우의 수다.
// 동전의 가지 수를 늘려가면서 배열에 저장을 하면 된다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {


    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n+1];
        int[] dp = new int[k+1];
        dp[0] = 1;

        for(int i = 1; i<=n;i++){
            arr[i] = Integer.parseInt(br.readLine());
            for(int j=arr[i];j<=k;j++){
                dp[j] += dp[j - arr[i]];
            }
        }

        System.out.println(dp[k]);
    }

}