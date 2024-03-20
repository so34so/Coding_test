// 구현
// indexOf를 사용했다
// indexOf는 리스트의 앞쪽부터 인자와 동일한 객체가 있고 없으면 -1을 리턴합니다.
// 이것을 사용하여 -1이나오면 없는 값이므로 List에 더해줍니다.
// 전부 구했으면 마지막으로 sort문으로 오름차순을 하고 출력합니다.

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                int a = numbers[i]+numbers[j];
                if(list.indexOf(a) < 0){
                    list.add(a);
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}