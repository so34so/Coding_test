class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 1;
        int b = 6;
        while(true){
            if(b%n==0){
                answer = a;
                break;
            }
            a++;
            b+=6;
        }
        return answer;
    }
}