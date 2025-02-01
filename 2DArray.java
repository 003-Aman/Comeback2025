public class 2DArray {
    //row major traversal
    char[][] letters = {{'A','a'},{'B','b'},{'C','c'};

    for(int i=0;i<letters.length;i++){
        for(int j=0;j<letters[0].length;j++){
            System.out.println(letters[i][j]);
        }
    }

    //column major traversal
    for(int i=0;i<letters[0].length;i++){
        for(int j=0;j<letters.length;j++){
            System.out.println(letters[j][i]);
        }
    }
    
}
