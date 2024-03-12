// 구현
// int num으로 되어있는 코드로 실행을 하면 오류가 발생한다.
// 그래서 long num으로 변경을 하니까 실행이 된다.
// 풀이는 조건에 맞춰서 그대로 진행했다.

class Solution {
    public int solution(long num) {
        int answer = 0;
        
        while(num != 1){
            if(num %2 ==0){
                num /= 2;
            }else{
                num = num * 3 + 1;
            }
            answer ++;
            if(answer >= 500){
                answer = -1;
                break;
            }
        }
        
        return answer;
    }
}