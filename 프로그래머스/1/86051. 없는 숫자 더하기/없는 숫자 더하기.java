// 간단 반복문
// 모든 원수를 다 더하면 45가 나온다 거기서 numbers에 주어지는 모든 값을 더해서 빼주면 없는 숫자의 합만 결과로 나온다.

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 45;
        int num = 0;
        
        for(int i=0;i<numbers.length;i++){
            num += numbers[i];
        }
        
        answer = sum - num;
        
        return answer;
    }
}