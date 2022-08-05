import java.util.ArrayList;
import java.util.HashMap;

class Solution {
	public static void main(String[] args) {
		Solution T = new Solution();
		int servers =2;
		boolean sticky = true;
		int[] requests = new int[] {1,1,2,2};
		System.out.print(T.solution(servers, sticky, requests)[0].get(0));
		System.out.print(T.solution(servers, sticky, requests)[0].get(1));
		System.out.print(T.solution(servers, sticky, requests)[1].get(0));
		System.out.print(T.solution(servers, sticky, requests)[1].get(1));
	}
	
    public ArrayList<Integer>[] solution(int servers, boolean sticky, int[] requests) {
    	ArrayList<Integer>[] arr = new ArrayList[servers];
        HashMap<Integer, Integer> HM = new HashMap<>();
        
        for(int i=0; i<servers; i++) arr[i] = new ArrayList<Integer>();
        
        int cnt = 0;
        
        if(sticky) {
        	for(int i=0; i<requests.length; i++) {
        		if(HM.containsKey(requests[i]))	{
        			arr[HM.get(requests[i])].add(requests[i]);
        		}
        		else {
        			cnt = cnt % servers;
        			arr[cnt].add(requests[i]);
        			HM.put(requests[i], cnt);
        			cnt++;
        		}
        	}
        }
        else {
            for(int i=0; i<requests.length; i++) {
                cnt = cnt % servers;
                arr[cnt].add(requests[i]);
                cnt++;
            }
        }
        return arr;
    }
}
