import java.util.*;

class Solution {	
	public static void main(String[] args) {
		int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
		Solution T = new Solution();
		System.out.println(T.solution(maps));
	}
	
    public int solution(int[][] maps) {
        int answer = 0;
        
        answer = BFS(maps);
        
        return answer;
    }

    private int BFS(int[][] maps) {
        Queue<int[]> Q = new LinkedList<>();
        int L = 0;
        int[] p = {0,0};
        Q.offer(p);
        while(!Q.isEmpty()) {
            int len = Q.size();
            for(int i=0; i<len; i++) {
                int[] cur = Q.poll();
                
                System.out.print(L + " : ");
                System.out.print(cur[0] + " ");
                System.out.print(cur[1]);
                System.out.println();
                
                cur[0] = cur[0] + 1;
                if(cur[0] == 4 && cur[1] == 4) return L+1;
                if(cur[0]>=0 && cur[0]<5 && cur[1]>=0 && cur[1] < 5) {
                	if(maps[cur[0]][cur[1]]!=0) {
                		Q.offer(cur); // We pulled correct one, but because Q has its address, the value has been changed. We must use another instance.
                		System.out.print("PULL1"); 
                	}
                }
                
                System.out.print(L + " : ");
                System.out.print(cur[0] + " ");
                System.out.print(cur[1]);
                System.out.println();
                
                cur[0] = cur[0] - 2; // plus
                if(cur[0] == 4 && cur[1] == 4) return L+1;
                if(cur[0]>=0 && cur[0]<5 && cur[1]>=0 && cur[1] < 5) {
                	if(maps[cur[0]][cur[1]]!=0) {
                		Q.offer(cur);
                		System.out.print("PULL2");
                	}
                }
                System.out.print(L + " : ");
                System.out.print(cur[0] + " ");
                System.out.print(cur[1]);
                System.out.println();
                
                cur[0] = cur[0] + 1; // plus
                cur[1] = cur[1] + 1;
                if(cur[0] == 4 && cur[1] == 4) return L+1;
                if(cur[0]>=0 && cur[0]<5 && cur[1]>=0 && cur[1] < 5) {
                	if(maps[cur[0]][cur[1]]!=0) {
                		Q.offer(cur);
                		System.out.print("PULL3");
                	}
                }
                System.out.print(L + " : ");
                System.out.print(cur[0] + " ");
                System.out.print(cur[1]);
                System.out.println();
                
                cur[1] = cur[1] - 2; // plus
                if(cur[0] == 4 && cur[1] == 4) return L+1;
                if(cur[0]>=0 && cur[0]<5 && cur[1]>=0 && cur[1] < 5) {
                	if(maps[cur[0]][cur[1]]!=0) {
                		Q.offer(cur);
                		System.out.print("PULL4");
                	}
                }
                System.out.print(L + " : ");
                System.out.print(cur[0] + " ");
                System.out.print(cur[1]);
                System.out.println();
                
            }
            L++;
        }   
        return 555;
    }
}
