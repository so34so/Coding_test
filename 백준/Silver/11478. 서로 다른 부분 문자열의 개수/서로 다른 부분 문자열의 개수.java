// 해쉬셋
// 문자열을 하나부터 전부까지 늘려가면서 자른다.
// 해당내용을 hashset에 넣어 중복이 되는 것을 삭제한다.
// set 사이즈를 출력한다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {


    public static void main(String[] args) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Set<String> set = new HashSet<>();

        for(int i=0;i<str.length();i++){
            for(int j= i +1; j<=str.length();j++){
                set.add(str.substring(i,j));
            }
        }
        System.out.println(set.size());
    }

}