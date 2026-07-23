package arrays;
import java.util.HashMap;
public class FreqCount {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,3,4,4,4,1};
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr){
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        System.out.println(freqMap);
        System.out.println("No of 4's: " + freqMap.get(4)  );

    }
}
