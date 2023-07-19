class Solution {
    public int[] solution(int[] list) {
        int[] answer = new int[list.length+1];
        for(int i=0;i<list.length;i++){
            answer[i] = list[i];
        }
        if(list[list.length-1] > list[list.length-2]){
            answer[answer.length-1] = list[list.length-1] - list[list.length-2];
        }else {
            answer[answer.length-1] = list[list.length-1]*2;
        }
        return answer;
    }
}