// LRU(Least Recently Used) Algorithm
class Solution {
	public static void main(String[] args) {
		int size = 5;
		int[] input = {1,2,3,2,6,2,3,5,7};	  //7 5 3 2 6
		System.out.println(processCache(size, input)[0]);
		System.out.println(processCache(size, input)[1]);
		System.out.println(processCache(size, input)[2]);
		System.out.println(processCache(size, input)[3]);
		System.out.println(processCache(size, input)[4]);
	}
	
	private static int[] processCache(int size, int[] input) {
		int[] output = new int[size];
		
		// Let's put input numbers into the cache one by one.
		for(int i=0; i<input.length; i++) {
			int idx = -1;
			
			// Searching the cache array to check if it has input number.
			for(int j=0; j<size; j++) {
				if(input[i] == output[j]) {
					idx = j;
					break;
				}
			}
			
			// When the cache misses, input comes first. And rest of them move backward.
			if(idx == -1) {
				for(int j=size-2; j>=0; j--) {
					output[j+1] = output[j];
				}
				output[0] = input[i];
			}
			
			// When the cache hits, get that value forward. And rest of them move backward.
			else {
				int tmp = output[idx];
				for(int j=idx-1; j>=0; j--) {
					output[j+1] = output[j];
				}
				output[0] = tmp;
			}
		}
		
		return output;
	}
}
