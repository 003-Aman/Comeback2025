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