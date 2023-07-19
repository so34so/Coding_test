class Solution {
    public int solution(int[] list) {
        int answer = 0;
        
        int sum = 0;
        int x = 1;
        
        for(int i=0;i<list.length;i++){
            sum += list[i];
            x *= list[i];
        }
        
        if(x<(sum*sum)){
            answer = 1;
        }
        
        return answer;
    }
}