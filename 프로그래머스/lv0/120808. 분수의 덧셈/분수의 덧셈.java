class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num = numer1*denom2 + numer2*denom1;
        int denom = denom1*denom2;
        
        int max = 1;
        for(int i=1;i<=num && i<=denom; i++){
            if(denom%i == 0 && num %i ==0){
                max = i;
            }
        }
        num = num/max;
        denom = denom/max;
        int[] answer = {num,denom};
        
        return answer;
    }
}