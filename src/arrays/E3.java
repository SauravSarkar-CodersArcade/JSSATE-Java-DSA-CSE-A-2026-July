package arrays;
// Varargs -> {It internally uses an array}
public class E3 {
    public static void display(int... arr){
        for (int num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        display(arr);
    }
}
