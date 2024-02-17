// 투 포인터
// 문제가 간단해 보였는데 못 풀어서 검색해 봤다
// 배열을 입력받는다.
// start, end 투 포인터를 설정하여 탐색한다.
// 연속된 부분합 중 s 이상인 구간의 길이를 구한다.
// sum = s, 값이 작으므로 end 포인터 위치에 있는 배열값을 더해준다.
// sum >= s, 값이 크거나 같으므로 start 포인터 위치에 있은 배열값을 빼준다.
// 구한 부분합의 길이 중 가장 짧은 길이를 출력한다.
// 나중에 다시 풀어봐야겠다

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] arr = new int[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = 0;
        int len = Integer.MAX_VALUE;
        int sum = 0;
        while(start <= end && end <= n) {
            if(sum < s) {
                sum += arr[end++];
            } else if(sum >= s) {
                len = Math.min(len, end-start);
                sum -= arr[start++];
            }
        }
        System.out.println(len==Integer.MAX_VALUE ? 0 : len);
    }

}