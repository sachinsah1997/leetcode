class Solution {
    public int[][] merge(int[][] intervals) {
        
            
        Arrays.sort(intervals, (a,b)-> Integer.compare(a[0],b[0]));
        int arrLength = intervals.length;
        
        if(arrLength<=1){
            return intervals;
        }
        
        ArrayList<int[]> al = new ArrayList<>();      
        int last[] = intervals[0];
        for(int i=1; i<arrLength; i++){
            
            if(intervals[i][0]>last[1]){
                al.add(last);
                last = intervals[i];    
            }else{
                last[1] = Math.max(last[1], intervals[i][1]);
            }
        }
        al.add(last);
                    
     return al.toArray(new int[al.size()][]);   
    }
}
