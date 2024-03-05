// 완전탐색
// 모든 알파벳을 리스트에 넣고 탐색을 시켰다

import java.util.*;

class Solution {
    static String[] arr;
    static List<String> list;
    public int solution(String word) {
        int answer = 0;
        
        list = new ArrayList<>();
        arr = new String[]{"A","E","I","O","U"};
        solve(word,"",0);
        
        for(int i=0;i<list.size();i++){
            if(list.get(i).equals(word)){
                answer = i;
                break;
            }
        }
        return answer;
    }
    
    static public void solve(String word, String str, int depth){
        list.add(str);
        
        if(depth == 5){
            return;
        }
        
        for(int i=0;i<arr.length;i++){
            solve(word,str + arr[i], depth + 1);
        }
    }
}