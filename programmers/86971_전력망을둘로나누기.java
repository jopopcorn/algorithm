import java.util.*;

class Solution {
    public static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    public int solution(int n, int[][] wires) {
        int answer = n-1;
        
        for(int i=0; i<=n; i++){
            list.add(new ArrayList<>());
        }
        
        for(int i=0; i<n-1; i++){
            list.get(wires[i][0]).add(wires[i][1]);
            list.get(wires[i][1]).add(wires[i][0]);
        }
        
        for(int i=0; i<n-1; i++){
            int resultAToB = bfs(wires[i][0], wires[i][1], n);
            int resultBToA = bfs(wires[i][1], wires[i][0], n);
            answer = Math.min(answer, Math.abs(resultAToB - resultBToA));
        }
        
        return answer;
    }
    
    public int bfs(int nodeA, int nodeB, int n){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n+1];
        
        int count = 0;
        
        queue.add(nodeA);
        visited[nodeA] = true;
        
        while(!queue.isEmpty()){
            int currentNode = queue.poll();
            count++;
            
            for(int i=0; i<list.get(currentNode).size(); i++){
                int nextNode = list.get(currentNode).get(i);
                if(visited[nextNode] || nextNode == nodeB) continue;
                queue.add(nextNode);
                visited[nextNode] = true;
            }
        }
        
        return count;
    }
}
