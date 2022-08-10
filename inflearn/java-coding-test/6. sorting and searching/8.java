import java.util.Arrays;

// Binary Search. Sorting must be done before doing this.
class Solution {
	public static void main(String[] args) {
		int[] arr = {23,87,65,12,57,32,99,81};
		int n = 12;
		Solution T = new Solution();
		
		System.out.println(T.solution(arr, n));
	}
	
	private int solution(int[] arr, int n) {
		Arrays.sort(arr);
		int lt = 0;
		int rt = arr.length - 1;
		int mid;
		
		while(lt <= rt) {
			mid = (lt + rt) / 2;
			if(arr[mid] == n) return mid+1;
			else if(arr[mid] > n) rt = mid-1;
			else lt = mid+1;
		}
		return -1;
	}
}
