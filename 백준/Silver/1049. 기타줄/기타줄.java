// 그리디
// 6개짜리 팩과 낱개를 각각 배열에 저장한다.
// 팩, 날개 배열을 정렬한다.(가장 적은 비용이 먼저 오도록)
// 비교한다
// 가장 싼 6개짜리 팩으로 모두 살것인가, 가장 싼 낱개로 모두 살 것인가,
// 가장싼 6개짜리 팩과 가장 싼 낱개를 이용해서 살 것인가
// 머리 안 돌아감

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
        int M = Integer.parseInt(st.nextToken());

        int[] a = new int[M];
        int[] b = new int[M];
        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            b[i] = Integer.parseInt(st.nextToken());
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        Arrays.sort(b);

        //가장 싼 6개짜리 팩 구매 vs 가장 싼 낱개 구매 vs (가장싼 6개짜리 팩 + 낱개)
        int min = Math.min(((N/6)+1)*b[0], N*a[0]);
        min = Math.min(min, ((N/6))*b[0] + (N%6)*a[0]);

        System.out.println(min);

    }

}