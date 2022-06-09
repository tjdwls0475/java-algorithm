package programmers;

import java.util.*;

public class prime_number {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		input.close();
		
		Solution T = new Solution();
		T.solution(number);
	}
}
	
class Solution {
	public void solution(int n) {
		int[] answer = new int[n+1];
		ArrayList prime_num_list = new ArrayList<Integer>();
		
		for (int i=2; i<=n; i++) {
			if (answer[i] == 0) {
				prime_num_list.add(i);
				
				for (int j=2*i; j<=n; j+=i) {
					answer[j] = 1;
				}
			}
			if (!(answer[i] == 0)) {
				continue;
			}
		}
		
		System.out.println(prime_num_list);
	}
}
