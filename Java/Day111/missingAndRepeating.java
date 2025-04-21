class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len = grid.length * grid[0].length;
        int[] count = new int[len + 1]; // +1 because numbers go from 1 to len

        // Count occurrences of each number
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                count[grid[i][j]]++;
            }
        }

        int[] result = new int[2]; // [repeated, missing]
        for (int i = 1; i <= len; i++) {
            if (count[i] == 2) {
                result[0] = i; // repeated
            } else if (count[i] == 0) {
                result[1] = i; // missing
            }
        }

        return result;
    }
}