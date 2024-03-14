// dp
// 2차원 배열을 생성한다. 배열의 가로는 오르막 수 열은 오르막 수의 마지막 수의 값이다.
// 길이가 1일때 모두 오르막 수 이므로 1이 기록된다.
// 길이가 i인 오르막 수의 끝자리가 j일때의 수는 길이가 i-1인 0-j까지의 오르막 수의 합과 같다.
// 출력은 100007로 나눠서 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {


    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int dp[][] = new int[n+1][10];
        for(int i=0;i<10;i++){
            dp[1][i] = 1;
        }
        for(int i=2;i<=n;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<=j;k++){
                    dp[i][j] += dp[i-1][k];
                    dp[i][j] %= 10007;
                }
            }
        }
        int sum = 0;
        for(int i=0;i<10;i++){
            sum += dp[n][i];
        }
        System.out.println(sum % 10007);
    }

}