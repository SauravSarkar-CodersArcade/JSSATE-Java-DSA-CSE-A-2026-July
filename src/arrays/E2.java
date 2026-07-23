package arrays;
import java.util.Arrays;
// Copying an array into another array
public class E2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = new int[arr1.length];
        for (int i=0; i< arr1.length; i++){
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));
        int[] arr3 = new int[arr2.length];
        System.arraycopy(arr2, 0, arr3, 0, arr2.length);
        System.out.println(Arrays.toString(arr3));
        int[] arr4 = arr3.clone();
        System.out.println(Arrays.toString(arr4));
    }
}
