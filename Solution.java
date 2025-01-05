/*Given an NxM matrix, write a function to perform a row-major traversal on this matrix and return the traversed path.

In row-major order, the consecutive elements of a row reside next to each other
Example 1
Input: matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
Explanation: Above is the row-major traversal of the given matrix
Example 2
Input: matrix = [[3, 2,1, 7], [0, 6, 3, 2]]
Output: [3, 2, 1, 7, 0, 6, 3, 2]
Explanation: Above is the row-major traversal of the given matrix
Example 3
Input: matrix = [[1]]
Output: [1]
Explanation: Above is the row-major traversal of the given matrix */

public class Solution {
    public static int[] rowMajorTraversal(int[][]matrix){
        if(matrix.length ==0|| matrix[0].length ==0){
            return new int[0];//return an empty array if the input is empty
        }
        int[] result = new int[matrix.length * matrix[0].length];
        int index =0;
        for(int[]row:matrix){
            for(int element:row){
                result[index++] = element;
            }
        }
        return result;
    }
    public static void main(String[]args){
        int[][] emptyMatrix1 = new int[0][0];
        int[][] emptyMatrix2 ={{},{}};

        printArray(rowMajorTraversal(emptyMatrix1));
        printArray(rowMajorTraversal(emptyMatrix2));
    }
    private static void printArray(int[] array){
        for(int element:array){
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
}
