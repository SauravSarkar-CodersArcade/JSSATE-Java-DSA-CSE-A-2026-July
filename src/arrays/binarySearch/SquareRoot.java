package arrays.binarySearch;
public class SquareRoot {
    static int sqrt(int n){
        int ans = -1;
        int s = 0;
        int e = n; // Adjustment
        while (s <= e){
            int mid = s + (e-s)/2;
            int square = mid * mid;
            if (square > n){
                // Move left
                e = mid - 1;
            } else if (square < n) {
                // Store the mid in the ans & move right
                ans = mid;
                s = mid + 1;
            }else {
                return mid;
            }
        }
        return ans; // If not exact return approximate
    }
    public static void main(String[] args) {
        System.out.println(sqrt(36));
        System.out.println(sqrt(24));
        System.out.println(sqrt(37));
    }
}
