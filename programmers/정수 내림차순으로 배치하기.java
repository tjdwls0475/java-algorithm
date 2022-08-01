import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        ArrayList<Long> list = new ArrayList<>();
        
        while(n>=1) {
            list.add(n%10);
            n = n/10;
        }
      
        Collections.sort(list);
        
        for(int i=0; i<list.size(); i++) {
            answer += list.get(i) * Math.pow(10,i);
        }
        
        return answer;
    }
}
