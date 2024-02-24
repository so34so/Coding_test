// 그리디
// 정렬을 통해 가장 몸무게가 가장 많이 나가는 사람과 가장 몸무게가 적게 나가는 사람들끼리 보트에 태운다.
// 올림정렬을 미리 하고 제일 끝에 있는 인원과 제일 앞에 있는 인원의 값을 더해서 리미트 이하일 경우 index값을 더해준다.

import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int index=0;
        
        for(int i=people.length-1;i>=index;i--){
            if(people[i] + people[index] <= limit){
                index++;
                answer++;
            }else{
                answer++;
            }
        }
        
        return answer;
    }
}