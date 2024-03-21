// 수학
// 검색을 해보니 유클리드 호제법과 분수 계산하는 방법으로 풀었다고 합니다.
// 분수를 덧셈한 최종 결과물에서 분자와 분모의 최대 공약수를 구한 뒤, 이 최대 공약수로 분자와 분모를 각각 나누어줍니다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {


    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int a2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        int a3 = (a1*b2) + (a2*b1);
        int b3 = b1 * b2;

        int result = math(a3,b3);
        System.out.println(a3/result+ " " +b3/result);
    }
    public static int math(int a, int b){
        if(a%b == 0){
            return b;
        }
        return math(b, a%b);
    }

}