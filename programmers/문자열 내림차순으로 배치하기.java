import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int[] arr = new int[s.length()];

        for(int i=0; i<arr.length; i++) {
            arr[i] = (int)s.charAt(i);
        }
        Arrays.sort(arr);

        for(int i=arr.length-1; i>=0; i--) {
            answer += (char) arr[i];
        }

        return answer;
    }
}
