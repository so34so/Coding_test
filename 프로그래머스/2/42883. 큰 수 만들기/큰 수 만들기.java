// 그리디
// 어렵다
// 먼저 return해야 할 문자의 길이는 매개변수로 들어온 number의 길이에서 k만큼을 빼준 길이가 된다.
// 반복문을 통해 문자의 길이만큼 반복하고 이후 가장 큰 수를 탐색해서 sb에 넣어준다.
// 두번째 부터 for문의 범위는 문자의 시작부터, 앞으로 이어붙혀야할 문자의 길이-1이 뒤에 남는 index까지 탐색을 한다.
// 그리고 index에는 가장 큰 수 다음 index를 넣어준다.

import java.util.*;

class Solution {
    public String solution(String number, int k) {
       StringBuilder sb = new StringBuilder();
        int index = 0;
        int max = 0;
        for(int i=0; i<number.length() - k; i++) {
            max = 0;
            for(int j = index; j<= k+i; j++) {
                if(max < number.charAt(j)-'0') {
                    max = number.charAt(j)-'0';
                    index = j+1;
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}