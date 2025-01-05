public public class Solution1 {

    public static int[] columnMajorTraversal(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return new int[0]; // Return an empty array if the input is empty
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] result = new int[rows * cols];

        int index = 0;

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                result[index++] = matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{3, 2, 1, 7}, {0, 6, 3, 2}};
        int[][] matrix3 = {{1}};

        printArray(columnMajorTraversal(matrix1)); // Output: 1 4 7 2 5 8 3 6 9
        printArray(columnMajorTraversal(matrix2)); // Output: 3 0 2 6 1 3 7 2
        printArray(columnMajorTraversal(matrix3)); // Output: 1
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

}
    

