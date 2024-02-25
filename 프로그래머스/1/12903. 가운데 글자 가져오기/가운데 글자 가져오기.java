// 구현
// 짝수일 때는 길이/2-1과 길이/2를 출력한다.
// 홀수일 때는 길이/2의 값만 출력한다.

class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 == 0){
            answer += s.charAt(s.length()/2-1);
            answer += s.charAt(s.length()/2);
        }else{
            answer += s.charAt(s.length()/2);
        }
        return answer;
    }
}