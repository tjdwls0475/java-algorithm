import java.util.*;

public class openchatting {
	
	public ArrayList<Integer> solution(int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for (int i=0; i<arr.length; i++) {
			int idx = i;
			
			for (int j=i+1; j<arr.length; j++) {
				if (arr[j]<arr[idx]) {
					idx = j;
				}
			}
			int tmp;
			tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		
		System.out.println(Arrays.toString(arr));
		
		return answer;
	}

	public static void main(String[] args) {
		openchatting T = new openchatting();
		int[] c = {11, 2, 4, 5, 6, 7, 24, 3};
		T.solution(c);
	}

}
