import java.util.*;

class Solution {
    public void DFS(int n) {
        if (n == 0) return;
        
        DFS(n-1);
        System.out.print(n);
        return;
    }
    

    public static void main(String[] args) {
    	
    	Solution T = new Solution();
    	T.DFS(5);
    }
}
