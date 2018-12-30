package leetcode.array;

public class ToeplitzMatrix {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        boolean isToeplitzMatrix = true;
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length -1; j++) {
                try {

                    if (matrix[i][j] != matrix[i + 1][j + 1]) {
                        isToeplitzMatrix = false;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    return false;
                }
            }
        }
        int[] ints = new int[100];
        return isToeplitzMatrix;
    }
}
