import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Solution T = new Solution();
		
		int n = input.nextInt();
		int m = input.nextInt();
		int k = input.nextInt();
		String[] id_list = new String[n];
		String[] report = new String[m];
		
		for (int i=0; i<n; i++) {
			id_list[i] = input.next();
		}
		
		report[0] = input.nextLine();	// Do not use "nextLine" method after "nextInt" method.
		for (int i=0; i<m; i++) {
			report[i] = input.nextLine();
		}
		
		input.close();
		
		T.solution(id_list, report, k);
	}
}

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        int[] match_arr = new int[report.length];
        ArrayList<String> list = new ArrayList<String>();
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i=0; i<report.length; i++) {
        	for (int j=i+1; j<report.length; j++) {
        		if (report[i].equals(report[j])) {
        			match_arr[i]++;
        		}
        	}
        }
        
        for (int i=0; i<report.length; i++) {
        	if (match_arr[i]!=0) {
        		continue;
        	}
        	String[] y = report[i].split(" ");
        	map.put(y[1], map.getOrDefault(y[1], 0) + 1);
        }
        
        for (String x : id_list) {					// if the same person report again, the count is still 1.
        	if (map.containsKey(x)) {
        		if (map.get(x) >= k) {
        			list.add(x);
        		}
        	}
        }
        
        for (int i=0; i<report.length; i++) {
        	String[] y = report[i].split(" ");
        	if (match_arr[i]!=0) {
        		continue;
        	}
        	if (list.contains(y[1])) {
        		for (int z=0; z<id_list.length; z++) {
        			if (y[0].equals(id_list[z])) {
        				answer[z]++;
        				break;
        			}
        		}
        	}
        }
        
        //System.out.println(list);
        //System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}
