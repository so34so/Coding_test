import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

class Solution {
	class miro{
		int x;
		int y;
		public miro(int y, int x) {
			this.x = x;
			this.y = y;
		}
	}
	char[][] map;
	int[][] check;
	int x,y=0;
	int dx[] = {0,0,1,-1};
	int dy[] = {1,-1,0,0};
    public int solution(String[] maps) {
        int answer = 0;
        x = maps.length;
        y = maps[0].length();
        miro start= null;
        miro lever= null;
        miro exit= null;
        map = new char[x][y];
        check = new int[x][y];
        
        for(int i=0;i<x;i++) Arrays.fill(check[i], -1);
        
        for(int i=0;i<x;i++) {
        	for(int j=0;j<y;j++) {
        		map[i][j] = maps[i].charAt(j);
        		if(map[i][j]=='S') {
        			start = new miro(i,j);
        		}else if(map[i][j]=='L') {
        			lever = new miro(i,j);
        		}else if(map[i][j]=='E') {
        			exit = new miro(i,j);
        		}
        	}
        }
        
        bfs(start,lever);
        answer = check[lever.y][lever.x];
        if(answer == -1) return -1;
        
        check = new int[x][y];
        for(int i=0;i<x;i++) Arrays.fill(check[i], -1);
        bfs(lever,exit);
        
        if(check[exit.y][exit.x]==-1) return -1;
        answer += check[exit.y][exit.x];
        
        return answer;
    }
    
    public void bfs(miro start, miro end) {
    	Queue<miro> q = new ArrayDeque<>();
    	q.add(start);
    	check[start.y][start.x] = 0;
    	
    	if(start.x==end.x && start.y == end.y) {
    		return;
    	}
    	
    	while(!q.isEmpty()) {
    		miro cur = q.poll();
    		
    		for(int i=0;i<4;i++) {
    			int nx = cur.x + dx[i];
    			int ny = cur.y + dy[i];
    			
    			if(nx>=0 && ny>=0 && nx <y && ny<x && map[ny][nx]!='X' && check[ny][nx]==-1) {
    				q.add(new miro(ny,nx));
    				check[ny][nx] = check[cur.y][cur.x]+1;
    			}
    			
    			if(end.x == nx && end.y == ny) return;
    		}
    	}
    }
}