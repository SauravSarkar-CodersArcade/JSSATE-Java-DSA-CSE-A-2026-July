package arrays;
import java.util.Arrays;
public class Sort012 {
    public static void sort012(int[] arr){
        int c0 = 0, c1 = 0, c2 = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i] == 0){
                c0++;
            } else if (arr[i] == 1) {
                c1++;
            }else {
                c2++;
            }
        }
        // index variable to store the values
        int index = 0;
        while (c0 > 0){
            arr[index++] = 0;
            c0--;
        }
        while (c1 > 0){
            arr[index++] = 1;
            c1--;
        }
        while (c2 > 0){
            arr[index++] = 2;
            c2--;
        }
        // 3 while loops O(n) x 3 => O(n)
        // 3 variables - Space Complexity: O(1)
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,0,0};
        System.out.println(Arrays.toString(arr));
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}
