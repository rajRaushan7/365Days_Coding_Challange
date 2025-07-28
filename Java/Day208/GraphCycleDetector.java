import java.util.*;

public class GraphCycleDetector {

    public static void main(String[] args) {
        int n1 = 5;
        int[][] edges1 = {{0, 1}, {1, 2}, {2, 0}, {3, 4}};
        System.out.println("Cycle detected: " + hasCycle(n1, edges1));

        int n2 = 4;
        int[][] edges2 = {{0, 1}, {1, 2}, {2, 3}};
        System.out.println("Cycle detected: " + hasCycle(n2, edges2));
    }

    public static boolean hasCycle(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                if (bfsDetectCycle(i, graph, visited)) return true;
            }
        }

        return false;
    }

    public static boolean bfsDetectCycle(int start, List<List<Integer>> graph, boolean[] visited) {
        Queue<int[]> queue = new LinkedList<>(); // [node, parent]
        queue.offer(new int[]{start, -1});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int node = current[0], parent = current[1];

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(new int[]{neighbor, node});
                } else if (neighbor != parent) {
                    // Visited and not coming back to parent → cycle
                    return true;
                }
            }
        }

        return false;
    }
}