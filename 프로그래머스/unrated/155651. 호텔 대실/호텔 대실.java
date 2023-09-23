import java.util.*;

class Solution {
    private static int maxTime = 1450;
    
    public int solution(String[][] book_time) {
        int answer = 0;
        
        int[] rooms = new int[maxTime];
        
        for(int i=0;i<book_time.length;i++){
            String startTime = book_time[i][0];
            String endTime = book_time[i][1];
            
            rooms[calTime(startTime)] += 1;
            rooms[calTime(endTime) + 10] += -1;
        }
        
        for(int i=1;i<maxTime;i++){
            rooms[i] += rooms[i-1];
            answer= Math.max(answer,rooms[i]);
        }
        
        return answer;
    }
    
    private int calTime(String time){
        String[] split = time.split(":");
        int hour = Integer.parseInt(split[0]);
        int min = Integer.parseInt(split[1]);
        
        return(hour*60 + min);
    }
    
}