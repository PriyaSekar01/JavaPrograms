package StringBackage;

import java.util.ArrayList;
import java.util.List;

public class ModifyMatrix {

    static void modifyMatrix(int mat[][]) {
        int row = mat.length;
        int col = mat[0].length;

        List<int[]> onesPositions = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 1) {
                    onesPositions.add(new int[]{i, j});
                }
            }
        }
        for (int[] position : onesPositions) {
            int i = position[0];
            int j = position[1];

            if (i - 1 >= 0) mat[i - 1][j] = 0; // Top
            if (i + 1 < row) mat[i + 1][j] = 0; // Bottom
            if (j - 1 >= 0) mat[i][j - 1] = 0; // Left
            if (j + 1 < col) mat[i][j + 1] = 0; // Right
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 0},
                {0, 1, 1},
                {0, 0, 0}
        };

        modifyMatrix(mat);


        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    }