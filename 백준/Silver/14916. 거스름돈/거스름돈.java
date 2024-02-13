// 그리디
// 5로 나눈다. 만약 큰수로 나눴을 때 안떨어지면 다음 조건으로 넘어가고 나눠지면 해당 몫을 카운트에 더해주고 카운트를 출력한다.
// 만약 나눠지지 않으면 다음 거스름돈인 2를 뺀고 카운트는 1 증가해준다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        while(true){
            if(N%5 == 0){
                cnt += N/5;
                System.out.println(cnt);
                break;
            }else{
                N -= 2;
                cnt++;
            }
            if(N<0){
                System.out.println(-1);
                break;
            }
        }
    }
}