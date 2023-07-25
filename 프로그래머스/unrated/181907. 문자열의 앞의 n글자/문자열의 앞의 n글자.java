class Solution {
    public String solution(String str, int n) {
        String answer = "";
        for(int i=0;i<n;i++){
            answer += str.charAt(i);
        }
        return answer;
    }
}