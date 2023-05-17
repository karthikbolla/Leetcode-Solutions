class Solution {
    static int num(int[] nums,int target){
       int s=0;
       int e=nums.length-1;
        int a=nums.length;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]>=target){
                e=m-1;
                a=m;
            }
            else{
                s=m+1;
            }
        }
        return a;
    }
    public int[] searchRange(int[] nums, int target) {
        int l=num(nums,target);
        int h=num(nums,target+1)-1;
        int[] arr={l,h};
        int[] arr1={-1,-1};
        if(l<=h){
            return arr;
        }
        else{
            return arr1;
        }
    } 
}