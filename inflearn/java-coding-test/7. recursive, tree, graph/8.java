import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
	int[] dst = {-1, 1, 5};
	
	public static void main(String[] args) {
		Solution tree = new Solution();

		System.out.println(tree.BFS(5, 10000));
	}
	
	private int BFS(int h, int c) {
		Queue<Integer> Q = new LinkedList<>();
		HashSet<Integer> HS = new HashSet<>();
		Q.offer(h);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			
			for(int i=0; i<len; i++) {
				int cur = Q.poll();
				
				for(int j : dst) {
					if(cur+j == c) return L+1;
					if(!HS.contains(cur + j)) {
						Q.offer(cur + j);
						HS.add(cur + j);
					}
				}
			}
			L++;
		}
		return 0;
	}
}
