import java.util.ArrayList;
import java.util.Collections;

class Champion implements Comparable<Champion> {
	int hp;
	int mp;
	
	Champion(int hp, int mp) {
		this.hp = hp;
		this.mp = mp;
	}

	@Override
	public int compareTo(Champion o) {
		if(this.hp == o.hp) return this.mp - o.mp;
		else return this.hp - o.hp;
	}
}

class Solution {
	public static void main(String[] args) {
		ArrayList<Champion> champ = new ArrayList<>();
		
		champ.add(new Champion(10,50));
		champ.add(new Champion(5,20));
		champ.add(new Champion(30,20));
		champ.add(new Champion(100,0));
		champ.add(new Champion(60,40));
		champ.add(new Champion(60,30));
		
		for(Champion x : champ) System.out.print(x.hp + " " + x.mp + "  ");
		System.out.println();
		
		Collections.sort(champ);
		
		for(Champion x : champ) System.out.print(x.hp + " " + x.mp + "  ");
	}
}
