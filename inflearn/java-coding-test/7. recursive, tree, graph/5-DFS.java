// 이번 시간에는 DFS(Depth First Search) 알고리즘에 대해 알아보겠습니다. 'DFS'란 '트리' 또는 '그래프' 자료구조를 순회하고 탐색하기 위한 알고리즘입니다.
// 이번에는 java로 간단한 '이진 트리' 클래스와 이진 트리 객체를 순회하고 탐색하기 위한 'DFS' 메서드를 구현해보겠습니다.
// DFS 연습을 위한 이진 트리를 만들어봅니다.
// Node 클래스를 보면 알 수 있듯이, 각 Node 객체는 정수형 데이터와 두 개의 자식 Node 객체를 가집니다.
// 마지막으로 DFS 메서드는 Node 객체가 null이면 그냥 return하고, null이 아니면 Node 객체에 저장된 정수형 값을 출력합니다.
// DFS의 순회 방식에는 '전위 순회', '중위 순회', '후위 순회' 세 가지가 있는데 아래는 '전위 순회'입니다.

class Node {
	int data;
	Node lt, rt;
	
	public Node(int value) {
		this.data = value;
		lt = null;
		rt = null;
	}
}

class Solution {
	Node root;
	
	public static void main(String[] args) {
		Solution tree = new Solution();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
	}
	
	private void DFS(Node root) {
		if (root == null) return;
		
		System.out.print(root.data + " ");
		DFS(root.lt);
		DFS(root.rt);
		
	}
}
