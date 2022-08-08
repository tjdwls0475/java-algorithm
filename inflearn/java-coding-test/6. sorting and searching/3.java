// Insertion Sort(Correct)
class Solution {
	public static void main(String[] args) {
		int[] numbers = {1, 4, 5, 2, 6, -2};
		Solution T = new Solution();
		System.out.println(T.sortNumbers(numbers)[0]);
		System.out.println(T.sortNumbers(numbers)[1]);
		System.out.println(T.sortNumbers(numbers)[2]);
		System.out.println(T.sortNumbers(numbers)[3]);
		System.out.println(T.sortNumbers(numbers)[4]);
		System.out.println(T.sortNumbers(numbers)[5]);
	}
	
	private int[] sortNumbers(int[] numbers) {
		for(int i=1; i<numbers.length; i++) {
			int tmp = numbers[i];
			int j;
			for(j=i-1; j>=0; j--) {
				if(numbers[j] > tmp) {
					numbers[j+1] = numbers[j];
				}
				else {
					break;
				}
			}
			//System.out.println(j);  // When 'j' exits 'for loop', 'for loop' once again decreases 'j'.
			numbers[j+1] = tmp;
		}
		
		return numbers;
	}
}
