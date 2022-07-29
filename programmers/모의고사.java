import java.util.ArrayList;

class Solution {
    int[] way1 = {1, 2, 3, 4, 5};
    int[] way2 = {2, 1, 2, 3, 2, 4, 2, 5};
    int[] way3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    int score[] = new int[3];
    
    public static void main(String[] args) {
    	Solution T = new Solution();
    	int[] k = {1,2,3,4,5,4};
    	T.solution(k);
    }
    
    public ArrayList<Integer> solution(int[] answers) {
        ArrayList<Integer> answer = new ArrayList<>();
        int max = -1;
        
        // Get the Score
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == getAnswerOf1(i)) score[0]++;							
            if(answers[i] == getAnswerOf2(i)) score[1]++;
            if(answers[i] == getAnswerOf3(i)) score[2]++;
        }
        
        // Find Max Score and the Person who got
        for(int x : score) {
        	if(x > max) max = x;
       	}
        
        for(int i=0; i<3; i++) {
        	if(score[i] - max == 0) answer.add(i+1);
        }
   
        return answer;
    }
    
    private int getAnswerOf1(int n) {return way1[n%5];}
    private int getAnswerOf2(int n) {return way2[n%8];}
    private int getAnswerOf3(int n) {return way3[n%10];}
}
