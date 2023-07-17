class Solution {
    public int[] solution(int[] list) {
        int[] answer = new int[2];
        
        for(int i=0;i<list.length;i++){
            answer[list[i] % 2]++;
        }

        return answer;
    }
}