class Solution {
    public int[] ascendingSquares(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int index = n - 1;

        while (left <= right) {
            int leftSquare = arr[left] * arr[left];
            int rightSquare = arr[right] * arr[right];

            if (leftSquare > rightSquare) {
                result[index] = leftSquare;
                left++;
            } else {
                result[index] = rightSquare;
                right--;
            }
            index--;
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] result1 = solution.ascendingSquares(new int[] {-4, -2, 1, 3});
        int[] result2 = solution.ascendingSquares(new int[] {-6, -5, -5});
        int[] result3 = solution.ascendingSquares(new int[] {1, 2, 3});

        System.out.println(java.util.Arrays.toString(result1)); // Output: [1, 4, 9, 16]
        System.out.println(java.util.Arrays.toString(result2)); // Output: [25, 25, 36]
        System.out.println(java.util.Arrays.toString(result3)); // Output: [1, 4, 9]
    }
}
