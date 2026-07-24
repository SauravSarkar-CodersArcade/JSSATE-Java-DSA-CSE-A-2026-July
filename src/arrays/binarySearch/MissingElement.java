package arrays.binarySearch;
public class MissingElement {
    static int missingElement(int[] arr){
        int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if (arr[mid] != mid+1){
                // Go left & do the checks
                if (mid == 0 || arr[mid-1] == mid){
                    return mid + 1;
                }
                e = mid - 1;
            }else if (arr[mid] == mid + 1){
                s = mid + 1;
            }
        }
        return arr.length + 1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,6,7,8};
        int[] arr2 = {1,2,3,4,5,6,7};
        System.out.println(missingElement(arr1));
        System.out.println(missingElement(arr2));
    }
}
