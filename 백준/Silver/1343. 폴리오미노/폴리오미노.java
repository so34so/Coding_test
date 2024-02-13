// 그리디
// replaceAll을 사용해서 해당 문자열에서 먼저 긴 XXXX를 전부 AAAA로 변경을 해준다.
// 그 다음은 짦은 XX를 BB로 변경을 해준다.
// 이후 전부 변경이 되었을 때 문자열에 X가 포함이 되어있으면 실패한거니 str을 -1로 변경을 해 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        str = str.replaceAll("XXXX","AAAA");
        str = str.replaceAll("XX","BB");

        if(str.contains("X")){
            str = "-1";
        }
        System.out.println(str);

    }

}