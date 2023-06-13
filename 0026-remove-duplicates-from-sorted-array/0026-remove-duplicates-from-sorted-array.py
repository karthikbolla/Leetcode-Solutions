class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        val=1
        for i in range(len(nums)-1):
            if(nums[i]!=nums[i+1]):
                nums[val]=nums[i+1]
                val=val+1
        return len(set(nums))