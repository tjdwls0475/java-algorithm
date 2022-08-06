import java.util.Arrays;
import java.util.HashSet;

// I solved this by using HashMap, but using 'check array' is much faster.
class Solution {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        HashSet<Integer> HS = new HashSet<>();

        for(int x : reserve) HS.add(x);

        Arrays.sort(lost);

        //Remove people who got both lost and reserve.
        for(int i=0; i<lost.length; i++) {
            if(HS.contains(lost[i])) {
                HS.remove(lost[i]);
                lost[i] = -1; // This line can't go forward.
                answer++;
            }
        }
      
        for(int j=0; j<lost.length; j++) {  // I removed element of ArrayList earlier, which caused 'for loop' to stop.
            if(HS.contains(lost[j] - 1)) {
                HS.remove(lost[j] - 1);
                answer++;
            }
            else if(HS.contains(lost[j] + 1)) {
                System.out.println(HS.toString());
                HS.remove(lost[j] + 1);
                answer++;
            }
        }

        return answer;
    }
}
