import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> Q = new PriorityQueue<>();
        
        for(int x : scoville) Q.offer(x);
        
        while(Q.size() > 0) {
            int cur1 = Q.poll();
            
            if(cur1 >= K) return answer;
            else {
                if(Q.size() < 1) return -1;
                int cur2 = Q.poll();
                Q.offer(cur1 + cur2*2);
                answer++;
            }
        }
        return -2;
    }
}
