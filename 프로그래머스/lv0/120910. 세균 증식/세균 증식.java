class Solution {
    public int solution(int n, int t) {
        int answer = n;
        int i=0;
        while(i<t){
            answer *=2;
            i++;
        }
        return answer;
    }
}