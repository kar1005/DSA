import java.util.ArrayList;
import java.util.List;
// LeetCode Problem: https://leetcode.com/problems/subsets/
//Time Complexity: O(2^n * n)
//Space Complexity: O(2^n * n) for storing all subsets
class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int subsets = 1 << n;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<subsets;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<n;j++){
                if((i & (1<<j))>0)
                    list.add(nums[j]);
            }
            ans.add(list);
        }
        return ans;
    }
}