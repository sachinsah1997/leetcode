class Solution {
    public void nextPermutation(int[] nums) {
        
        int idx = -1;
        int arrLength = nums.length;
        
        for(int i=arrLength-1; i>0; i--){
                
            if(nums[i]>nums[i-1]){
                idx = i;
                break;
            }
        }
       // System.out.println(idx);
        
        if(idx == -1){
            Arrays.sort(nums);
        }else{
            int greaterThanIdx = idx;
            for(int i = idx; i<arrLength; i++){
                
                if(nums[i]>nums[idx-1] && nums[i]<= nums[greaterThanIdx]){
                    greaterThanIdx = i;
                }
            }
            int temp = nums[idx-1];
            nums[idx-1] = nums[greaterThanIdx];
            nums[greaterThanIdx] = temp;
            Arrays.sort(nums, idx, arrLength);
        }
        
    }
}
