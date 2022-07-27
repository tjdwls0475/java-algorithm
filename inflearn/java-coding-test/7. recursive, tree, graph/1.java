import java.util.*;

class Solution {
    public void recursive(int n) {
        if (n == 0) return;
        
        recursive(n-1);
        System.out.print(n);
        return;
    }
    

    public static void main(String[] args) {
    	
    	Solution T = new Solution();
    	T.recursive(5);
    }
}
