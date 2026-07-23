package Backtracking;

import java.util.Scanner;

public class RatInAMaze {
    static boolean isPathSafe(int[][] arr, int x, int y, int n){
        return (x < n && y < n && arr[x][y] == 1);
    }
    static boolean ratInMaze(int[][] arr, int x, int y, int n,
                             int[][] resultant){
        // Base Case -> What if the rat has reached the dest
        if (x == n-1 && y == n-1){
            resultant[x][y] = 1;
            return true;
        }
        // Check whether the rat can stand at curr pos
        if (isPathSafe(arr,x,y,n)){
            resultant[x][y] = 1;
            // Move forward to find a path
            if (ratInMaze(arr,x+1,y,n,resultant)){
                return true;
            }
            // Move downward to check if path exists
            if (ratInMaze(arr,x,y+1, n, resultant)){
                return true;
            }
            // We couldn't find a path, so we backtrack
            resultant[x][y] = 0;
            return false;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        // Input Array
        int[][] arr = new int[n][n]; // Maze
        System.out.println("Enter the Maze Elements (0 or 1):");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // Initially the resultant array will be all zeroes
        int[][] resultant = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                resultant[i][j] = 0;
            }
        }
        if (ratInMaze(arr,0,0,n,resultant)){
            // if true, we have a path, print the path
             for (int i = 0; i<n; i++){
                 for (int j=0; j<n; j++){
                     System.out.print(resultant[i][j] + " ");
                 }
                 System.out.println();
             }
        }else {
            System.out.println("No path for the rat exists.");
        }

    }
}
