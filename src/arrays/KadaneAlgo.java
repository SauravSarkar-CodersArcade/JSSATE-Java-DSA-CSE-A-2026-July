package arrays;

public class KadaneAlgo {
    static int kadane(int[] arr){
        int cMax = arr[0];
        int gMax = arr[0];
        for (int i=1; i<arr.length; i++){
            cMax = Math.max(arr[i], cMax + arr[i]);
            gMax = Math.max(cMax, gMax);
        }
        return gMax;
    }
    public static void main(String[] args) {
        int[] arr1 = {5,-8,1,2,-1,4};
        System.out.println("MSA: " + kadane(arr1));
        int[] arr2 = {-6,-5,-4,-3,-2,-1,0};
        System.out.println("MSA: " + kadane(arr2));
    }
}
