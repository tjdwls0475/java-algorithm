import java.util.Arrays;

public class Solution {
	
	public int[][] solution(int n, boolean horizontal) {
		int[][] answer = new int[n][n];
		int cnt = 0;
		int x = 0, y = 0;
		
		for (int i=1; i<=n; i++) {
			
			while (cnt<i*i) {
				cnt++;
				answer[x][y] = cnt;
				
				if (cnt==i*i) break;
				
				if (i%2 == 1) {
					if (x > y) y++;
					else x--;
				}
				else {
					if (x < y) x++;
					else y--;
				}
			}
			
			if (cnt == i*i) {
				if (i%2 == 1) y++;
				else x++;
			}
			
		}
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<n; j++) {
				System.out.print(answer[i][j] + " ");
			}
			System.out.println();
		}
		return answer;
	}

	public static void main(String[] args) {
		int n = 5;
		boolean horizontal = true;
		
		Solution T = new Solution();
		T.solution(n, horizontal);
	}

}
