class Solution {
	static int n;
	static int[] check;
	
    public static void main(String[] args) {
    	n = 3;
    	check = new int[n+1];
    	Solution T = new Solution();
    	T.DFS(1);
    }
    
    private void DFS(int L) {
    	if(L>n) {
    		String tmp = "";
    		for (int i=1; i<=n; i++) {
    			if(check[i]!=0) tmp += (i + " ");
    		}
    		if(!tmp.isEmpty()) System.out.println(tmp);	// We don't want Empty set get printed.
    	}
    	else {
    		check[L] = 1;
    		DFS(L+1);
    		check[L] = 0;
    		DFS(L+1);
    	}
    }
}
