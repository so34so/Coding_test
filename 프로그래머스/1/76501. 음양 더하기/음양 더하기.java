// 구현
// 그냥 signs에 맡쳐 true이면 더해주고 아니면 빼줬다.

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0;i<absolutes.length;i++){
            if(signs[i]){
                answer+=absolutes[i];
            }else{
                answer-=absolutes[i];
            }
        }
        return answer;
    }
}