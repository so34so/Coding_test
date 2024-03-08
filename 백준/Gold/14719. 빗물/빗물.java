// 구현
// 양쪽 가장자리는 물을 채울수 없다.
// 왼쪽 최대벽 높이를 탐색하고 오른쪽 최대벽 높이를 탐색한다
// 현재 벽보다 높은 벽이 양쪽에 있을 경우 빗물을 구해서 answer에 더해준다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {


    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[M];
        int answer = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<M;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=1;i<M-1;i++){
            int wall = arr[i];
            int left = wall;
            int right = wall;
            for (int k = i - 1; k >= 0; k--) {
                if (arr[k] > wall) {
                    left = Math.max(left, arr[k]);
                }
            }
            for (int k = i + 1; k < M; k++) {
                if (arr[k] > wall) {
                    right = Math.max(right, arr[k]);
                }
            }
            if (Math.min(left, right) > wall) {
                answer += (Math.min(left, right) - arr[i]);
            }
        }
        System.out.println(answer);

    }

}