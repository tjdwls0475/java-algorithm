import java.util.ArrayList;

class Solution {
    public long[] solution(long n) {
        long[] answer = {};
        ArrayList<Long> numbers = new ArrayList<>();
        
        while(n>=1) {
            numbers.add(n%10);
            n = n / 10;
        }
        
        answer = new long[numbers.size()];
        
        for(int i=0; i<numbers.size(); i++) answer[i] = numbers.get(i);
        
        return answer;
    }
}
