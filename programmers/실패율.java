import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] numOfPeople = new int[N+2];
        int sum = 0, cnt = 0;
        HashMap<Integer, Double> HM = new HashMap<>();

        for(int i=0; i<stages.length; i++) {
            for(int j=1; j<=N+1; j++){
                if(stages[i] == j) {
                    numOfPeople[j]++;
                    break;
                }
            }
        }

        for(int x : numOfPeople) sum += x;

        for(int k=1; k<=N; k++) {
            HM.put(k, (double)numOfPeople[k]/sum);
            sum -= numOfPeople[k];
        }

        for(int i=0; i<N; i++) answer[i] = i+1;    

        do {
            for(int j=0; j<N-1; j++) {
                int tmp = 0;
                if(HM.get(answer[j]) < HM.get(answer[j+1])) {
                    tmp = answer[j];
                    answer[j] = answer[j+1];
                    answer[j+1] = tmp;
                }
            }
            cnt++;
        } while(cnt < N);

        return answer;
    }
}
