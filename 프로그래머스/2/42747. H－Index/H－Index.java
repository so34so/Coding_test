// 구현
// 이상인 요소의 개수를 구해야해서 오름차순 정렬을 한다.
// 인용횟수 배열 요소 값을 차례로 h로 지정하며 조건 여부 파악
// 각 값보다 인용횟수가 크거나 같은 논문 편수를 h로잡고, 조건을 체크하면 조건에 부합하는 값중 최대값을 확인할수 있다.
// 처음에 값이 나오면 이후로는 무조건 h값이 작아지므로 break로 나온다.

import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        
        for(int i=0;i<citations.length;i++){
            int h = citations.length - i;
            
            if(citations[i] >= h){
                answer = h;
                break;
            }
        }
        return answer;
    }
}