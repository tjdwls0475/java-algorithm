class Solution {
	 
    public long solution(int w, int h) {
        long answer = 0;
        long w2 = Long.parseLong(String.valueOf(w));  // If we multiply large two int data type values each other, we need to enlarge it.
        long h2 = Long.parseLong(String.valueOf(h));
        int GCF = getGCF(h,w);
        
        answer = h2*w2 - h2 - w2 + GCF;
        
        return answer;
    }
    
    private int getGCF(int a, int b) {
        int num = 1;
        
        for (int i=2; i <= Integer.min(a,b); i++) {
            if (a%i == 0 && b%i == 0) num = i;
        }
        
        return num;
    }
    

}
