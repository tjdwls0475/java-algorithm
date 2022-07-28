class Solution {
    String answer;
    String[] memory;
    
    public String solution(int n) {
        memory = new String[n+1];
        
        return getNumber(n);
    }
    
    private String getNumber(int n) {
        if (!(memory[n] == null)) return memory[n];
        
        if (n == 1) return memory[n] = "1";
        if (n == 2) return memory[n] = "2"; 
        if (n == 3) return memory[n] = "4";
        
        int cnt = 1;
        int n2 = n;
        
        while(true) {
            int t = makeSquareOfThree(cnt);
            if (n2- t > 0) {
            	n2 -= t;
            	cnt++;
            }
            else break;
        }
        
        if (((n2-1) / Math.pow(3,cnt-1)) >= 0 && ((n2-1) / Math.pow(3,cnt-1)) < 1) {
        	int r1 = n - makeSquareOfThree(cnt-1);
        	return memory[n] = "1" + getNumber(r1);
        }
        else if (((n2-1) / Math.pow(3,cnt-1)) >= 1 && ((n2-1) / Math.pow(3,cnt-1)) < 2) {
        	int r2 = n - makeSquareOfThree(cnt-1) * 2;
        	return memory[n] = "2" + getNumber(r2);
        }
        else if (((n2-1) / Math.pow(3,cnt-1)) >= 2 && ((n2-1) / Math.pow(3,cnt-1)) < 3) {
        	int r3 = n - makeSquareOfThree(cnt-1) * 3;
        	return memory[n] = "4" + getNumber(r3);
        }
        
        return "";
    }
    
    private int makeSquareOfThree(int p) {
    	int q = 1;
    	for (int i=0; i<p; i++) {
    		q = q*3;
    	}
    	return q;
    }
    
    public static void main(String[] args) {
    	Solution T = new Solution();
    	int n = 400000000;
    	System.out.println(T.solution(n));
    }
}
