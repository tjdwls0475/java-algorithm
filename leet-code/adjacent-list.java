import java.util.ArrayList;

class Solution {
    static int cnt = 0;
    
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        int[] answer = new int[n];
        ArrayList<ArrayList<Integer> > adjList = new ArrayList<>(n);
        for(int i=0; i<n; i++) {
            adjList.add(new ArrayList<Integer>());
            answer[i]++;
        }
        for(int[] edge: edges) {
            addEdge(adjList, edge[0], edge[1]);
        }
        for(int i=0; i<n; i++) {
            DFS(answer, adjList, i, labels, labels.charAt(i));
            answer[i] += cnt;
            cnt = 0;
            //for(int j=0; j<adjList.get(i).size(); j++) {
                //if(labels.charAt(adjList.get(i).get(j)) == labels.charAt(i)) answer[i]++;
            //}
        }
        
        return answer;
    }
    
    static void addEdge(ArrayList<ArrayList<Integer> > adjList, int u, int v) {
        adjList.get(u).add(v);
    }
    
    static void DFS(int[] answer, ArrayList<ArrayList<Integer> > adjList, int i, String labels, char l) {
        if(adjList.get(i).size() == 0) return;
        else {
            for(int k=0; k<adjList.get(i).size(); k++) {
                DFS(answer, adjList, adjList.get(i).get(k), labels, l);
                if(labels.charAt(adjList.get(i).get(k)) == l) {
                    cnt++; 
                }
            }
        }
    }
}
