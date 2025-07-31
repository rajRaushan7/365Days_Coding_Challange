
public class RatInMaze {

    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };

        int n = maze.length;
        boolean[][] visited = new boolean[n][n];
        System.out.println("All possible paths:");
        solveMaze(maze, visited, 0, 0, "", n);
    }

    public static void solveMaze(int[][] maze, boolean[][] visited, int row, int col, String path, int n) {
        if (row == n - 1 && col == n - 1) {
            System.out.println("Path: " + path);
            return;
        }

        // Boundary and block checks
        if (row < 0 || col < 0 || row >= n || col >= n || visited[row][col] || maze[row][col] == 0)
            return;

        visited[row][col] = true;

        // Move Down
        solveMaze(maze, visited, row + 1, col, path + "D", n);
        // Move Right
        solveMaze(maze, visited, row, col + 1, path + "R", n);

        visited[row][col] = false; // backtrack
    }
}