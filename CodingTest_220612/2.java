public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
    public int[] solution(int[] periods, int[][] payments, int[] estimates) {
        int[] answer = new int[2];
        int[] present_cnt = new int[periods.length];
        int[] future_cnt = new int[periods.length];
        int sum = 0;

        for (int i=0; i<periods.length; i++) {

            if (periods[i] < 23) {
                continue;
            }
            
            else if (periods[i] == 23) {
                for (int j=1; j<12; j++) {
                    sum += payments[i][j];
                }
                sum += estimates[i];
                if (sum >= 900000) {
                    future_cnt[i]++;
                }
                sum = 0;
            }

            else if (periods[i] > 23 && periods[i] < 59) {

                for (int j=0; j<12; j++) {
                    sum += payments[i][j];
                }
                if (sum >= 900000) {
                    present_cnt[i]++;
                }
                sum = 0;

                for (int j=1; j<12; j++) {
                    sum += payments[i][j];
                }
                sum += estimates[i];
                if (sum >= 900000) {
                    future_cnt[i]++;
                }
                sum = 0;
            }

            else if (periods[i] == 59) {
                for (int j=0; j<12; j++) {
                    sum += payments[i][j];
                }
                if (sum >= 900000) {
                    present_cnt[i]++;
                }
                sum = 0;

                for (int j=1; j<12; j++) {
                    sum += payments[i][j];
                }
                sum += estimates[i];
                if (sum >= 600000) {
                    future_cnt[i]++;
                }
                sum = 0;
            }

            else {

                for (int j=0; j<12; j++) {
                    sum += payments[i][j];
                }
                if (sum >= 600000) {
                    present_cnt[i]++;
                }
                sum = 0;

                for (int j=1; j<12; j++) {
                    sum += payments[i][j];
                }
                sum += estimates[i];
                if (sum >= 600000) {
                    future_cnt[i]++;
                }
                sum = 0;
            }

        }

        for (int k=0; k < periods.length; k++) {
            if (present_cnt[k] == future_cnt[k]) {
                continue;
            }
            else if (present_cnt[k] < future_cnt[k]) {
                answer[0]++;
            }
            else {
                answer[1]++;
            }
        }

        return answer;
    }
}
