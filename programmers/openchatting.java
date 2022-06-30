package progammers2;

import java.util.*;

public class openchatting {
	
	public ArrayList<String> solution(String[] record) {
		ArrayList<String> answer = new ArrayList<>();
		HashMap<String, String> HM = new HashMap<>();
		
		for (String x : record) {
			String[] a = x.split("\\s");
			if (a[0].equals("Enter") || a[0].equals("Change")) {
				HM.put(a[1], a[2]);
			}
		}
		
		for (int i=0; i<record.length; i++) {
			String[] a = record[i].split("\\s");
			if (a[0].equals("Enter")) {
				answer.add(HM.get(a[1]) + "님이 들어왔습니다.");
			}
			else if (a[0].equals("Leave")) {
				answer.add(HM.get(a[1]) + "님이 나갔습니다.");
			}
		}
		
		for (String y : answer) {
			System.out.println(y);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		openchatting T = new openchatting();
		String[] c = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		T.solution(c);
	}

}
