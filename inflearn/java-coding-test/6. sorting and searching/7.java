import java.util.ArrayList;
import java.util.Collections;

// By using Comparable interface, we can sort user-defined class instances in the list.
class Point implements Comparable<Point> {
	int x;
	int y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public int compareTo(Point o) {
		if(this.x == o.x) return this.y - o.y;  // Ascend
		else return this.x - o.x;
	}
}

class Solution {
	public static void main(String[] args) {
		Point pt1 = new Point(0,0);
		Point pt2 = new Point(3,4);
		Point pt3 = new Point(1,1);
		Point pt4 = new Point(1,0);
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(pt1);
		list.add(pt2);
		list.add(pt3);
		list.add(pt4);

		System.out.println("<Before sorting>");
		for(Point p : list) System.out.print(p.x + " " + p.y + " ");
		System.out.println();
		System.out.println("<After sorting>");
		Collections.sort(list);
		for(Point p : list) System.out.print(p.x + " " + p.y + " ");
	}
}
