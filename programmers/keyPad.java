import java.util.*;

class Solution {
    HashMap<Integer, int[]> HM = new HashMap<>();
    
    public String solution(int[] numbers, String hand) {
        char[] answer2 = new char[numbers.length];

        // Make hashmap ready
        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[][] coordinate = {{3,1}, {0,0}, {0,1}, {0,2}, {1,0}, {1,1}, {1,2}, {2,0}, {2,1}, {2,2}};
        
        for (int i=0; i<10; i++) {
        	HM.put(digits[i], coordinate[i]);
        }
        
        int[] l = {3,0};
        int[] r = {3,2};
        
        // Start
        for (int i=0; i<numbers.length; i++) {
        	if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
        		answer2[i] = 'L';
        		
        		for (int j=0; j<2; j++) {
        			l[j] = HM.get(numbers[i])[j]; 
        		}

        		continue;
        	}
        	
        	else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
        		answer2[i] = 'R';
        		for (int j=0; j<2; j++) {
        			r[j] = HM.get(numbers[i])[j];
        		}

        		continue;
        	}
          
        	else if (distance(numbers[i],l,r)>0) {
        		answer2[i] = 'R';
        		for (int j=0; j<2; j++) {
        			r[j] = HM.get(numbers[i])[j]; 
        		}
        	}
        	else if (distance(numbers[i],l,r)<0) {
        		answer2[i] = 'L';
        		for (int j=0; j<2; j++) {
        			l[j] = HM.get(numbers[i])[j]; 
        		}
        		
        	}
        	else {
        		if (hand.equals("left")) {
        			answer2[i] = 'L';
        			for (int j=0; j<2; j++) {
            			l[j] = HM.get(numbers[i])[j]; 
            		}
            		
        		}
        		else {
        			answer2[i] = 'R';
        			for (int j=0; j<2; j++) {
            			r[j] = HM.get(numbers[i])[j]; 
            		}
        		}
        	}
        }
        System.out.println(answer2);
        String answer = new String(answer2);
        
        return answer;
    }
    
    public int distance(int n, int[] l, int[] r) {
    	
		System.out.print(l[0]);
		System.out.print(l[1]);
		System.out.print(r[0]);
		System.out.print(r[1]);
    	System.out.print("------");
		int sum = 0, sum1 = 0, sum2 = 0;
    	for (int i=0; i<2; i++) {
    		if(HM.containsKey(n)) {
    			sum1 += Math.abs( l[i] - HM.get(n)[i] );
    			sum2 += Math.abs( r[i] - HM.get(n)[i] );
    		}

    	}
    	sum = sum1 - sum2;
      
    	return sum;
    }
    
    public static void main(String[] args) {
    	int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
    	String hand = "right"; //LRLLRRLLLRR
    	
    	Solution T = new Solution();
    	T.solution(numbers, hand);
    }
}
