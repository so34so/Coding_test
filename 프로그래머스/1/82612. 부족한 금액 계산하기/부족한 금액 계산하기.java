// 단순 구현
// 3인 놀이기구를 4번 타는 동안 3의 배수만큼 금액을 더한다.
// 그래서 price의 배수를 지속적으로 더해줬고 다 더한 금액을 money와 빼주었을 때 이상이면 해당 값을 return 해준다.
class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        
        for(int i=1;i<=count;i++){
            sum += price * i;
        }
        if(sum > money){
            answer = sum - money;
        }

        return answer;
    }
}