public static void main(String[] args) {
    int numbers[] = new int[5];
    numbers[0] = 10;
    //OR WE CAN JUST
    int numbers[] = {10, 20, 30, 40, 50};

    //traversal
    String names[] = {"Aman", "Bman", "Cman", "Dman"};
    for(int i = 0; i < names.length; i++){
        System.out.println(names[i]);
    }
    //or the simpler and better traversal would be 
    for(String name : names){
        System.out.println(name);
    }
    }
}
//multidimensional arrays
public static void main(String[] args) {
int[][] 2darray;
int[][][] 3darray;

    int 2darray[][] ={{1,2,3},{4,5,6}};
    int 3darray[][][]={{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};



}

//traversal at multidimensitonal arrays
//this is important because ive always had a hard time understanding how this works but lets give it our best
public class Main {
    public static void main(String[] args) {
        // Initializing a 2D array
        int[][] numbers2d = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int i = 0; i < numbers2d.length; i++) {
            for (int j = 0; j < numbers2d[i].length; j++) {
                System.out.println("Value at " + i + "," + j + " : " + numbers2d[i][j]);
            }
        }
    }
}
