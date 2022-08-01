import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Queue<Integer> Q = new LinkedList<>();
        
        for(int i=0; i < arr.length-1; i++) {
            if(arr[i] == arr[i+1]) continue;
            else Q.offer(arr[i]);
        }
        Q.offer(arr[arr.length-1]);
        
        int len = Q.size();
        answer = new int[len];
    
        for(int j=0; j<len; j++) {
            answer[j] = Q.poll();
        }
        
        return answer;
    }
}
