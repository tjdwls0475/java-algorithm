import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	public static void main(String[] args) {
		int[] arr = {120, 125, 152, 130, 135, 143, 127, 160};
		System.out.println(solution(arr));
	}
	
	private static ArrayList<Integer> solution(int[] arr) {
		int[] tmp = arr.clone();
		Arrays.sort(tmp);
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != tmp[i]) list.add(i+1);
		}
		
		return list;
	}
}
