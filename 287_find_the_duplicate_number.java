class Solution {
    public int findDuplicate(int[] nums) {
        
        int index=0;
        int arrLength = nums.length;
        for(int i=0; i<arrLength; i++){
            
            index = Math.abs(nums[i])-1; 
            if(nums[index]<0){
                return index+1;
            }else{
                nums[index] = -(nums[index]); 
            }
        }
        return 0;
    }
}a
