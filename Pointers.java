import java.util.List;

public class Pointers {
    
}
public static void twoPointer(List<Integer>arr){
    int left =0;
    int right =arr.size()-1;

    while(left<right){

        if(shouldIncreaseLeft()){
            left+=increment;

        }
        if (shouldDecreaseRight()){
            right-=decrement;
        }
    }
}
