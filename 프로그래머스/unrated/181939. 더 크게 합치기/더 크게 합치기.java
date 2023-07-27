class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = Integer.toString(a) + Integer.toString(b);
        String str2 = Integer.toString(b) + Integer.toString(a);
        if(Integer.parseInt(str1) >=Integer.parseInt(str2)){
            answer = Integer.parseInt(str1);
        }else{
            answer = Integer.parseInt(str2);
        }
        return answer;
    }
}