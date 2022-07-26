import java.util.*;

class Solution {
    public int factorial(int n) {
        if (n == 1) return 1;
        
        return n * factorial(n-1);
    }
    

    public static void main(String[] args) {
    	
    	Solution T = new Solution();
    	System.out.println(T.factorial(5));
    }
}
