// 그리디
// 배열을 오름차순으로 정렬한다
// 전체에서 도난당한 학생 수를 빼서 당하지 않은 학생 수를 answer에 더한다.
// lost배열과 reserve에 둘다 있는 학생은 본인 체육복은 있지만 빌려줄 수 없다.
// 체육복을 앞뒤 번호 학생에게만 빌려줄 수 있다.

import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        Arrays.sort(reserve);
        Arrays.sort(lost);
        
        answer = n-lost.length;
        
        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(lost[i] == reserve[j]){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        
        for(int i=0;i<lost.length;i++){
            for(int j=0;j<reserve.length;j++){
                if(lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]){
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}