class Solution {
    public int solution(int[] list, int n) {
        int answer = 0;
        for(int i=0;i<list.length;i++){
            if(list[i]==n){
                answer = 1;
                return answer;
            }
        }
        return answer;
    }
}