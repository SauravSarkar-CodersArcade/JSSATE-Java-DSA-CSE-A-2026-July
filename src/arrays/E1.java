package arrays;
public class E1 {
    public static void printArray(int[] arr){
        for (int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        printArray(arr);
        printArray(new int[]{1,2,3,4,5}); // Anonymous Array
    }
}
