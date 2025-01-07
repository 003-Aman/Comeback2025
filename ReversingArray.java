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