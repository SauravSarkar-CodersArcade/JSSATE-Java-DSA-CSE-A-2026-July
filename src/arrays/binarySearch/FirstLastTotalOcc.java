package arrays.binarySearch;
public class FirstLastTotalOcc {
    static int firstOccurrence(int[] arr, int key){
        int ans = -1;
        int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if (arr[mid] == key){
                // Store the ans
                // Move to extreme left for first occ
                ans = mid;
                e = mid -1;
            } else if (arr[mid] > key) {
                e = mid - 1;
            }else {
                s = mid + 1;
            }
        }
        return ans;
    }
    static int lastOccurrence(int[] arr, int key){
        int ans = -1;
        int s = 0;
        int e = arr.length - 1;
        while (s <= e){
            int mid = s + (e-s)/2;
            if (arr[mid] == key){
                // Store the ans
                // Move to extreme right for last occ
                ans = mid;
                s = mid + 1;
            } else if (arr[mid] > key) {
                e = mid - 1;
            }else {
                s = mid + 1;
            }
        }
        return ans;
    }
    static int totalOccurrence(int[] arr, int key){
        int fo = firstOccurrence(arr,key);
        int lo = lastOccurrence(arr, key);
        return (lo - fo + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,3,3,4,5,6};
        System.out.println("FO: " +
                firstOccurrence(arr, 3));
        System.out.println("LO: " +
                lastOccurrence(arr, 3));
        System.out.println("TO: " +
                totalOccurrence(arr, 3));
    }
}
