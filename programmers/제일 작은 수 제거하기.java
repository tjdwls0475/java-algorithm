import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        int idx=0, min= Integer.MAX_VALUE;
        ArrayList<Integer> answer =  new ArrayList<>();

        if (arr.length == 1) {
            answer.add(-1);
            return answer;
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
                idx = i;
            }
        }

        for(int i=0; i<arr.length; i++) {
            if(i!=idx) answer.add(arr[i]);
        }

        return answer;
    }
}
