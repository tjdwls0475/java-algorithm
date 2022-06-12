import java.util.*;

public class test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] numbers = new int[n];
		
		for (int i=0; i<numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
		input.close();
		//System.out.println(Arrays.toString(numbers));
		Solution T = new Solution();
		System.out.println(T.solution(numbers));
	}
}

class Solution {
    public int[] solution(int[] p) {
        int[] answer = new int[p.length];
        int swap = 0;
        int min = 0;
        int pt = 0;
        
        for (int i=0; i<p.length; i++) {
        	min = p[i];
        	pt = 0;
        	for (int j=i+1; j<p.length; j++) {
        		
        		if (min > p[j]) {
        			min = p[j];
        			pt = j;
        		}
        	}

        	if (pt >= 1) {
        		swap = p[i];
        		p[i] = p[pt];
        		p[pt] = swap;
        		
        		answer[i]++;
        		answer[pt]++;
        	}
        }
       
        return answer;
    }
}
