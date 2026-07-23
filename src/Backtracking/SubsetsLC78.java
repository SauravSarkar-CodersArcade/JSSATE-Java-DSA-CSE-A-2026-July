package Backtracking;
import java.util.ArrayList;
import java.util.List;
public class SubsetsLC78 {
    private  void solve(int[] nums, List<Integer> output, int index,
                       List<List<Integer>> ans){
        // Base case -> When i is out of list, I get one answer
        if (index >= nums.length){
            ans.add(new ArrayList<>(output));
            return;
        }
        // Exclude -> Skip that value & move to next
        solve(nums, output, index + 1, ans);
        // Include -> Take that value & move to next
        output.add(nums[index]);
        solve(nums,output, index+1, ans);
        output.remove(output.size()-1); // Backtracking
    }
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        int index = 0;
        solve(nums, output, index, ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        SubsetsLC78 obj = new SubsetsLC78();
        List<List<Integer>> result = obj.subsets(nums);
        for (List<Integer> subset : result){
            System.out.println(subset);
        }
    }
}
