class Solution {
    public long DFS(int n) {
    	if (n == 1) return 1;
    	else if (n == 2) return 1;
    	else return DFS(n-1) + DFS(n-2);
    }
    

    public static void main(String[] args) {
    	
    	Solution T = new Solution();
    	
    	for (int i=1; i<11; i++) {
    		System.out.print(T.DFS(i) + " ");
    	}
    }
}
