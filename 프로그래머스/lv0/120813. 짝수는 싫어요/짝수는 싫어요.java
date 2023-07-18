class Solution {
    public int[] solution(int n) {
        
            
        int x = 0;
        if(n%2==0){
            x = n/2;
        }else{
            x= n/2+1;
        }
        int k=0;
        int[] answer = new int[x];
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                answer[k++] = i;
            }
        }    
        return answer;
    }
}