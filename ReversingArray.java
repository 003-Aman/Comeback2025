//BRUTE FORCE METHOD
public void reverse(char[] arr){
    //create array named temp to store reverse
    char[] temp = new char[arr.length];

    int lastIndex =arr.length -1;
    //traverse arr in reverse direction
    //and copy data to temp

    for(int i=lastIndex; i>=0; i--)
    {temp[lastIndex-i]=arr[i];}

    //traverse temp in forward direction and copy data to arr
    for(int i=0; i<=lastIndex; i++){
        arr[i]=temp[i];
    }
}

//TWO POINTER METHOD
public void reverse(int[]arr){
    //initialize left and right pointers
    //to some initial values 0 and last index
    int left =0;
    int right =arr.length -1;
   
    //loop until left and right meet
    while(left<right){
        //swap the characters pointed by the left and right pointers
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;

        //move both pointers 1 step towards each other
        left++;
        right--;
    }
}

class Solution {
    public void flipCharacters(char[] arr) {
        int left = 0;           // Start pointer
        int right = arr.length - 1;  // End pointer

        while (left < right) {
            // Swap the characters at left and right pointers
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers towards each other
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        char[] arr1 = {'a', 'e', 'i', 'o', 'u'};
        solution.flipCharacters(arr1);
        System.out.println(java.util.Arrays.toString(arr1)); // Output: [u, o, i, e, a]

        char[] arr2 = {'a', 'b', 'c', 'd', 'e'};
        solution.flipCharacters(arr2);
        System.out.println(java.util.Arrays.toString(arr2)); // Output: [e, d, c, b, a]

        char[] arr3 = {};
        solution.flipCharacters(arr3);
        System.out.println(java.util.Arrays.toString(arr3)); // Output: []
    }
}
