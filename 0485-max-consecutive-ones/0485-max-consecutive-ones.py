class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        m=0
        c=0
        for i in range(len(nums)):
            if(nums[i]!=0):
                c=c+1
            else:
                if(c>m):
                    m=c
                c=0
        if(c>m):
            m=c
        return m