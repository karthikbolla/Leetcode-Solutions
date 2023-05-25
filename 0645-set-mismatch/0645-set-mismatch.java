class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr={-1,-1};
        int i=0;
        while(i<nums.length){
            int c=nums[i]-1;
            if(nums[i]!=nums[c]){
                int temp=nums[i];
                nums[i]=nums[c];
                nums[c]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                arr[0]=nums[j];
                arr[1]=j+1;
                break;
            }
        }
        return arr;
    }
}