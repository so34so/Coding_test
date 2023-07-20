
class Solution {
    public String solution(String str) {
        String answer = "";
        for(int i=str.length()-1;i>=0;i--){
            answer += str.substring(i,i+1);
        }
        
        return answer;
    }
}