import java.util.Arrays;
class KokoEatingBanana {
    public int kokoEat(int[] arr, int k) {
        int low = 1;
        int high = Arrays.stream(arr).max().getAsInt();
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isPossible(arr,k,mid)){
                ans = mid;
                high = mid - 1;
            }else
                low = mid + 1;
        }
        return ans;
    }
    public static boolean isPossible(int arr[],int k,int num){
        int total = 0;
        for(int i=0;i<arr.length;i++){
            total += (int)Math.ceil((double)arr[i]/num);
        }
        if(total<=k)
            return true;
        return false;
    }
}
