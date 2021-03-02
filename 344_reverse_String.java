class Solution {
    public void reverseString(char[] s) {
        
        int arrLength = s.length;
        int j = arrLength-1;
        
        for(int i=0; i<arrLength; i++){
            
            if(i<j){
                char tmp = s[i];
                s[i] = s[j];
                s[j] = tmp;
                j--;
            }
        }
    }
}
