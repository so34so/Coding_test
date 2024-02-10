// 구현
// 세로의 개수와 가로의 개수를 구해주고 만약 세로의 개수가 많으면 다음으로 넘어간다.
// 가로 세로 모두 노란색을 감싸기 위해서는 상하좌우 각각 1개씩 뺀 값이 노란색과 같아야 한다.
// 같으면 해당 값을 배열에 저장하고 출력한다.

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int map = brown + yellow;
        
        for(int i=1;i<=map;i++){
            int row = i;
            int col = map / row;
            
            if(row > col) continue;
            
            if((row-2) * (col - 2) == yellow){
                answer [0] = col;
                answer [1] = row;
                return answer;
            }
        }
        return answer;
    }
}