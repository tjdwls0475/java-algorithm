// Selection Sort
class Solution {
	public static void main(String[] args) {
		int[] numbers = {1, 4, 5, 2, 6, -1};
		Solution T = new Solution();
		System.out.println(T.sortNumbers(numbers)[0]);
		System.out.println(T.sortNumbers(numbers)[1]);
		System.out.println(T.sortNumbers(numbers)[2]);
		System.out.println(T.sortNumbers(numbers)[3]);
		System.out.println(T.sortNumbers(numbers)[4]);
	}
	
	private int[] sortNumbers(int[] numbers) {
		for(int i=0; i<numbers.length-1; i++) {
			int idx = i;
			
			for(int j=i+1; j<numbers.length; j++) {
				if(numbers[idx] > numbers[j]) idx = j;
			}
			if(idx==i) continue;
			else {
				int tmp = numbers[i];
				numbers[i] = numbers[idx];
				numbers[idx] = tmp;
			}
		}
		return numbers;
	}
}
