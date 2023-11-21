import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> finish = new HashMap<>();
        
        
        for(String c : completion){
            if(!finish.containsKey(c)){
                finish.put(c,1);
            }else{
                finish.replace(c,finish.get(c)+1);
            }
        }
        
        for(String p : participant){
            if(finish.containsKey(p) && finish.get(p)!=0){
                finish.replace(p,finish.get(p)-1);
                continue;
            }else{
                answer = p;  
                break; 
            }
        }
        return answer;
    }
}