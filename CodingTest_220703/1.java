public class Solution {
	
	public int solution(int[] grade) {
		int answer = 0;
		int idx = 0;
		int lt = 0;
		
    // Repeat until minimum index reaches the last one.
		while (true) {
      
      //Find the minimum index.
			for (int i=idx+1; i<grade.length; i++) {
				if (grade[idx] >= grade[i]) {
					idx = i;
				}
			}
      
      //Sum all the decreased values.
			for (int i=lt; i<idx; i++) {
				answer += (grade[i] - grade[idx]);
			}
			
			if (idx == grade.length-1) break;
			else {
				idx++;
				lt = idx;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		//int[] grade = {5,4,3,5,4,6}; // {3,3,3,4,4,6}
		int[] grade = {5,4,3,2,1,2,3,2};
		
		Solution T = new Solution();
		System.out.println(T.solution(grade));
	}

}
