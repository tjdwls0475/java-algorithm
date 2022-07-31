import java.util.*;

class Point{
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Solution {	
    public int solution(int[][] maps) {
        int answer = 0;
        
        answer = BFS(maps);
        
        return answer;
    }

    private int BFS(int[][] maps) {
        Queue<Point> Q = new LinkedList<>();
        int[][] dis = new int[maps.length][maps[0].length];
        int L = 0;
        Point p = new Point(0,0);
        Q.offer(p);
        dis[p.x][p.y] = 1; 
        
        while(!Q.isEmpty()) {
            int len = Q.size();
            for(int i=0; i<len; i++) {
                Point cur = Q.poll();
                if(cur.x == maps.length - 1 && cur.y == maps[0].length - 1) return L+1;
                
                if(cur.x + 1 < maps.length) {
                	if(maps[cur.x + 1][cur.y] == 1 && dis[cur.x + 1][cur.y] == 0) {
                		Point cur1 = new Point(cur.x + 1, cur.y);
                		Q.offer(cur1);
                		dis[cur1.x][cur1.y] = 1;
                	} 
                }
                
                if(cur.x - 1 >= 0) {
                	if(maps[cur.x - 1][cur.y] == 1 && dis[cur.x - 1][cur.y] == 0) {
                		Point cur2 = new Point(cur.x - 1, cur.y);
                		Q.offer(cur2);
                		dis[cur2.x][cur2.y] = 1;
                	} 
                }
                
                if(cur.y + 1 < maps[0].length ) {
                	if(maps[cur.x][cur.y + 1] == 1 && dis[cur.x][cur.y + 1] == 0) {
                		Point cur3 = new Point(cur.x, cur.y + 1);
                		Q.offer(cur3);
                		dis[cur3.x][cur3.y] = 1;
                	} 
                }
                
                if(cur.y - 1 >= 0) {
                	if(maps[cur.x][cur.y - 1] == 1 && dis[cur.x][cur.y - 1] == 0) {
                		Point cur4 = new Point(cur.x, cur.y - 1);
                		Q.offer(cur4);
                		dis[cur4.x][cur4.y] = 1;
                	}
                }
            }
            L++;
        }   
        return -1;
    }
}
