// 구현
// 문자열을 다 하나씩 나눠서 배열에 넣는다.
// sort지만 내림차순으로 정렬해야함으로 Collections를 사용한다.

import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str,Collections.reverseOrder());
        
        for(String a : str){
            answer += a;
        }
        return answer;
    }
}