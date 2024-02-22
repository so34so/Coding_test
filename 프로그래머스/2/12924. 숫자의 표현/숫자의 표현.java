// 구현
// 연속으로 더해서 n이 나와야하기 때문에 이중반복문을 사용했다.
// 연속으로 더하다 값이 n과 동일할 경우 answer에 1을 더해주고 break문으로 다음 숫자로 이동한다.
// 크기는 중간에 생략되는 숫자가 많다 생각해서 이중반복문도 괜찮다 생각했다.

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1;i<=n;i++){
            int sum = 0;
            for(int j=i;j<=n;j++){
                sum += j;
                
                if(sum==n){
                    answer++;
                    break;
                }else if(sum>n){
                    break;
                }
            }
        }
        return answer;
    }
}