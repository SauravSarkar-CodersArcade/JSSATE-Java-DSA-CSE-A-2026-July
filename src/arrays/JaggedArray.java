package arrays;
public class JaggedArray {
    public static void main(String[] args) {
        // 2D array is an array of arrays
        // A 2D array with unequal row-lengths is a Jagged Array
        int[][] twoD = {{1,2,3},
                        {4,5,6,7},
                        {7,8,9,0,1}};
        for ( int r = 0; r< twoD.length; r++){ // 0-2
            for (int c=0; c<twoD[r].length; c++){
                System.out.print(twoD[r][c] + " ");
            }
            System.out.println();
        }
        // for each loop - enhanced for loop
        for (int[] row : twoD){
            for (int x : row){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        char[][] languages = {{'J','a','v','a'},
                              {'C','+','+'},
                              {'S','Q','L'}};
        for (char[] word : languages){
            for (char c : word){
                System.out.print(c + " ");
            }
            System.out.println();
        }












    }
}
