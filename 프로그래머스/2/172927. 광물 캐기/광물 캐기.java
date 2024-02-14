import java.util.*;
class Solution {
    int answer = 100000000;
    int num = 0;
    int[] visited;
    public int solution(int[] picks, String[] minerals) {
        
        visited = new int[picks.length];
        
        for(int i=0;i<picks.length;i++){
            num += picks[i];
        }
        
        for(int i=0;i<picks.length;i++){
            
            if(picks[i] == visited[i]){
                continue;
            }
            
            visited[i]++;
            dfs(1, 0, i, 0, picks, minerals);
            visited[i]--;
        }
        
        
        return answer;
    }
    
    public void dfs(int cnt, int startMineral, int startPick, int sum,int[] picks, String[] minerals){
        if(answer <= sum || startMineral >= minerals.length){
            return ;
        }
        
        int piro = 0;
        
        for(int i=startMineral; i<startMineral + 5; i++){
            if(i >= minerals.length){
                break;
            }
            
            String mineral = minerals[i];
            
            if(startPick == 0){
                piro += 1;
            }else if(startPick == 1){
                if(mineral.equals("diamond")){
                    piro += 5;
                }else{
                    piro += 1;
                }
            }else if(startPick == 2){
                if(mineral.equals("diamond")){
                    piro += 25;
                }else if(mineral.equals("iron")){
                    piro += 5;
                }else{
                    piro += 1;
                }
            }
        }
        
        if(cnt >= num || startMineral + 5 >= minerals.length){
            answer = Math.min(answer, sum + piro);
            return;
        }
        
        for(int i=0;i<picks.length;i++){
            if(picks[i] == 0 || picks[i] == visited[i]){
                continue;
            }
            
            visited[i]++;
            dfs(cnt+1, startMineral + 5, i, sum + piro, picks, minerals);
            visited[i]--;
        }
        
    }
}