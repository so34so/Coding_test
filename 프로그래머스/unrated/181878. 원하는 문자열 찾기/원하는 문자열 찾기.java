class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String a = myString.toUpperCase();
        String b = pat.toUpperCase();
        if(a.contains(b)){
            answer = 1;
        }
        return answer;
    }
}