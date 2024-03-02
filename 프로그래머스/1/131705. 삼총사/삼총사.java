// 구현
// 총 3개의 수를 더한 값이 0이 되어야해서 삼중 for문 사용
// i,j,k 세 수를 더한 갓ㅂ이 0이면 answer++ 진행

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for(int i = 0; i < number.length; i++) {
            for(int j = i + 1; j < number.length; j++) {
                for(int k = j + 1; k < number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}