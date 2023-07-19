class Solution {
    public int solution(int[] list) {
        int answer = -1;
        for(int i=0;i<list.length;i++){
            if(list[i]<0){
                answer = i;
                return answer;
            }
        }
        return answer;
    }
}