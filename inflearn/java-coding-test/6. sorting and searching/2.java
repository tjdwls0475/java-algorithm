// Bubble Sort
class Solution {
	public static void main(String[] args) {
		int[] numbers = {1, 4, 5, 2, 6, -1};
		Solution T = new Solution();
		System.out.println(T.sortNumbers(numbers)[0]);
		System.out.println(T.sortNumbers(numbers)[1]);
		System.out.println(T.sortNumbers(numbers)[2]);
		System.out.println(T.sortNumbers(numbers)[3]);
		System.out.println(T.sortNumbers(numbers)[4]);
		System.out.println(T.sortNumbers(numbers)[5]);
		System.out.println(T.sortNumbers(numbers)[0]);
	}
	
	private int[] sortNumbers(int[] numbers) {
		for(int i=0; i<numbers.length-1; i++) {
			for(int j=0; j<numbers.length-i-1; j++) {
				if(numbers[j] > numbers[j+1]) {
					int tmp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = tmp;
				}
			}
		}

		
		return numbers;
	}
}
