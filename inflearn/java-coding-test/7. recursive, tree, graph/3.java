class Solution {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(factorial(n));
	}
	
	private static int factorial(int m) {
		if (m == 1) return 1;
		else {
			return m * factorial(m-1);
		}
	}
}
// General guidance for Recursive Algorithm. IF ~ ELSE ~
