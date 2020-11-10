package Arrays;

public class RotateMatrix {
    boolean rotateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length)
            return false;
        int n = matrix.length;

        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = first - layer - 1;
            for (int i = first; i < last; i++) {
                int top = matrix[first][i];

                // left to top
                matrix[first][i] = matrix[last - i - first][first];

                // bottom to left
                matrix[last - i - first][first] = matrix[last][last - i - first];

                // right to bottom
                matrix[last][last - i - first] = matrix[i][last];

                // top to right
                matrix[i][last] = top;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6, }, { 7, 8, 9 } };
        System.out.println(new RotateMatrix().rotateMatrix(matrix));

    }
}
