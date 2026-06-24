class Solution {
    public int findMin(int[] nums) {
        int min=nums[0];
        //int temp=0;
        for(int i:nums){
            if(i<min){
               // temp = min;
                min = i;
                //i = temp;
            }
        }
        return min;                
    }
}
