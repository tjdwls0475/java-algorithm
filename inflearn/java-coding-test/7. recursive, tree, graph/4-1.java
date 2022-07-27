class Solution {
  	static long[] fibo; // Memorization Method
	
    public long DFS(int n) {
    	if (fibo[n] > 0) return fibo[n]; // When int array is initialized, the default value is zero. By doing this, we avoid repetitive calculation.
    	
    	if (n == 1) return fibo[n] = 1;
    	else if (n == 2) return fibo[n] = 1;
    	else return fibo[n] = DFS(n-1) + DFS(n-2);
    }
    

    public static void main(String[] args) {
    	
    	Solution T = new Solution();
    	int n = 60;
    	fibo = new long[n+1];
    	T.DFS(n);
    	
    	for (int i=1; i<=n; i++) System.out.print(fibo[i] + " ");
    }
}

// For loop vs Recursive in Fibonachi
// For loop uses just one frame, while Recursive uses at least more than one frame. So For loop is generally more efficient.
