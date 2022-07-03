import java.util.*;

public class Solution {
	public static void main(String[] args) {
		int[] numbers = {1, 3, 5, 6, 2};
				
		Solution T = new Solution();
		System.out.println(Arrays.toString(T.solution(numbers)));
	}

    public int[] solution(int[] p) {
    	int[] answer = new int[p.length];

    	for (int i=0; i<p.length; i++) {
    		int idx = i;
    		int tmp = 0;
    		
    		for (int j=i+1; j<p.length; j++) {
    			if (p[idx] > p[j]) {
    				idx = j;
    			}
    		}
    		
    		if (idx != i) {
    			answer[idx]++;
    			answer[i]++;
    			
    			tmp = p[i];
    			p[i] = p[idx];
    			p[idx] = tmp;
    		}
    	}	
 
        return answer;
    }
}
