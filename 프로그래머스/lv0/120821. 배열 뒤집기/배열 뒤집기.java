class Solution {
    public int[] solution(int[] list) {
        int[] answer = new int[list.length];
        int k=0;
        for(int i=list.length;i>0;i--){
            answer[k++] = list[i-1];
        }
        return answer;
    }
}