class Solution {
    public void setZeroes(int[][] matrix) {
    //    int m = matrix.length;
    //     int n = matrix[0].length;
    //     // Step 1: Find all 0s
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (matrix[i][j] == 0) {
    //                 // Make entire row -1
    //                 for (int col = 0; col < n; col++) {
    //                     if (matrix[i][col] != 0) {
    //                         matrix[i][col] = -1;
    //                     }
    //                 }

    //                 // Make entire column -1
    //                 for (int row = 0; row < m; row++) {
    //                     if (matrix[row][j] != 0) {
    //                         matrix[row][j] = -1;
    //                     }
    //                 }
    //             }
    //         }
    //     }
    //     // Step 2: Convert all -1 into 0
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (matrix[i][j] == -1) {
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
        int m = matrix.length;
        int n = matrix[0].length;

        int[] row = new int[m];
        int[] col = new int[n];

        // Step 1: Find all 0s
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        // Step 2: Make marked rows and columns 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

    }
}