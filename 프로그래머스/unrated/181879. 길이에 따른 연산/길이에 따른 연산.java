class Solution {
    public int solution(int[] list) {
        int answer = 0;
        if(list.length>=11){
            for(int i=0;i<list.length;i++){
                answer += list[i];
            }
        }else{
            answer = 1;
            for(int i=0;i<list.length;i++){
                answer *= list[i];
            }
        }
        return answer;
    }
}