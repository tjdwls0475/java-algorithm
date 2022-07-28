class Solution {
    String answer;
    
    public String solution(int n) {
        answer = "";
        getNumber(n);
        
        return answer;
    }
    
    private void getNumber(int n) {
        if (n == 0) return;
        
        getNumber(n/4);
        answer += Integer.toString(n%4);
        
        return; 
    }
}
