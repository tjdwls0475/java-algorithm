// Using HashMap is definitely more efficient than sorting to check if duplexity. But we just used to introduce a method.
import java.util.Arrays;

class Solution {
	public static void main(String[] args) {
		int[] arr = {20,25,52,30,39,33,43,33};
		Solution T = new Solution();
		System.out.println(T.solution(arr));
	}
	
	private char solution(int[] arr) {
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]==arr[i+1]) return 'D';
		}
		return 'U';
	}
}
