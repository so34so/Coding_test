class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        int x = number%n;
        int y = number%m;
        if(x==0 && y ==0){
            answer = 1;
        }
        return answer;
    }
}