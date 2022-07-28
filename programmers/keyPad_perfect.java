class Solution {

    int[][] cos = {{3,1}, {0,0}, {0,1}, {0,2}, {1,0}, {1,1}, {1,2}, {2,0}, {2,1}, {2,2}};
    int[] left_co = {3,0};
    int[] right_co = {3,2};
    char hand;
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        if (hand.equals("left")) this.hand = 'L';
        if (hand.equals("right")) this.hand = 'R';
        
        for (int num : numbers) {
        	char umji = pushNumber(num);
        	
        	if (umji == 'L') left_co = cos[num];
        	if (umji == 'R') right_co = cos[num];
        	
        	answer += umji;
        }
        
        return answer;
    }
    
    private int getDistance(int[] c, int[] p) {
    	return Math.abs(c[0]-p[0]) + Math.abs(c[1]-p[1]);
    }
    
    private char pushNumber(int n) {
    	if (n == 1 || n == 4 || n == 7) return 'L';
    	if (n == 3 || n == 6 || n == 9) return 'R';
    	
    	if (getDistance(cos[n],left_co) > getDistance(cos[n],right_co)) return 'R';
    	if (getDistance(cos[n],left_co) < getDistance(cos[n],right_co)) return 'L';
    	
    	return this.hand;
    }
    
    public static void main(String[] args) {
    	int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
    	String hand = "right";
    	
    	Solution T = new Solution();
    	System.out.println(T.solution(numbers, hand));
    }
}
