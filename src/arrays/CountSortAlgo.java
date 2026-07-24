package arrays;

import java.util.Arrays;

public class CountSortAlgo {
    static void countSort(int[] arr){
        // Step 1: Find the max
        int k = arr[0]; // 1st element to be the max
        for (int i=1; i< arr.length; i++){
            if (arr[i] > k) k = arr[i];
        }
        // Step 2: Count Array 0 to max
        int[] count = new int[k+1];
        // Step 3: Frequency of all the elements
        for (int i=0; i< arr.length; i++){
            count[arr[i]]++;
        }
        // Step 4: Cumulative Count [curr = curr + prev]
        for (int i=1; i<=k; i++){
            count[i] += count[i-1];
        }
        // Step 4: Output array
        int[] output = new int[arr.length];
        // Step 6: Start from the end of the array
        for (int i= arr.length-1; i>=0; i--){
            output[--count[arr[i]]] = arr[i];
        }
        System.out.println(Arrays.toString(output));
    }
    public static void main(String[] args) {
        int[] arr = {3,4,6,1,4,3,2,3,1};
        countSort(arr);
    }
}
