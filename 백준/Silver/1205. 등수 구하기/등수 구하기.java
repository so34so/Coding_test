// 구현
// N이 0일 때도 있으니 N이 0이상일 때만 입력한다.
// 오름차순 정렬한다.
// 랭킹리스트의 길이와 리스트의 길이가 같고 가장 작은 수가 태수보다 같거나 크면 안됨으로 -1을 출력하고 끝낸다.
// cnt에 1을 저장하고 뒤에서 부터 탐색하면서 태수보다 큰 점수를 만나면 +1을 해준다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {


    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int[] score = new int[P];
        if(N>0){
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<N;i++){
                score[i] = Integer.parseInt(st.nextToken());
            }
        }

        Arrays.sort(score);

        if(P==N && score[0]>=T){
            System.out.println(-1);
            return;
        }

        int cnt = 1;
        for(int i=P-1;i>=Math.max(0,P-N-1);i--){
            if(score[i]>T){
                cnt++;
            }else{
                break;
            }
        }
        System.out.println(cnt);
    }

}