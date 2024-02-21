// 구현
// 범위를 잘 생각할것 long인지 int인지 아직 그냥 무지성으로 int를 박아버린다.
// 그냥 1부터 증가하면서 처음 받은 수에서 빼준다.
// 만약 이상이 될 경우 밖으로 나오고 그 숫자는 정답보다 하나 더 큰값이니 출력할 때는 --를 앞에 붙여줘서 출력을 한다.

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        int s = 1;

        while(true){
            if(n>=s) n-=s;
            else break;
            s++;
        }
        
        System.out.println(--s);
    }
}