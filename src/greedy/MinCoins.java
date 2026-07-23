package greedy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class MinCoins {
    static void findMinCoins(List<Integer> coins, int V){
        List<Integer> result = new ArrayList<>();
        // If array is not sorted, sort it first
        // Collections.sort(coins);
        //Arrays.sort(coins);
        // Last to first -> largest to smallest
        for (int i=coins.size()-1; i>=0; i--){
            while (V >= coins.get(i)){
                V -= coins.get(i);
                result.add(coins.get(i));
            }
        }
        System.out.println("Number of coins: " + result.size());
        System.out.println("Coins selected: ");
        for (int x : result){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        List<Integer> coins = Arrays.
                asList(1,2,5,10,20,50,100,200,500,1000);
        int V1 = 91;
        int V2 = 31;
        findMinCoins(coins, V1);
        findMinCoins(coins, V2);
    }
}
