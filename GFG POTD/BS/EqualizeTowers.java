//Approach: Ternary Search(2 mids approach)
//Link:https://www.geeksforgeeks.org/problems/equalize-the-towers2804/1
import java.util.*;
class EqualizeTowers {
    public int minCost(int[] heights, int[] cost) {
        int low = Arrays.stream(heights).min().getAsInt();
        int high = Arrays.stream(heights).max().getAsInt();
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid1 = low + (high-low)/3;
            int mid2 = high - (high-low)/3;
            
            int cost1 = getCost(heights,cost,mid1);
            int cost2 = getCost(heights,cost,mid2);
            
            ans = Math.min(ans,Math.min(cost1,cost2));
            
            if(cost1<cost2){
                high = mid2 -1;
            }else{
                low = mid1 + 1;
            }
        }
        return ans;
    }
    public static int getCost(int[] heights, int[] cost, int h){
        int sum = 0;
        for(int i=0;i<heights.length;i++){
            sum += Math.abs(heights[i]-h)*cost[i];
        }
        return sum;
    }
}
