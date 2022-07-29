import java.util.*;

class Solution {
	
	static HashSet<Integer> HS = new HashSet<>();
	static int cnt = 0;
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		Solution T = new Solution(); // 1 2 4 6 7	7 9 10 12 13 17
		
		T.solution(arr);
	}
	
    public int solution(int[] nums) {
        
        //Get prime number list.
        getPrimeNumber();
        
        //Sum
        for(int i=0; i<nums.length-2; i++) {
        	for(int j=i+1; j<nums.length-1; j++) {
        		for(int k=j+1; k<nums.length; k++) {
        			if(HS.contains(nums[i]+nums[j]+nums[k])) {
        				cnt++;
        				//HS.remove(nums[i]+nums[j]+nums[k]);
        				System.out.println(nums[i]+nums[j]+nums[k]);
        			}
        		}
        	}
        }
        
        
        System.out.println(cnt); 

        return cnt;
    }
    
    private void getPrimeNumber() {
    	int[] a = new int[3000];
    	for(int i=2; i<3000; i++) {
    		if(a[i]==0) {
    			HS.add(i);
    			for(int j=i; j<3000; j+=i) a[j] =1;
    		}
    	}
    }
    
    
}
