import java.util.*;

class MergeOverlappingIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        List<int[]> list = new ArrayList<>();
        int index = 0;
        list.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            int[] arr = list.get(index);
            if(arr[1] >= intervals[i][0] ){
                int start = Math.min(arr[0],intervals[i][0]);
                int end = Math.max(arr[1],intervals[i][1]);
                list.set(index,new int[]{start,end});
            }else{
                list.add(intervals[i]);
                index++;
            }
        }
        return list.toArray(new int[0][]);
    }
}